package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Employee;

import java.util.List;

public interface EmployeeDao extends BaseDao<Employee>
{

	List<Employee> findByNameAndPass(Employee emp);


	Employee findByName(String name);

	void deleteByName(String name);
}
