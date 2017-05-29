package com.pengfei.intern.service;

import com.pengfei.intern.vo.*;

import java.util.List;

/**
 * Created by zhaopen on 5/19/2017.
 */
public interface AdmManager {
    List<MgrBean> getAllMgr();
    List<ItrBean> getAllItr();
    List<SalaryBean> getSalByMonth();
    List<DeptBean> getAllDept();
    boolean mergeItr(String itr,String mgr);
    ItrBean addEmp(String real_name,String name, String pass,String tel,String email,String id_number ,double salary, String dept);
    TypeBean addType(String name,double amerce);
    boolean delEmp(String name);
    boolean updEmp(String empName,String real_name,String empPass,double salary,String tel,String email,String id_number,String dept);
    boolean addMgr(String name, String pass, double salary,String dept);
    boolean delMgr(String name);
    boolean updMgr(String name,String real_name,String empPass,String tel,String email,String dept);
    List<TypeBean> getAllType();
    boolean updType(int id,String name,Double amerce);
}
