package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Manager;

import java.util.List;

public interface ManagerDao extends BaseDao<Manager>
{

	List<Manager> findByNameAndPass(Manager mgr);


	Manager findByName(String name);

	Manager findByDept(String dept);

	boolean deleteByName(String name);
}
