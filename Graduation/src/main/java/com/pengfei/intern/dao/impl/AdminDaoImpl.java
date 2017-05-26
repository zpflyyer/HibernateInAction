package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.AdminDao;
import com.pengfei.intern.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaopen on 5/19/2017.
 */
@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {
    @Override
    public List<Admin> findByNameAndPass(Admin admin) {
        return find("select a from Admin a where a.name = ?0 and a.pass=?1"
                , admin.getName() , admin.getPass());
    }

    @Override
    public Admin findByName(String name) {
        return find("select a from Admin a where a.name = ?0"
                , name).get(0);
    }
}
