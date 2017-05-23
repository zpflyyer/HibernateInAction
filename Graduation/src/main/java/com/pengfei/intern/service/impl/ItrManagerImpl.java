package com.pengfei.intern.service.impl;

import com.pengfei.intern.Helper.Helper;
import com.pengfei.intern.dao.*;
import com.pengfei.intern.domain.*;
import com.pengfei.intern.service.ItrManager;
import com.pengfei.intern.vo.*;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Setter
@Service("empManager")
public class ItrManagerImpl
	implements ItrManager
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
	@Autowired
	private JobDao jobDao;
	@Autowired
	private TaskDao taskDao;
	@Autowired
	private AdminDao adminDao;

	/**
	 * 以经理身份来验证登录
	 * @param mgr 登录的经理身份
	 * @return 登录后的身份确认:0为登录失败，1为登录emp 2为登录mgr
	 */
	public int validLogin(Manager mgr)
	{
		// 如果找到一个经理，以经理登录
		if (mgrDao.findByNameAndPass(mgr).size() >= 1)
		{
			return LOGIN_MGR;
		}
		// 如果找到普通员工，以普通员工登录
		else if (empDao.findByNameAndPass(mgr).size() >= 1)
		{
			return LOGIN_EMP;
		}
		else if (adminDao.findByNameAndPass(mgr).size() >= 1){
			return LOGIN_ADM;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}

	/**
	 * 自动打卡，周一到周五，早上7：00为每个员工插入旷工记录
	 */
	public void autoPunch()
	{
		System.out.println("自动插入旷工记录");
		List<Intern> emps = empDao.findAll(Intern.class);
		// 获取当前时间
		String dutyDay = new java.sql.Date(
			System.currentTimeMillis()).toString();
		for (Intern e : emps)
		{
			//如果已经有了出勤记录（请假，就不再为其自动插入出勤记录）
			if (!attendDao.findByEmpAndDutyDay(e,dutyDay).isEmpty()){
				continue;
			}
			// 获取旷工对应的出勤类型
			AttendType atype = typeDao.get(AttendType.class, 6);
			Attend a = new Attend();
			a.setDutyDay(dutyDay);
			a.setType(atype);
			// 如果当前时间是是早上，对应于上班打卡
			if (Calendar.getInstance()
					.get(Calendar.HOUR_OF_DAY) < AM_LIMIT) {
				// 上班打卡
				a.setCome(true);
			} else {
				// 下班打卡
				a.setCome(false);
			}
			a.setEmployee(e);
			attendDao.save(a);
		}
	}

	/**
	 * 自动结算工资，每月1号，结算上个月工资
	 */
	public void autoPay()
	{
		System.out.println("自动插入工资结算");
		List<Intern> emps = empDao.findAll(Intern.class);
		// 获取上个月时间
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -15);
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
		String payMonth = sdf.format(c.getTime());
		// 为每个员工计算上个月工资
		for (Intern e : emps)
		{

				Payment pay = new Payment();
				// 获取该员工的工资
				double amount = e.getSalary();
				// 获取该员工上个月的出勤记录
				List<Attend> attends = attendDao.findByEmpAndMonth(e, payMonth);
				// 用工资累积其出勤记录的工资
				for (Attend a : attends) {
					amount += a.getType().getAmerce();
				}
				// 添加工资结算
				pay.setPayMonth(payMonth);
				pay.setEmployee(e);
				pay.setAmount(amount);
				payDao.save(pay);

		}
	}

	/**
	 * 验证某个员工是否可打卡
	 * @param user 员工名
	 * @param dutyDay 日期
	 * @return 可打卡的类别
	 */
	public int validPunch(String user , String dutyDay)
	{
		// 不能查找到对应用户，返回无法打卡
		Intern emp = empDao.findByName(user);
		if (emp == null)
		{
			return NO_PUNCH;
		}
		// 找到员工当前的出勤记录
		List<Attend> attends = attendDao.findByEmpAndDutyDay(emp , dutyDay);
		// 系统没有为用户在当天插入空打卡记录，无法打卡
		if (attends == null || attends.size() <= 0)
		{
			return NO_PUNCH;
		}
		// 开始上班打卡
		else if (attends.size() == 1
			&& attends.get(0).isCome()
			&& attends.get(0).getPunchTime() == null)
		{
			return COME_PUNCH;
		}
		else if (attends.size() == 1
			&& attends.get(0).getPunchTime() == null)
		{
			return LEAVE_PUNCH;
		}
		else if (attends.size() == 2)
		{
			// 可以上班、下班打卡
			if (attends.get(0).getPunchTime() == null
				&& attends.get(1).getPunchTime() == null)
			{
				return BOTH_PUNCH;
			}
			// 可以下班打卡，一旦下午卡都打了，就不能再打上午卡了
			else if (attends.get(1).getPunchTime() == null)
			{
				return LEAVE_PUNCH;
			}
			else
			{
				return NO_PUNCH;
			}
		}
		return NO_PUNCH;
	}

	/**
	 * 打卡
	 * @param user 员工名
	 * @param dutyDay 打卡日期
	 * @param isCome 是否是上班打卡
	 * @return 打卡结果
	 */
	public int punch(String user , String dutyDay , boolean isCome)
	{
		Intern emp = empDao.findByName(user);
		if (emp == null)
		{
			return PUNCH_FAIL;
		}
		// 找到员工本次打卡对应的出勤记录
		Attend attend =
			attendDao.findByEmpAndDutyDayAndCome(emp , dutyDay , isCome);
		if (attend == null)
		{
			return PUNCH_FAIL;
		}
		// 已经打卡
		if (attend.getPunchTime() != null)
		{
			return PUNCHED;
		}
		System.out.println("============打卡==========");
		// 获取打卡时间
		int punchHour = Calendar.getInstance()
			.get(Calendar.HOUR_OF_DAY);
		attend.setPunchTime(new Date());
		// 上班打卡
		if (isCome)
		{
			// 9点之前算正常
			if (punchHour < COME_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 1));
			}
			// 9～11点之间算迟到
			else if (punchHour < LATE_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 4));
			}
			// 11点之后算旷工,无需理会
		}
		// 下班打卡
		else
		{
			// 18点之后算正常
			if (punchHour >= LEAVE_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 1));
			}
			// 16~18点之间算早退
			else if (punchHour >= EARLY_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 5));
			}
		}
		attendDao.update(attend);
		return PUNCH_SUCC;
	}

	/**
	 * 根据员工浏览自己的工资
	 * @param empName 员工名
	 * @return 该员工的工资列表
	 */
	public List<SalaryBean> empSalary(String empName)
	{
		// 获取当前员工
		Intern emp = empDao.findByName(empName);
		// 获取该员工的全部工资列表:注意，在1对多的关联中，让多的一端控制关联关系
		List<Payment> pays = payDao.findByEmp(emp);
		List<SalaryBean> result = new ArrayList<>();
		// 封装VO集合
		for (Payment p : pays )
		{
			SalaryBean salaryBean = new SalaryBean(p.getAmount(),p.getPayMonth(),emp.getSalary());
			List<Attend> attendList = attendDao.findByEmpAndMonth(emp,p.getPayMonth());
			for (Attend attend:
					attendList) {
				if (attend.getType().getId() == 2){
					salaryBean.setIssue_pay(salaryBean.getIssue_pay()+attend.getType().getAmerce());
				}
				else if (attend.getType().getId() == 3){
					salaryBean.setSick_pay(salaryBean.getSick_pay()+attend.getType().getAmerce());
				}
				else if (attend.getType().getId() == 4){
					salaryBean.setLate_pay(salaryBean.getLate_pay()+attend.getType().getAmerce());
				}
				else if (attend.getType().getId() == 5){
					salaryBean.setEarly_pay(salaryBean.getEarly_pay()+attend.getType().getAmerce());
				}
				else if (attend.getType().getId() == 6){
					salaryBean.setUnAttend_pay(salaryBean.getUnAttend_pay()+attend.getType().getAmerce());
				}
				else if (attend.getType().getId() == 7){
					salaryBean.setWork_pay(salaryBean.getWork_pay()+attend.getType().getAmerce());
				}
				else {}
			}
			result.add(salaryBean);
		}
		return result;
	}

	/**
	 * 员工查看自己的最近三天非正常打卡
	 * @param empName 员工名
	 * @return 该员工的最近三天的非正常打卡
	 */
	public List<AttendBean> unAttend(String empName)
	{
		// 找出正常上班的出勤类型
		AttendType type = typeDao.get(AttendType.class , 1);
		Intern emp = empDao.findByName(empName);
		// 找出非正常上班的出勤记录
		List<Attend> attends = attendDao.findByEmpUnAttend(emp, type);
		List<AttendBean> result = new ArrayList<>();
		// 封装VO集合
		for (Attend att : attends )
		{
			AttendBean attendBean = new AttendBean(att.getId() , att.getDutyDay()
					, att.getType().getName() , att.getPunchTime());

			Application app = appDao.findLatestByAtt(att);
			if (app != null){
				attendBean.setApp_type(app.getType().getName());
				attendBean.setApp_progress(app.isResult()?"已处理":"尚未处理");
				if(app.isResult()){
					//最新的申请记录相关的批复
					CheckBack cb = app.getCheck();
					attendBean.setGranted(cb.isResult()?"已同意":"被驳回");
					attendBean.setReason(cb.getReason());
				}
			}
			result.add(attendBean);
		}
		return result;
	}

	@Override
	public List<AttendBean> allAttendByName(String empName) {
		Intern itr = empDao.findByName(empName);
		List<Attend> attendList = attendDao.findByEmpAll(itr);
		List<AttendBean> result = new ArrayList<>();
		for (Attend att : attendList){
			result.add(new AttendBean(att.getId() ,  att.getDutyDay()
					,  att.getType().getName() , att.getPunchTime()));
		}
		return result;
	}

	/**
	 * 返回全部的出勤类别
	 * @return 全部的出勤类别
	 */
	public List<AttendType> getAllType()
	{
		return typeDao.findAll(AttendType.class);
	}

	/**
	 * 添加申请
	 * @param attId 申请的出勤ID
	 * @param typeId 申请的类型ID
	 * @param reason 申请的理由
	 * @return 添加的结果
	 */
	public boolean addApplication(int attId , int typeId
		, String reason)
	{
		System.out.println("--------------" + attId);
		System.out.println("~~~~" + typeId);
		System.out.println("~~~~" + reason);
		// 创建一个申请
		Application app = new Application();
		// 获取申请需要改变的出勤记录
		Attend attend = attendDao.get(Attend.class , attId);
		AttendType type = typeDao.get(AttendType.class , typeId);
		app.setAttend(attend);
		app.setType(type);
		if (reason != null)
		{
			app.setReason(reason);
		}
		System.out.println("====aaaaaaaaa====");
		appDao.save(app);
		return true;
	}

	@Override
	public List<JobBean> getJobByIntern(String itr) {
		Intern intern = empDao.findByName(itr);
		List<Job> jobList= jobDao.getAllByIntern(intern);
		List<JobBean> jobBeanList = new ArrayList<>();
		for (Job job :
				jobList) {
			Task task = job.getTask();
			JobBean jobBean = new JobBean(job.getId(),job.getGrade(),job.isFinished()
					, task.getTitle(),task.getContent(),task.getAssign_date(),task.getDeadline()
					,itr);
			jobBeanList.add(jobBean);
		}
		return jobBeanList;
	}

	@Override
	public boolean finishJob(int job_id, boolean finished) {
		Job job = jobDao.get(Job.class,job_id);
		job.setFinished(finished);
		jobDao.update(job);
		return true;
	}

	@Override
	@SneakyThrows
	public boolean askLeave(String from, String to, String itr, int type, String reason) {
		List<String> leaveList = Helper.getBetweenDates(from,to);
		Intern intern = empDao.findByName(itr);
		AttendType leaveType = typeDao.get(AttendType.class,type);
		for (String date:
			 leaveList) {
			Attend come_att = new Attend();
			come_att.setDutyDay(date);
			come_att.setCome(true);
			come_att.setEmployee(intern);
			come_att.setType(leaveType);

			Attend leave_att = new Attend();
			leave_att.setDutyDay(date);
			leave_att.setCome(false);
			leave_att.setEmployee(intern);
			leave_att.setType(leaveType);

			attendDao.save(come_att);
			attendDao.save(leave_att);
		}
		return false;
	}


}