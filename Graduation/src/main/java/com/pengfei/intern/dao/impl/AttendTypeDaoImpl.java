package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.AttendTypeDao;
import com.pengfei.intern.domain.AttendType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttendTypeDaoImpl extends BaseDaoImpl<AttendType>
	implements AttendTypeDao
{
	@Override
	public AttendType findByName(String name) {
		List<AttendType> attendTypeList =  find("select a from AttendType a where a.name = ?0", name);
		if (attendTypeList != null && attendTypeList.size()>=1){
			return attendTypeList.get(0);
		}
		return null;
	}
}
