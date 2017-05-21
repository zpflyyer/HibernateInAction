package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.ManagerDao;
import com.pengfei.intern.domain.Manager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ManagerDaoImpl extends BaseDaoImpl<Manager>
	implements ManagerDao
{
	/**
	 * �����û����������ѯ����
	 * @param mgr ����ָ���û���������ľ���
	 * @return ����ָ���û���������ľ���
	 */
	public List<Manager> findByNameAndPass(Manager mgr)
	{
		return find("select m from Manager m where m.name = ?0 and m.pass=?1"
			, mgr.getName() , mgr.getPass());
	}

	/**
	 * �����û������Ҿ���
	 * @param name ���������
	 * @return ���ֶ�Ӧ�ľ���
	 */
	public Manager findByName(String name)
	{
		List<Manager> ml = find("select m from Manager m where m.name=?0"
			, name);
		if (ml != null && ml.size() > 0)
		{
			return ml.get(0);
		}
		return null;
	}

	@Override
	public Manager findByDept(String dept) {
		List<Manager> ml = find("select m from Manager m where m.dept=?0"
				, dept);
		if (ml != null && ml.size() > 0)
		{
			return ml.get(0);
		}
		return null;
	}

	@Override
	public boolean deleteByName(String name) {
		Manager manager = findByName(name);
		if (manager != null){
			delete(manager);
			return true;
		}
		else{
			return false;
		}
	}
}
