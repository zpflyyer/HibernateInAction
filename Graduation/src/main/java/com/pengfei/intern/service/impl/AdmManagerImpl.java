package com.pengfei.intern.service.impl;

import com.pengfei.intern.dao.*;
import com.pengfei.intern.domain.*;
import com.pengfei.intern.exception.HrException;
import com.pengfei.intern.service.AdmManager;
import com.pengfei.intern.vo.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    @Autowired
    private AttendDao attendDao;
    @Autowired
    private PaymentDao paymentDao;
    @Autowired
    private AttendTypeDao attendTypeDao;
    @Override
    public List<MgrBean> getAllMgr() {
        List<Manager> managerList = mgrDao.findAll(Manager.class);
        List<MgrBean> mgrBeanList = new ArrayList<>();
        for (Manager mgr:
             managerList) {
            MgrBean mgrBean = new MgrBean(mgr.getId(),mgr.getReal_name(),mgr.getName(),mgr.getPass(),mgr.getTel(),mgr.getEmail(),mgr.getDept());
            mgrBeanList.add(mgrBean);
        }
        return mgrBeanList;
    }

    @Override
    public List<ItrBean> getAllItr() {
        List<Intern> internList = itrDao.findAll(Intern.class);
        List<ItrBean> result = new ArrayList<>();
        for (Intern e:
             internList) {
            if (!(e instanceof Manager)) {
                List<AttendBean> attendBeans = new ArrayList<>();
                for (Attend a : attendDao.findByEmpAll(e)) {
                    attendBeans.add(new AttendBean(a.getId(),a.getDutyDay(),a.getType().getName(),a.getPunchTime()));
                }
                ItrBean itrBean = new ItrBean(e.getId(),e.getName(),
                        e.getPass(), e.getSalary(),e.getTel(),e.getEmail(),e.getBoard(),e.getReal_name(),e.getId_num(),attendBeans);
                itrBean.setDept(e.getManager().getDept());
                result.add(itrBean);
            }
        }
        return result;
    }

    @Override
    public List<SalaryBean> getSalByMonth() {
        List<SalaryBean> result = new ArrayList<>();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH , -1);
        SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
        String month = sdf.format(c.getTime());
        for (Intern itr:
                itrDao.findAll(Intern.class)) {
            if (!(itr instanceof  Manager)){
                Payment p = paymentDao.findByMonthAndEmp(month , itr);
                if (p != null)
                {
                    SalaryBean salaryBean = new SalaryBean(itr.getId(),itr.getReal_name(), p.getAmount(), itr.getSalary());
                    List<Attend> attendList = attendDao.findByEmpAndMonth(itr,month);
                    for (Attend attend:
                            attendList) {
                        if (attend.getType().getId() == 2){
                            salaryBean.setIssue_pay(salaryBean.getIssue_pay()+attend.getType().getAmerce());
                        }
                        else if (attend.getType().getId() == 3){
                            salaryBean.setSick_pay(salaryBean.getSick_pay()+attend.getType().getAmerce());
                        }
                        else if (attend.getType().getId() == 4){
                            salaryBean.setLate_pay(salaryBean.getLate_pay()+attend.getType().getAmerce());
                        }
                        else if (attend.getType().getId() == 5){
                            salaryBean.setEarly_pay(salaryBean.getEarly_pay()+attend.getType().getAmerce());
                        }
                        else if (attend.getType().getId() == 6){
                            salaryBean.setUnAttend_pay(salaryBean.getUnAttend_pay()+attend.getType().getAmerce());
                        }
                        else if (attend.getType().getId() == 7){
                            salaryBean.setWork_pay(salaryBean.getWork_pay()+attend.getType().getAmerce());
                        }
                        else {}
                    }
                    result.add(salaryBean);
                }
            }
        }
        return result;
    }

    @Override
    public List<DeptBean> getAllDept() {
        List<DeptBean> deptBeanList = new ArrayList<>();
        for (Manager mgr:
             mgrDao.findAll(Manager.class)) {
            deptBeanList.add(new DeptBean(mgr.getDept(),mgr.getDept()));
        }
        return deptBeanList;
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
    public ItrBean addEmp(String real_name,String name, String pass,String tel,String email,String id_number ,double salary, String dept) {
        Intern intern = new Intern();
        Manager manager = mgrDao.findByDept(dept);
        if (itrDao.findByName(name) != null){
            return null;
        }
        else {
            if (manager == null) {
                return null;
            }
            Calendar c = Calendar.getInstance();
            intern.setBoard(c.getTime());
            intern.setReal_name(real_name);
            intern.setManager(manager);
            intern.setName(name);
            intern.setPass(pass);
            intern.setSalary(salary);
            intern.setTel(tel);
            intern.setEmail(email);
            intern.setId_num(id_number);
            itrDao.save(intern);
            intern = itrDao.findByName(name);
            ItrBean itrBean = new ItrBean(intern.getId(),intern.getName(),
                    intern.getPass(), intern.getSalary(),intern.getTel(),intern.getEmail(),intern.getBoard(),intern.getReal_name(),intern.getId_num());
            itrBean.setDept(intern.getManager().getDept());
            return itrBean;
        }
    }

    @Override
    public TypeBean addType(String name, double amerce) {
        AttendType aType = new AttendType();
        if (attendTypeDao.findByName(name) != null){
            return null;
        }
        else{
            aType.setName(name);
            aType.setAmerce(amerce);
            attendTypeDao.save(aType);
        }
        aType = attendTypeDao.findByName(name);
        if (aType != null){
            return new TypeBean(aType.getId(),aType.getName(),aType.getAmerce());
        }
        return null;
    }

    @Override
    public boolean delEmp(String name) throws HrException {
        return itrDao.deleteByName(name);
    }

    @Override
    public boolean updEmp(String empName,String real_name,String empPass,double salary,String tel,String email,String id_number,String dept) {
        Intern intern = itrDao.findByName(empName);
        if (intern == null){
            return false;
        }
        else {
            intern.setReal_name(real_name);
            intern.setPass(empPass);
            intern.setSalary(salary);
            intern.setTel(tel);
            intern.setEmail(email);
            intern.setId_num(id_number);
            Manager mgr = mgrDao.findByDept(dept);
            if (mgr != null) {
                intern.setManager(mgr);
            }
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
    public boolean updMgr(String name,String real_name, String empPass, String tel, String email,String dept) {
        Manager manager = mgrDao.findByName(name);
        if (manager== null){
            return false;
        }
        else {
            manager.setReal_name(real_name);
            manager.setPass(empPass);
            manager.setTel(tel);
            manager.setEmail(email);
            manager.setDept(dept);
            return true;
        }
    }

    @Override
    public List<TypeBean> getAllType() {
        List<AttendType> attendTypeList = attendTypeDao.findAll(AttendType.class);
        List<TypeBean> typeBeanList  = new ArrayList<>();
        for (AttendType atype:
             attendTypeList) {
            typeBeanList.add(new TypeBean(atype.getId(),atype.getName(),atype.getAmerce()));
        }
        return typeBeanList;
    }

    @Override
    public boolean updType(int id, String name, Double amerce) {
        AttendType atype = attendTypeDao.get(AttendType.class,id);
        if (atype != null){
            atype.setName(name);
            atype.setAmerce(amerce);
            attendTypeDao.update(atype);
            return true;
        }
        return false;
    }
}
