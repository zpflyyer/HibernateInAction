package com.pengfei.intern.service.impl;

import com.pengfei.intern.dao.InternDao;
import com.pengfei.intern.dao.ManagerDao;
import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.exception.HrException;
import com.pengfei.intern.service.AdmManager;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.MgrBean;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaopen on 5/19/2017.
 */
@Setter
@Service
public class AdmManagerImpl implements AdmManager {
    @Autowired
    private InternDao itrDao;
    @Autowired
    private ManagerDao mgrDao;
    @Override
    public List<MgrBean> getAllMgr() {
        List<Manager> managerList = mgrDao.findAll(Manager.class);
        List<MgrBean> mgrBeanList = new ArrayList<>();
        for (Manager mgr:
             managerList) {
            MgrBean mgrBean = new MgrBean();
            mgrBean.setMgrName(mgr.getName());
            mgrBean.setMgrPass(mgr.getPass());
            mgrBean.setMgrDept(mgr.getDept());
            mgrBeanList.add(mgrBean);
        }
        return mgrBeanList;
    }

    @Override
    public List<ItrBean> getAllItr() {
        List<Intern> internList = itrDao.findAll(Intern.class);
        List<ItrBean> itrBeanList = new ArrayList<>();
        for (Intern itr:
             internList) {
            if (!(itr instanceof Manager)) {
                ItrBean itrBean = new ItrBean();
                itrBean.setEmpName(itr.getName());
                itrBean.setEmpPass(itr.getPass());
                itrBean.setAmount(itr.getSalary());
                itrBean.setDept(itr.getManager().getDept());
                itrBeanList.add(itrBean);
            }
        }
        return itrBeanList;
    }

    @Override
    public boolean mergeItr(String itr, String mgr) {
        Manager manager = mgrDao.findByName(mgr);
        Intern intern = itrDao.findByName(itr);
        if (manager != null && intern != null){
            intern.setManager(manager);
            itrDao.update(intern);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean addEmp(String name, String pass, double salary, String dept) {
        Intern intern = new Intern();
        Manager manager = mgrDao.findByDept(dept);
        if (itrDao.findByName(name) != null){
            return false;
        }
        else {
            if (manager != null) {
                intern.setManager(manager);
            }
            intern.setName(name);
            intern.setPass(pass);
            intern.setSalary(salary);
            itrDao.save(intern);
            return true;
        }
    }

    @Override
    public boolean delEmp(String name) throws HrException {
        return itrDao.deleteByName(name);
    }

    @Override
    public boolean updEmp(String name, String pass, Double salary) throws HrException {
        if (itrDao.findByName(name) == null){
            return false;
        }
        else {
            Intern intern = itrDao.findByName(name);
            intern.setPass(pass);
            intern.setSalary(salary);
            return true;
        }
    }

    @Override
    public boolean addMgr(String name, String pass, double salary, String dept) {
        if (mgrDao.findByName(name) == null){
            return false;
        }
        else {
            Manager manager = new Manager();
            manager.setName(name);
            manager.setPass(pass);
            manager.setSalary(salary);
            manager.setDept(dept);
            mgrDao.save(manager);
            return true;
        }
    }

    @Override
    public boolean delMgr(String name) {
        return mgrDao.deleteByName(name);
    }

    @Override
    public boolean updMgr(String name, String pass, double salary, String dept) {
        Manager manager = mgrDao.findByName(name);
        if (manager== null){
            return false;
        }
        else {
            manager.setName(name);
            manager.setPass(pass);
            manager.setSalary(salary);
            manager.setDept(dept);
            return true;
        }
    }
}
