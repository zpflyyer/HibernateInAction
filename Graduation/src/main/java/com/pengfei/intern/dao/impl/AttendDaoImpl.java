package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.AttendDao;
import com.pengfei.intern.domain.Attend;
import com.pengfei.intern.domain.AttendType;
import com.pengfei.intern.domain.Intern;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Repository
public class AttendDaoImpl extends BaseDaoImpl<Attend>
	implements AttendDao
{
	/**
	 * ����Ա�����·ݲ�ѯ��Ա���ĳ��ڼ�¼
	 * @param emp Ա��
	 * @param month �·ݣ��·�������"2012-02"��ʽ���ַ���
	 * @return ��Ա����ָ���·ݵ�ȫ�����ڼ�¼
	 */
	public List<Attend> findByEmpAndMonth(Intern emp , String month)
	{
		return find("from Attend as a where a.employee=?0 " +
			"and substring(a.dutyDay , 0 , 7)=?1" , emp , month);
	}

	/**
	 * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @return ��Ա����ĳ��Ĵ򿨼�¼����
	 */
	public List<Attend> findByEmpAndDutyDay(Intern emp
		, String dutyDay)
	{
		return find("from Attend as a where a.employee=?0 and "
			+ "a.dutyDay=?1" , emp , dutyDay);
	}

	/**
	 * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @param isCome �Ƿ��ϰ�
	 * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
	 */
	public Attend findByEmpAndDutyDayAndCome(Intern emp ,
		String dutyDay , boolean isCome)
	{
		List<Attend> al = findByEmpAndDutyDay(emp , dutyDay);
		if (al != null || al.size() > 1)
		{
			for (Attend attend : al)
			{
				if (attend.isCome() == isCome )
				{
					return attend;
				}
			}
		}
		return null;
	}

	/**
	 * �鿴Ա��ǰ����ķ�������
	 * @param emp Ա��
	 * @return ��Ա����ǰ����ķ�������
	 */
	public List<Attend> findByEmpUnAttend(Intern emp
		, AttendType type)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String end = sdf.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, -3);
		String start = sdf.format(c.getTime());
		return find("from Attend as a where a.employee=?0 and "
			+ "a.type != ?1 and a.dutyDay between ?2 and ?3" ,
			emp , type , start , end);
	}

	@Override
	public List<Attend> findByEmpAll(Intern emp) {
		return find("from Attend as a where a.employee=?0" , emp );
	}
}
