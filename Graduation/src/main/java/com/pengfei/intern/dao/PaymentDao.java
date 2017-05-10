package com.pengfei.intern.dao;


import com.pengfei.intern.domain.Employee;
import com.pengfei.intern.domain.Payment;

import java.util.List;

public interface PaymentDao extends BaseDao<Payment>
{
	List<Payment> findByEmp(Employee emp);

	Payment findByMonthAndEmp(String payMonth, Employee emp);
}
