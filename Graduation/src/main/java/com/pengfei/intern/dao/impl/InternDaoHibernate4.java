package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.InternDao;
import com.pengfei.intern.domain.Intern;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InternDaoHibernate4 extends BaseDaoHibernate4<Intern>
	implements InternDao
{
	/**
	 * 根据用户名和密码查询员工
	 * @param emp 包含指定用户名、密码的员工
	 * @return 符合指定用户名和密码的员工集合
	 */
	public List<Intern> findByNameAndPass(Intern emp)
	{
		return find("select p from Intern p where p.name = ?0 and p.pass=?1"
			, emp.getName() , emp.getPass());
	}

	/**
	 * 根据用户名查询员工
	 * @param name 员工的用户名
	 * @return 符合用户名的员工
	 */
	public Intern findByName(String name)
	{
		List<Intern> emps = find("select e from Intern e where e.name = ?0"
			, name);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}

	/**
	 * 根据用户名删除员工
	 * @param name 员工的用户名
	 * @return 符合用户名的员工
	 */
	@Override
	public void deleteByName(String name) {
		Intern emp = findByName(name);
		if (emp!=null){
			delete(emp);
		}
	}
}
