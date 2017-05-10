package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.PaymentDao;
import com.pengfei.intern.domain.Employee;
import com.pengfei.intern.domain.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentDaoHibernate4 extends BaseDaoHibernate4<Payment>
	implements PaymentDao
{

	/**
	 * 根据员工查询月结薪水
	 * @return 该员工对应的月结薪水集合
	 */
	public List<Payment> findByEmp(Employee emp)
	{
		return find("select p from Payment as p where p.employee=?0" , emp);
	}


	/**
	 * 根据员工和发薪月份来查询月结薪水
	 * @param payMonth 发薪月份
	 * @param emp 领薪的员工
	 * @return 指定员工、指定月份的月结薪水
	 */
	public Payment findByMonthAndEmp(String payMonth
		 , Employee emp)
	{
		List<Payment> pays = find("select p from Payment as p where"
			+ " p.employee=?0 and p.payMonth=?1" , emp , payMonth);
		if (pays != null && pays.size() > 0)
		{
			return pays.get(0);
		}
		return null;
	}
}
