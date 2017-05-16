package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Application;
import com.pengfei.intern.domain.CheckBack;

public interface CheckBackDao extends BaseDao<CheckBack>
{
    CheckBack getCheckByApp(Application app);
}
