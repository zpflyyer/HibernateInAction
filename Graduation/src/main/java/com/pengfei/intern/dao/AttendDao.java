package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Attend;
import com.pengfei.intern.domain.AttendType;
import com.pengfei.intern.domain.Intern;

import java.util.*;


public interface AttendDao extends BaseDao<Attend>
{
	/**
	 * ����Ա�����·ݲ�ѯ��Ա���ĳ��ڼ�¼
	 * @param emp Ա��
	 * @param month �·ݣ��·�������"2012-02"��ʽ���ַ���
	 * @return ��Ա����ָ���·ݵ�ȫ�����ڼ�¼
	 */
	List<Attend> findByEmpAndMonth(Intern emp , String month);

	/**
	 * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @return ��Ա����ĳ��Ĵ򿨼�¼����
	 */
	List<Attend> findByEmpAndDutyDay(Intern emp
		, String dutyDay);

	/**
	 * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @param isCome �Ƿ��ϰ�
	 * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
	 */
	Attend findByEmpAndDutyDayAndCome(Intern emp ,
		String dutyDay , boolean isCome);

	/**
	 * �鿴Ա��ǰ����ķ�������
	 * @param emp Ա��
	 * @return ��Ա����ǰ����ķ�������
	 */
	List<Attend> findByEmpUnAttend(Intern emp
		, AttendType type);

	/**
	 * �鿴Ա�����д�
	 * @param emp Ա��
	 * @return ��Ա�������д�
	 */
	List<Attend> findByEmpAll(Intern emp);
}
