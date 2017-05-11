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
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
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
		//�����¼�����������ģ��ʶ��������ļ�¼Ҳ�����µļ�¼
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
