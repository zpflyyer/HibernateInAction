package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Admin;

import java.util.List;

/**
 * Created by zhaopen on 5/19/2017.
 */
public interface AdminDao extends BaseDao<Admin> {
    List<Admin> findByNameAndPass(Admin admin);
    Admin findByName(String name);
}
