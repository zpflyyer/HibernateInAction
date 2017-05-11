package com.pengfei.intern.service.impl;

import com.pengfei.intern.dao.*;
import com.pengfei.intern.domain.*;
import com.pengfei.intern.exception.HrException;
import com.pengfei.intern.service.MgrManager;
import com.pengfei.intern.vo.AppBean;
import com.pengfei.intern.vo.AttendBean;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.SalaryBean;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

@Setter
@Service
public class MgrManagerImpl
	implements MgrManager
{
	@Autowired
	private ApplicationDao appDao;
	@Autowired
	private AttendDao attendDao;
	@Autowired
	private AttendTypeDao typeDao;
	@Autowired
	private CheckBackDao checkDao;
	@Autowired
	private InternDao empDao;
	@Autowired
	private ManagerDao mgrDao;
	@Autowired
	private PaymentDao payDao;


	/**
	 * 新增员工
	 * @param emp 新增的员工
	 * @param mgr 员工所属的经理
	 */
	public void addEmp(Intern emp , String mgr)throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("您是经理吗？或你还未登录？");
		}
		emp.setManager(m);
		empDao.save(emp);
	}

	/**
	 * 删除员工
	 * @param name 员工姓名
	 */
	public boolean delEmp(String name)throws HrException
	{
		empDao.deleteByName(name);
		return true;
	}

	/**
	 * 更新员工
	 */
	@Override
	public Intern updEmp(String name, String pass, Double salary) throws HrException {
		Intern employee = empDao.findByName(name);
		if (employee!=null){
			employee.setPass(pass);
			employee.setSalary(salary);
			empDao.update(employee);
			return employee;
		}
		return null;
	}

	/**
	 * 根据经理返回所有的部门上个月工资
	 * @param mgr 新增的员工名
	 * @return 部门上个月工资
	 */
	public List<SalaryBean> getSalaryByMgr(String mgr)throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("您是经理吗？或你还未登录？");
		}
		//查询该经理对应的全部员工
		Set<Intern> emps = m.getEmployees();
		//部门依然没有员工
		if (emps == null || emps.size() < 1)
		{
			throw new HrException("您的部门没有员工");
		}
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH , -1);
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
		String payMonth = sdf.format(c.getTime());
		List<SalaryBean> result = new ArrayList<SalaryBean>();
		//遍历本部门每个员工
		for (Intern e : emps)
		{
			Payment p = payDao.findByMonthAndEmp(payMonth , e);
			if (p != null)
			{
				result.add(new SalaryBean(e.getName()
					, p.getAmount()));
			}
		}
		return result;
	}

	/**
	* 根据经理返回该部门的全部员工
	* @param mgr 经理名
	* @return 经理的全部下属
	*/
	public List<ItrBean> getEmpsByMgr(String mgr)
		throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("您是经理吗？或你还未登录？");
		}
		//查询该经理对应的全部员工
		Set<Intern> emps = m.getEmployees();
		//部门依然没有员工
		if (emps == null || emps.size() < 1)
		{
			throw new HrException("您的部门没有员工");
		}
		//封装VO集
		List<ItrBean> result = new ArrayList<ItrBean>();
		for (Intern e : emps)
		{
			List<AttendBean> attendBeans = new ArrayList<>();
			for (Attend a : attendDao.findByEmpAll(e)) {
				attendBeans.add(new AttendBean(a.getId(),a.getDutyDay(),a.getType().getName(),a.getPunchTime()));
			}
			result.add(new ItrBean(e.getName(),
					e.getPass(), e.getSalary(),attendBeans));

		}
		return result;
	}

	/**
	 * 根据经理返回该部门的没有批复的申请
	 * @param mgr 经理名
	 * @return 该部门的全部申请
	 */
	public List<AppBean> getAppsByMgr(String mgr)throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("您是经理吗？或你还未登录？");
		}
		//查询该经理对应的全部员工
		Set<Intern> emps = m.getEmployees();
		//部门依然没有员工
		if (emps == null || emps.size() < 1)
		{
			throw new HrException("您的部门没有员工");
		}
		//封装VO集
		List<AppBean> result = new ArrayList<AppBean>();
		for (Intern e : emps)
		{
			//查看该员工的全部申请
			List<Application> apps = appDao.findByEmp(e);
			if (apps != null && apps.size() > 0)
			{
				for (Application app : apps)
				{
					//只选择还未处理的申请
					if (app.isResult() == false)
					{
						Attend attend = app.getAttend();
						result.add(new AppBean(app.getId() ,
							e.getName(), attend.getDutyDay(),attend.getType().getName(),
							app.getType().getName(), app.getReason()));
					}
				}
			}
		}
		return result;
	}

	/**
	 * 处理申请
	 * @param appid 申请ID
	 * @param mgrName 经理名字
	 * @param result 是否通过
	 */
	public boolean check(int appid, String mgrName, boolean result, String reason)
	{
		Application app = appDao.get(Application.class , appid);
		CheckBack check = new CheckBack();
		check.setApp(app);
		Manager manager = mgrDao.findByName(mgrName);
		if (manager == null)
		{
			throw new HrException("您是经理吗？或你还未登录？");
		}
		check.setManager(manager);
		check.setReason(reason);
		//同意通过申请
		if (result)
		{
			//设置通过申请
			check.setResult(true);

			//修改申请为已经批复
			app.setResult(true);
			appDao.update(app);
			//为真时，还需要修改出勤的类型
			Attend attend = app.getAttend();
			attend.setType(app.getType());
			attendDao.update(attend);
		}
		else
		{
			//没有通过申请
			check.setResult(false);
			app.setResult(true);
			appDao.update(app);
		}
		//保存申请批复
		checkDao.save(check);
		return true;
	}
}
