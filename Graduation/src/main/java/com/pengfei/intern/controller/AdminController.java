package com.pengfei.intern.controller;

import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.AdmManager;
import com.pengfei.intern.vo.DeptBean;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.MgrBean;
import com.pengfei.intern.vo.SalaryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaopen on 5/19/2017.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    private AdmManager admManager;

    /*
    method1:处理添加用户 url=${context}/admin/addItr
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/addItr")
    ItrBean addItr(HttpSession session, HttpServletRequest request,
                     @RequestParam("real_name") String real_name,
                     @RequestParam("name") String name,
                     @RequestParam("pass") String pass,
                     @RequestParam("id_number") String id_number,
                    @RequestParam("tel") String tel,
                    @RequestParam("email") String email,
                    @RequestParam("dept") String dept,
                    @RequestParam("salary") String salary){
        System.out.println("addItr() called!");
        return admManager.addEmp(real_name,name,pass,tel,email,id_number,Double.valueOf(salary),dept);
    }

    /*
    method2:处理删除用户 url=${context}/admin/delItr
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/delItr")
    Response delItr(HttpSession session, HttpServletRequest request,
                     @RequestParam("name") String name){
        System.out.println("delItr() called!");
        Response response = new Response();

        boolean result = admManager.delEmp(name);
        if (result){
            response.setResponse("deleted");
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    /*
    method3:处理更新用户 url=${context}/admin/updItr
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updItr")
    Response updItr(HttpSession session, HttpServletRequest request,
                    @RequestParam("empName") String empName,
                    @RequestParam("real_name") String real_name,
                    @RequestParam("empPass") String empPass,
                    @RequestParam("amount") double amount,
                    @RequestParam("tel") String tel,
                    @RequestParam("email") String email,
                    @RequestParam("id_number") String id_number,
                    @RequestParam("dept") String dept){
        System.out.println("updItr() called!");
        Response response = new Response();

        boolean result = admManager.updEmp(empName,real_name,empPass,amount,tel,email,id_number,dept);
        if (result){
            response.setResponse("updated");
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    /*
    method4:处理添加经理 url=${context}/admin/addMgr
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/addMgr")
    Response addMgr(HttpSession session, HttpServletRequest request,
                    @RequestParam("name") String name,
                    @RequestParam("pass") String pass,
                    @RequestParam("salary") String salary,
                    @RequestParam("dept") String dept){
        System.out.println("addMgr() called!");
        Response response = new Response();

        boolean result = admManager.addMgr(name,pass,Double.valueOf(salary),dept);
        if (result){
            response.setResponse("added");
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    /*
    method5:处理删除经理 url=${context}/admin/delMgr
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/delMgr")
    Response delMgr(HttpSession session, HttpServletRequest request,
                    @RequestParam("name") String name){
        System.out.println("delMgr() called!");
        Response response = new Response();

        boolean result = admManager.delMgr(name);
        if (result){
            response.setResponse("deleted");
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    /*
    method6:处理更新经理 url=${context}/admin/updMgr
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updMgr")
    Response updMgr(HttpSession session, HttpServletRequest request,
                    @RequestParam("name") String name,
                    @RequestParam("real_name") String real_name,
                    @RequestParam("empPass") String empPass,
                    @RequestParam("tel") String tel,
                    @RequestParam("email") String email,
                    @RequestParam("dept") String dept){
        System.out.println("updMgr() called!");
        Response response = new Response();

        boolean result = admManager.updMgr(name,real_name,empPass,tel,email,dept);
        if (result){
            response.setResponse("updated");
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    /*
    method7:处理迁移实习生 url=${context}/admin/merge
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/merge")
    Response merge(HttpSession session, HttpServletRequest request,
                    @RequestParam("itr") String itr,
                    @RequestParam("mgr") String mgr){
        System.out.println("merge() called!");
        Response response = new Response();

        boolean result = admManager.mergeItr(itr,mgr);
        if (result){
            response.setResponse("merged");
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getAllItr")
    List<ItrBean> getAllItr(HttpSession session, HttpServletRequest request){
        System.out.println("getAllItr() called!");
        return admManager.getAllItr();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getSals")
    List<SalaryBean> getSals(HttpSession session, HttpServletRequest request){
        System.out.println("getSals() called!");
        return admManager.getSalByMonth();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getAllMgr")
    List<MgrBean> getAllMgr(HttpSession session, HttpServletRequest request){
        System.out.println("getAllMgr() called!");
        return admManager.getAllMgr();
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getAllDept")
    List<DeptBean> getAllDept(HttpSession session, HttpServletRequest request){
        System.out.println("getAllDept() called!");
        return admManager.getAllDept();
    }
}
