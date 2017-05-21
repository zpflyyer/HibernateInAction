package com.pengfei.intern.service;

import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.MgrBean;

import java.util.List;

/**
 * Created by zhaopen on 5/19/2017.
 */
public interface AdmManager {
    List<MgrBean> getAllMgr();
    List<ItrBean> getAllItr();
    boolean mergeItr(String itr,String mgr);
    boolean addEmp(String name, String pass, double salary, String mgr);
    boolean delEmp(String name);
    boolean updEmp(String name, String pass, Double salary);
    boolean addMgr(String name, String pass, double salary,String dept);
    boolean delMgr(String name);
    boolean updMgr(String name,String pass,double salary,String dept);
}
