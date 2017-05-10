package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.ApplicationDao;
import com.pengfei.intern.domain.Application;
import com.pengfei.intern.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ApplicationDaoHibernate4 extends BaseDaoHibernate4<Application>
	implements ApplicationDao
{
	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */
	public List<Application> findByEmp(Employee emp)
	{
		return find("select a from Application as a where "
			+ "a.attend.employee=?0" , emp);
	}
}
