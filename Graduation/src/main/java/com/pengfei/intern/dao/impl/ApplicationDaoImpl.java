package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.ApplicationDao;
import com.pengfei.intern.domain.Application;
import com.pengfei.intern.domain.Attend;
import com.pengfei.intern.domain.Intern;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ApplicationDaoImpl extends BaseDaoImpl<Application>
	implements ApplicationDao
{
	/**
	 * 根据员工查询未处理的异动申请
	 * @param emp 需要查询的员工
	 * @return 该员工对应的未处理的异动申请
	 */
	public List<Application> findByEmp(Intern emp)
	{
		return find("select a from Application as a where "
			+ "a.attend.employee=?0" , emp);
	}

	@Override
	public Application findLatestByAtt(Attend attend) {
		List<Application> applications = find("select a from Application as a where "
				+ "a.attend=?0" , attend);
		//申请记录的主键自增的，故而主键最大的记录也是最新的记录
		int latest = -1;
		Application application = null;
		for (Application app:applications ) {
			if(app.getId() > latest){
				application = app;
			}
		}
		return application;
	}
}
