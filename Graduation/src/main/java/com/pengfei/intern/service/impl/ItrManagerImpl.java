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
	 * �Ծ����������֤��¼
	 * @param mgr ��¼�ľ������
	 * @return ��¼������ȷ��:0Ϊ��¼ʧ�ܣ�1Ϊ��¼emp 2Ϊ��¼mgr
	 */
	public int validLogin(Manager mgr)
	{
		// ����ҵ�һ�������Ծ����¼
		if (mgrDao.findByNameAndPass(mgr).size() >= 1)
		{
			return LOGIN_MGR;
		}
		// ����ҵ���ͨԱ��������ͨԱ����¼
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
	 * �Զ��򿨣���һ�����壬����7��00Ϊÿ��Ա�����������¼
	 */
	public void autoPunch()
	{
		System.out.println("�Զ����������¼");
		List<Intern> emps = empDao.findAll(Intern.class);
		// ��ȡ��ǰʱ��
		String dutyDay = new java.sql.Date(
			System.currentTimeMillis()).toString();
		for (Intern e : emps)
		{
			//����Ѿ����˳��ڼ�¼����٣��Ͳ���Ϊ���Զ�������ڼ�¼��
			if (!attendDao.findByEmpAndDutyDay(e,dutyDay).isEmpty()){
				continue;
			}
			// ��ȡ������Ӧ�ĳ�������
			AttendType atype = typeDao.get(AttendType.class, 6);
			Attend a = new Attend();
			a.setDutyDay(dutyDay);
			a.setType(atype);
			// �����ǰʱ���������ϣ���Ӧ���ϰ��
			if (Calendar.getInstance()
					.get(Calendar.HOUR_OF_DAY) < AM_LIMIT) {
				// �ϰ��
				a.setCome(true);
			} else {
				// �°��
				a.setCome(false);
			}
			a.setEmployee(e);
			attendDao.save(a);
		}
	}

	/**
	 * �Զ����㹤�ʣ�ÿ��1�ţ������ϸ��¹���
	 */
	public void autoPay()
	{
		System.out.println("�Զ����빤�ʽ���");
		List<Intern> emps = empDao.findAll(Intern.class);
		// ��ȡ�ϸ���ʱ��
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -15);
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
		String payMonth = sdf.format(c.getTime());
		// Ϊÿ��Ա�������ϸ��¹���
		for (Intern e : emps)
		{

				Payment pay = new Payment();
				// ��ȡ��Ա���Ĺ���
				double amount = e.getSalary();
				// ��ȡ��Ա���ϸ��µĳ��ڼ�¼
				List<Attend> attends = attendDao.findByEmpAndMonth(e, payMonth);
				// �ù����ۻ�����ڼ�¼�Ĺ���
				for (Attend a : attends) {
					amount += a.getType().getAmerce();
				}
				// ��ӹ��ʽ���
				pay.setPayMonth(payMonth);
				pay.setEmployee(e);
				pay.setAmount(amount);
				payDao.save(pay);

		}
	}

	/**
	 * ��֤ĳ��Ա���Ƿ�ɴ�
	 * @param user Ա����
	 * @param dutyDay ����
	 * @return �ɴ򿨵����
	 */
	public int validPunch(String user , String dutyDay)
	{
		// ���ܲ��ҵ���Ӧ�û��������޷���
		Intern emp = empDao.findByName(user);
		if (emp == null)
		{
			return NO_PUNCH;
		}
		// �ҵ�Ա����ǰ�ĳ��ڼ�¼
		List<Attend> attends = attendDao.findByEmpAndDutyDay(emp , dutyDay);
		// ϵͳû��Ϊ�û��ڵ������մ򿨼�¼���޷���
		if (attends == null || attends.size() <= 0)
		{
			return NO_PUNCH;
		}
		// ��ʼ�ϰ��
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
			// �����ϰࡢ�°��
			if (attends.get(0).getPunchTime() == null
				&& attends.get(1).getPunchTime() == null)
			{
				return BOTH_PUNCH;
			}
			// �����°�򿨣�һ�����翨�����ˣ��Ͳ����ٴ����翨��
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
	 * ��
	 * @param user Ա����
	 * @param dutyDay ������
	 * @param isCome �Ƿ����ϰ��
	 * @return �򿨽��
	 */
	public int punch(String user , String dutyDay , boolean isCome)
	{
		Intern emp = empDao.findByName(user);
		if (emp == null)
		{
			return PUNCH_FAIL;
		}
		// �ҵ�Ա�����δ򿨶�Ӧ�ĳ��ڼ�¼
		Attend attend =
			attendDao.findByEmpAndDutyDayAndCome(emp , dutyDay , isCome);
		if (attend == null)
		{
			return PUNCH_FAIL;
		}
		// �Ѿ���
		if (attend.getPunchTime() != null)
		{
			return PUNCHED;
		}
		System.out.println("============��==========");
		// ��ȡ��ʱ��
		int punchHour = Calendar.getInstance()
			.get(Calendar.HOUR_OF_DAY);
		attend.setPunchTime(new Date());
		// �ϰ��
		if (isCome)
		{
			// 9��֮ǰ������
			if (punchHour < COME_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 1));
			}
			// 9��11��֮����ٵ�
			else if (punchHour < LATE_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 4));
			}
			// 11��֮�������,�������
		}
		// �°��
		else
		{
			// 18��֮��������
			if (punchHour >= LEAVE_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 1));
			}
			// 16~18��֮��������
			else if (punchHour >= EARLY_LIMIT)
			{
				attend.setType(typeDao.get(AttendType.class , 5));
			}
		}
		attendDao.update(attend);
		return PUNCH_SUCC;
	}

	/**
	 * ����Ա������Լ��Ĺ���
	 * @param empName Ա����
	 * @return ��Ա���Ĺ����б�
	 */
	public List<SalaryBean> empSalary(String empName)
	{
		// ��ȡ��ǰԱ��
		Intern emp = empDao.findByName(empName);
		// ��ȡ��Ա����ȫ�������б�:ע�⣬��1�Զ�Ĺ����У��ö��һ�˿��ƹ�����ϵ
		List<Payment> pays = payDao.findByEmp(emp);
		List<SalaryBean> result = new ArrayList<>();
		// ��װVO����
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
	 * Ա���鿴�Լ�����������������
	 * @param empName Ա����
	 * @return ��Ա�����������ķ�������
	 */
	public List<AttendBean> unAttend(String empName)
	{
		// �ҳ������ϰ�ĳ�������
		AttendType type = typeDao.get(AttendType.class , 1);
		Intern emp = empDao.findByName(empName);
		// �ҳ��������ϰ�ĳ��ڼ�¼
		List<Attend> attends = attendDao.findByEmpUnAttend(emp, type);
		List<AttendBean> result = new ArrayList<>();
		// ��װVO����
		for (Attend att : attends )
		{
			AttendBean attendBean = new AttendBean(att.getId() , att.getDutyDay()
					, att.getType().getName() , att.getPunchTime());

			Application app = appDao.findLatestByAtt(att);
			if (app != null){
				attendBean.setApp_type(app.getType().getName());
				attendBean.setApp_progress(app.isResult()?"�Ѵ���":"��δ����");
				if(app.isResult()){
					//���µ������¼��ص�����
					CheckBack cb = app.getCheck();
					attendBean.setGranted(cb.isResult()?"��ͬ��":"������");
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
	 * ����ȫ���ĳ������
	 * @return ȫ���ĳ������
	 */
	public List<AttendType> getAllType()
	{
		return typeDao.findAll(AttendType.class);
	}

	/**
	 * �������
	 * @param attId ����ĳ���ID
	 * @param typeId ���������ID
	 * @param reason ���������
	 * @return ��ӵĽ��
	 */
	public boolean addApplication(int attId , int typeId
		, String reason)
	{
		System.out.println("--------------" + attId);
		System.out.println("~~~~" + typeId);
		System.out.println("~~~~" + reason);
		// ����һ������
		Application app = new Application();
		// ��ȡ������Ҫ�ı�ĳ��ڼ�¼
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