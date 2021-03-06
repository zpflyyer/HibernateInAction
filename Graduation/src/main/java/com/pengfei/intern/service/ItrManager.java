package com.pengfei.intern.service;

import com.pengfei.intern.domain.AttendType;
import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.vo.AttendBean;
import com.pengfei.intern.vo.JobBean;
import com.pengfei.intern.vo.PaymentBean;
import com.pengfei.intern.vo.SalaryBean;

import java.util.List;

public interface ItrManager
{
	// 登录失败
	public static final int LOGIN_FAIL = 0;
	// 以普通员工登录
	public static final int LOGIN_EMP = 1;
	// 以经理登录
	public static final int LOGIN_MGR = 2;
	// 以管理员登录
	public static final int LOGIN_ADM = 3;

	// 不能打卡
	public static final int
			NO_PUNCH = 0;
	// 只能上班打卡
	public static final int COME_PUNCH = 1;
	// 只能下班打卡
	public static final int LEAVE_PUNCH = 2;
	// 既可以上班，也可以下班打卡
	public static final int BOTH_PUNCH = 3;

	// 打卡失败
	public static final int PUNCH_FAIL = 0;
	// 已经打卡
	public static final int PUNCHED = 1;
	// 打卡成功
	public static final int PUNCH_SUCC = 2;

	// 以上午11点为上午时间
	public static final int AM_LIMIT = 11;


	// 以上午9点之前为正常上班
	public static final int COME_LIMIT = 9;
	// 以上午9~11点之间算迟到
	public static final int LATE_LIMIT = 11;
	// 以下午18点之后算正常下班
	public static final int LEAVE_LIMIT = 18;
	// 以上午16~18点之间算迟到
	public static final int EARLY_LIMIT = 16;

	/**
	 * 以经理身份来验证登录
	 * @param mgr 登录的经理身份
	 * @return 登录后的身份确认:0为登录失败，1为登录emp 2为登录mgr
	 */
	int validLogin(Manager mgr);

	/**
	 * 自动打卡，周一到周五，早上7：00为每个员工插入旷工记录
	 */
	void autoPunch();

	/**
	 * 自动结算工资，每月1号，结算上个月工资
	 */
	void autoPay();


	/**
	 * 验证某个员工是否可打卡
	 * @param user 员工名
	 * @param dutyDay 日期
	 * @return 可打卡的类别
	 */
	int validPunch(String user , String dutyDay);

	/**
	 * 打卡
	 * @param user 员工名
	 * @param dutyDay 打卡日期
	 * @param isCome 是否是上班打卡
	 * @return 打卡结果
	 */
	public int punch(String user , String dutyDay , boolean isCome);

	/**
	 * 根据员工浏览自己的工资
	 * @param empName 员工名
	 * @return 该员工的工资列表
	 */
	List<SalaryBean> empSalary(String empName);

	/**
 	 * 员工查看自己的最近三天非正常打卡
	 * @param empName 员工名
	 * @return 该员工的最近三天的非正常打卡
	 */
	List<AttendBean> unAttend(String empName);

	/**
	 * 员工查看自己上个月的全部出勤记录
	 * @param empName 员工名
	 * @return 上个月的全部出勤记录
	 */
	List<AttendBean> allAttendByName(String empName);

	/**
	 * 返回全部的出勤类别
	 * @return 全部的出勤类别
	 */
	List<AttendType> getAllType();

	/**
	 * 添加申请
	 * @param attId 申请的出勤ID
	 * @param typeId 申请的类型ID
	 * @param reason 申请的理由
	 * @return 添加的结果
	 */
	boolean addApplication(int attId , int typeId , String reason);

	/**
	 * 根据实习生获得工作列表
	 * @param itr 实习生
	 * @return 添加的结果
	 */
	List<JobBean> getJobByIntern(String itr);

	/**
	 * 完成/未完成任务
	 * @param job_id
	 * @return 完成的结果
	 */
	boolean acceptJob(int job_id,String accepted);

	boolean askLeave(String from,String to,String itr,int type,String reason);

	boolean pwdChange(String name,String pwd_new);

}