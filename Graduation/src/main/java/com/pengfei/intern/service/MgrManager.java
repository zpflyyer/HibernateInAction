package com.pengfei.intern.service;

import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Job;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.domain.Task;
import com.pengfei.intern.exception.HrException;
import com.pengfei.intern.vo.AppBean;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.SalaryBean;
import com.pengfei.intern.vo.TaskBean;

import java.util.Date;
import java.util.List;

public interface MgrManager
{
	/**
	 * 新增员工
	 * @param emp 新增的员工
	 * @param mgr 员工所属的经理
	 */
	void addEmp(Intern emp , String mgr)
		throws HrException;

	/**
	 * 删除员工
	 * @param name 删除员工的姓名
	 */
	boolean delEmp(String name)
			throws HrException;

	/**
	 * 更新员工
	 */
	Intern updEmp(String name,String pass, Double salary,String email,String tel)
			throws HrException;
	/**
	 * 根据经理返回所有的部门上个月工资
	 * @param mgr 新增的员工名
	 * @return 部门上个月工资
	 */
	List<SalaryBean> getSalaryByMgr(String mgr);

	/**
	 * 根据经理返回该部门的全部员工
	 * @param mgr 经理名
	 * @return 经理的全部下属
	 */
	List<ItrBean> getEmpsByMgr(String mgr);

	/**
	 * 根据经理返回该部门的没有批复的申请
	 * @param mgr 经理名
	 * @return 该部门的全部申请
	 */
	List<AppBean> getAppsByMgr(String mgr);

	/**
	 * 处理申请
	 * @param appid 申请ID
	 * @param mgrName 经理名字
	 * @param result 是否通过
	 */
	boolean check(int appid, String mgrName, boolean result, String reason);

	/**
	 * 布置任务
	 * @param internList take任务的实习生
	 */
	boolean assignTask(String mgr,String title, String content, String deadline,String[] internList);

	/**
	 * 获得该经理布置的所有任务
	 * @param mgr 经理
	 */
	List<TaskBean> getTasksByMgr(String mgr);

	/**
	 * 审批job
	 * @param job_id job的id
	 */
	boolean judgeJob(int job_id,int grade, boolean finished);
}