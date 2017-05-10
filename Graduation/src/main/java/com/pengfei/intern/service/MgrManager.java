package com.pengfei.intern.service;

import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.exception.HrException;
import com.pengfei.intern.vo.AppBean;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.SalaryBean;

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
	Intern updEmp(String name, String pass, Double salary)
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

}