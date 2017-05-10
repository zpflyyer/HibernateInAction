package com.pengfei.intern.controller;

import com.pengfei.intern.domain.CheckBack;
import com.pengfei.intern.domain.Employee;
import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.MgrManager;
import com.pengfei.intern.vo.EmpBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zhaopen on 5/8/2017.
 */
/*
Handle Manager role
 */
@Controller
@RequestMapping(value = "/manager")
public class ManagerController {

    @Autowired
    private MgrManager mgrManager;

    /*
    method1:处理添加用户 url=${context}/manager/addEmpl
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/addEmpl")
    Employee addEmpl(HttpSession session, HttpServletRequest request){
        System.out.println("addEmpl() called!");

        Employee employee_add = new Employee();
        String manager = (String)session.getAttribute("user");

        for (EmpBean emp:
                mgrManager.getEmpsByMgr(manager)) {
            if (emp.getEmpName().equals(request.getParameter("emp_name"))){
                employee_add.setResponse("existed");
                System.out.println("addEmpl() fails for there is an user with the same name");
                return employee_add;
            }
        }

        employee_add.setName(request.getParameter("emp_name"));
        employee_add.setPass(request.getParameter("emp_pass"));
        employee_add.setSalary(Double.valueOf(request.getParameter("emp_salary")));
        employee_add.setResponse("added");
        mgrManager.addEmp(employee_add,manager);
        System.out.println("addEmpl() succeeds ");
        return employee_add;
    }

    /*
    method2:处理删除用户 url=${context}/manager/delEmpl
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/delEmpl")
    Response delEmpl(HttpSession session, HttpServletRequest request){
        System.out.println("delEmpl() called!");
        Response response = new Response();
        if(mgrManager.delEmp(request.getParameter("emp_name"))){
            response.setResponse("deleted");
            return response;
        }
        response.setResponse("referenced");
        return response;
    }

    /*
    method3:处理更新用户 url=${context}/manager/updEmpl
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updEmpl")
    Response updEmpl(HttpSession session, HttpServletRequest request){
        System.out.println("updEmpl() called!");
        String name = request.getParameter("emp_name");
        String pass = request.getParameter("emp_pass");
        Double salary = Double.valueOf(request.getParameter("emp_salary"));
        System.out.println(name+":"+pass+":"+salary);
        Response response = new Response();
        if (mgrManager.updEmp(name,pass,salary)!=null){
            response.setResponse("updated");
            return response;
        }
        else {
            response.setResponse("failed");
        }
        return response;
    }

    /*
    method4:处理申请 url=${context}/manager/check
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/check")
    Response check(HttpSession session, HttpServletRequest request){
        System.out.println("check() called!");
        int appID = Integer.valueOf(request.getParameter("app_id"));
        String mgr = request.getParameter("mgr");
        boolean result = Boolean.valueOf(request.getParameter("result"));
        String reason = String.valueOf(request.getParameter("reason"));
        System.out.println(appID+":"+mgr+":"+result+":"+reason);

        Response response = new Response();
        if (mgrManager.check(appID,mgr,result,reason)){
            response.setResponse("checked");
            System.out.println("---check() succeed---");
            return response;
        }
        response.setResponse("denied");
        System.out.println("---check() denied---");
        return response;
    }
}
