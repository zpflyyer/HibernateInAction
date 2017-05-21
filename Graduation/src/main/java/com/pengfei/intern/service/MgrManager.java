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
	 * ����Ա��
	 * @param emp ������Ա��
	 * @param mgr Ա�������ľ���
	 */
	void addEmp(Intern emp , String mgr)
		throws HrException;

	/**
	 * ɾ��Ա��
	 * @param name ɾ��Ա��������
	 */
	boolean delEmp(String name)
			throws HrException;

	/**
	 * ����Ա��
	 */
	Intern updEmp(String name,String pass, Double salary,String email,String tel)
			throws HrException;
	/**
	 * ���ݾ��������еĲ����ϸ��¹���
	 * @param mgr ������Ա����
	 * @return �����ϸ��¹���
	 */
	List<SalaryBean> getSalaryByMgr(String mgr);

	/**
	 * ���ݾ����ظò��ŵ�ȫ��Ա��
	 * @param mgr ������
	 * @return �����ȫ������
	 */
	List<ItrBean> getEmpsByMgr(String mgr);

	/**
	 * ���ݾ����ظò��ŵ�û������������
	 * @param mgr ������
	 * @return �ò��ŵ�ȫ������
	 */
	List<AppBean> getAppsByMgr(String mgr);

	/**
	 * ��������
	 * @param appid ����ID
	 * @param mgrName ��������
	 * @param result �Ƿ�ͨ��
	 */
	boolean check(int appid, String mgrName, boolean result, String reason);

	/**
	 * ��������
	 * @param internList take�����ʵϰ��
	 */
	boolean assignTask(String mgr,String title, String content, String deadline,String[] internList);

	/**
	 * ��øþ����õ���������
	 * @param mgr ����
	 */
	List<TaskBean> getTasksByMgr(String mgr);

	/**
	 * ����job
	 * @param job_id job��id
	 */
	boolean judgeJob(int job_id,int grade, boolean finished);
}