package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Application;
import com.pengfei.intern.domain.Employee;

import java.util.*;



public interface ApplicationDao extends BaseDao<Application>
{
	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */
	List<Application> findByEmp(Employee emp);
}
