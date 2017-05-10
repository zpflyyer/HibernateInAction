package com.pengfei.intern.dao;


import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Payment;

import java.util.List;

public interface PaymentDao extends BaseDao<Payment>
{
	List<Payment> findByEmp(Intern emp);

	Payment findByMonthAndEmp(String payMonth, Intern emp);
}
