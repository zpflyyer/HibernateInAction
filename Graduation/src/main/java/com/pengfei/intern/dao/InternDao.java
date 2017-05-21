package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Intern;

import java.util.List;

public interface InternDao extends BaseDao<Intern>
{

	List<Intern> findByNameAndPass(Intern emp);


	Intern findByName(String name);

	boolean deleteByName(String name);
}
