package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.AttendTypeDao;
import com.pengfei.intern.domain.AttendType;
import org.springframework.stereotype.Repository;

@Repository
public class AttendTypeDaoHibernate4 extends BaseDaoHibernate4<AttendType>
	implements AttendTypeDao
{
}
