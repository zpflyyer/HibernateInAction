package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.PaymentDao;
import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PaymentDaoImpl extends BaseDaoImpl<Payment>
	implements PaymentDao
{

	/**
	 * ����Ա����ѯ�½�нˮ
	 * @return ��Ա����Ӧ���½�нˮ����
	 */
	public List<Payment> findByEmp(Intern emp)
	{
		return find("select p from Payment as p where p.employee=?0" , emp);
	}


	/**
	 * ����Ա���ͷ�н�·�����ѯ�½�нˮ
	 * @param payMonth ��н�·�
	 * @param emp ��н��Ա��
	 * @return ָ��Ա����ָ���·ݵ��½�нˮ
	 */
	public Payment findByMonthAndEmp(String payMonth
		 , Intern emp)
	{
		List<Payment> pays = find("select p from Payment as p where"
			+ " p.employee=?0 and p.payMonth=?1" , emp , payMonth);
		if (pays != null && pays.size() > 0)
		{
			return pays.get(0);
		}
		return null;
	}
}