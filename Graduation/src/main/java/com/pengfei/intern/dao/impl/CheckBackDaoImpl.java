package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.CheckBackDao;
import com.pengfei.intern.domain.Application;
import com.pengfei.intern.domain.CheckBack;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CheckBackDaoImpl extends BaseDaoImpl<CheckBack>
	implements CheckBackDao
{
	@Override
	public CheckBack getCheckByApp(Application app) {
		List<CheckBack> checkBacks = find("select c from CheckBack c where c.app = ?0"
				, app);
		return checkBacks.isEmpty()?null:checkBacks.get(0);
	}
}
