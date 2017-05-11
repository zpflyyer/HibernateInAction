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
	 * 根据员工、月份查询该员工的出勤记录
	 * @param emp 员工
	 * @param month 月份，月份是形如"2012-02"格式的字符串
	 * @return 该员工、指定月份的全部出勤记录
	 */
	public List<Attend> findByEmpAndMonth(Intern emp , String month)
	{
		return find("from Attend as a where a.employee=?0 " +
			"and substring(a.dutyDay , 0 , 7)=?1" , emp , month);
	}

	/**
	 * 根据员工、日期查询该员工的打卡记录集合
	 * @param emp 员工
	 * @param dutyDay 日期
	 * @return 该员工的某天的打卡记录集合
	 */
	public List<Attend> findByEmpAndDutyDay(Intern emp
		, String dutyDay)
	{
		return find("from Attend as a where a.employee=?0 and "
			+ "a.dutyDay=?1" , emp , dutyDay);
	}

	/**
	 * 根据员工、日期 、上下班查询该员工的打卡记录集合
	 * @param emp 员工
	 * @param dutyDay 日期
	 * @param isCome 是否上班
	 * @return 该员工的某天上班或下班的打卡记录
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
	 * 查看员工前三天的非正常打卡
	 * @param emp 员工
	 * @return 该员工的前三天的非正常打卡
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
