package com.pengfei.intern.service.impl;

import com.pengfei.intern.dao.*;
import com.pengfei.intern.domain.*;
import com.pengfei.intern.exception.HrException;
import com.pengfei.intern.service.MgrManager;
import com.pengfei.intern.vo.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

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
	@Autowired
	private TaskDao taskDao;
	@Autowired
	private JobDao jobDao;


	/**
	 * ����Ա��
	 * @param emp ������Ա��
	 * @param mgr Ա�������ľ���
	 */
	public void addEmp(Intern emp , String mgr)throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("���Ǿ����𣿻��㻹δ��¼��");
		}
		emp.setManager(m);
		empDao.save(emp);
	}

	/**
	 * ɾ��Ա��
	 * @param name Ա������
	 */
	public boolean delEmp(String name)throws HrException
	{
		empDao.deleteByName(name);
		return true;
	}

	/**
	 * ����Ա��
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
	 * ���ݾ��������еĲ����ϸ��¹���
	 * @param mgr ������Ա����
	 * @return �����ϸ��¹���
	 */
	public List<SalaryBean> getSalaryByMgr(String mgr)throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("���Ǿ����𣿻��㻹δ��¼��");
		}
		//��ѯ�þ����Ӧ��ȫ��Ա��
		Set<Intern> emps = m.getEmployees();
		//������Ȼû��Ա��
		if (emps == null || emps.size() < 1)
		{
			throw new HrException("���Ĳ���û��Ա��");
		}
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH , -1);
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
		String payMonth = sdf.format(c.getTime());
		List<SalaryBean> result = new ArrayList<SalaryBean>();
		//����������ÿ��Ա��
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
	* ���ݾ����ظò��ŵ�ȫ��Ա��
	* @param mgr ������
	* @return �����ȫ������
	*/
	public List<ItrBean> getEmpsByMgr(String mgr)
		throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("���Ǿ����𣿻��㻹δ��¼��");
		}
		//��ѯ�þ����Ӧ��ȫ��Ա��
		Set<Intern> emps = m.getEmployees();
		//������Ȼû��Ա��
		if (emps == null || emps.size() < 1)
		{
			throw new HrException("���Ĳ���û��Ա��");
		}
		//��װVO��
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
	 * ���ݾ����ظò��ŵ�û������������
	 * @param mgr ������
	 * @return �ò��ŵ�ȫ������
	 */
	public List<AppBean> getAppsByMgr(String mgr)throws HrException
	{
		Manager m = mgrDao.findByName(mgr);
		if (m == null)
		{
			throw new HrException("���Ǿ����𣿻��㻹δ��¼��");
		}
		//��ѯ�þ����Ӧ��ȫ��Ա��
		Set<Intern> emps = m.getEmployees();
		//������Ȼû��Ա��
		if (emps == null || emps.size() < 1)
		{
			throw new HrException("���Ĳ���û��Ա��");
		}
		//��װVO��
		List<AppBean> result = new ArrayList<AppBean>();
		for (Intern e : emps)
		{
			//�鿴��Ա����ȫ������
			List<Application> apps = appDao.findByEmp(e);
			if (apps != null && apps.size() > 0)
			{
				for (Application app : apps)
				{
					//ֻѡ��δ���������
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
	 * ��������
	 * @param appid ����ID
	 * @param mgrName ��������
	 * @param result �Ƿ�ͨ��
	 */
	public boolean check(int appid, String mgrName, boolean result, String reason)
	{
		Application app = appDao.get(Application.class , appid);
		CheckBack check = checkDao.getCheckByApp(app);
		if (check == null){
			check = new CheckBack();
			check.setApp(app);
		}
		Manager manager = mgrDao.findByName(mgrName);
		if (manager == null)
		{
			throw new HrException("���Ǿ����𣿻��㻹δ��¼��");
		}
		check.setManager(manager);
		check.setReason(reason);
		//ͬ��ͨ������
		if (result)
		{
			//����ͨ������
			check.setResult(true);

			//�޸�����Ϊ�Ѿ�����
			app.setResult(true);
			appDao.update(app);
			//Ϊ��ʱ������Ҫ�޸ĳ��ڵ�����
			Attend attend = app.getAttend();
			attend.setType(app.getType());
			attendDao.update(attend);
		}
		else
		{
			//û��ͨ������
			check.setResult(false);
			app.setResult(true);
			appDao.update(app);
		}
		//������������
		checkDao.update(check);
		return true;
	}

	@Override
	public boolean assignTask(String mgr,String title, String content, String deadline, String[] internList) {
		Manager manager = mgrDao.findByName(mgr);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		Task task = new Task(title,content,sdf.format(c.getTime()),deadline);
		task.setManager(manager);
		taskDao.save(task);
		for (String itr:
			 internList) {
			Job job = new Job(task,empDao.findByName(itr),0,false);
			jobDao.save(job);
		}
		return true;
	}

	@Override
	public List<TaskBean> getTasksByMgr(String manager) {
		Manager mgr = mgrDao.findByName(manager);
		List<Task> taskList = taskDao.getAllByManager(mgr);
		List<TaskBean> taskBeanList = new ArrayList<>();
		for (Task task :
				taskList) {
			TaskBean taskBean = new TaskBean(task.getTitle());

			List<Job> jobList = jobDao.getAllByTask(task);
			List<JobBean> jobBeanList = new ArrayList<>();
			for (Job job:
				 jobList) {
				JobBean jobBean = new JobBean(job.getId(),job.getGrade(),job.isFinished(),job.getIntern().getName());
				jobBeanList.add(jobBean);
			}
			taskBean.setJobBeanList(jobBeanList);
			taskBeanList.add(taskBean);
		}
		return taskBeanList;
	}

	@Override
	public boolean judgeJob(int job_id,int grade,boolean finished) {
		Job job = jobDao.get(Job.class,job_id);
		if (job != null){
			job.setGrade(grade);
			job.setFinished(finished);
			jobDao.update(job);
			return true;
		}
		return false;
	}
}
