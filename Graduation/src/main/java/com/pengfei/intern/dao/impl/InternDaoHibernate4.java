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
	 * �����û����������ѯԱ��
	 * @param emp ����ָ���û����������Ա��
	 * @return ����ָ���û����������Ա������
	 */
	public List<Intern> findByNameAndPass(Intern emp)
	{
		return find("select p from Intern p where p.name = ?0 and p.pass=?1"
			, emp.getName() , emp.getPass());
	}

	/**
	 * �����û�����ѯԱ��
	 * @param name Ա�����û���
	 * @return �����û�����Ա��
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
	 * �����û���ɾ��Ա��
	 * @param name Ա�����û���
	 * @return �����û�����Ա��
	 */
	@Override
	public void deleteByName(String name) {
		Intern emp = findByName(name);
		if (emp!=null){
			delete(emp);
		}
	}
}
