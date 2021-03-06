package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Attend;
import com.pengfei.intern.domain.AttendType;
import com.pengfei.intern.domain.Intern;

import java.util.*;


public interface AttendDao extends BaseDao<Attend>
{
	/**
	 * 根据员工、月份查询该员工的出勤记录
	 * @param emp 员工
	 * @param month 月份，月份是形如"2012-02"格式的字符串
	 * @return 该员工、指定月份的全部出勤记录
	 */
	List<Attend> findByEmpAndMonth(Intern emp , String month);

	/**
	 * 根据员工、日期查询该员工的打卡记录集合
	 * @param emp 员工
	 * @param dutyDay 日期
	 * @return 该员工的某天的打卡记录集合
	 */
	List<Attend> findByEmpAndDutyDay(Intern emp
		, String dutyDay);

	/**
	 * 根据员工、日期 、上下班查询该员工的打卡记录集合
	 * @param emp 员工
	 * @param dutyDay 日期
	 * @param isCome 是否上班
	 * @return 该员工的某天上班或下班的打卡记录
	 */
	Attend findByEmpAndDutyDayAndCome(Intern emp ,
		String dutyDay , boolean isCome);

	/**
	 * 查看员工前三天的非正常打卡
	 * @param emp 员工
	 * @return 该员工的前三天的非正常打卡
	 */
	List<Attend> findByEmpUnAttend(Intern emp
		, AttendType type);

	/**
	 * 查看员工所有打卡
	 * @param emp 员工
	 * @return 该员工的所有打卡
	 */
	List<Attend> findByEmpAll(Intern emp);
}
