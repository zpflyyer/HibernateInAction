package com.pengfei.intern.controller;


import com.pengfei.intern.domain.Application;
import com.pengfei.intern.domain.Employee;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.EmpManager;
import com.pengfei.intern.service.MgrManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.pengfei.intern.service.EmpManager.*;

/**
 * Created by zhaopen on 4/30/2017.
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    private EmpManager empManager;

    /*
    method1:������������ url=${context}/employee/addApp
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/addApp")
    Response updEmpl(HttpSession session, HttpServletRequest request){
        System.out.println("addApp() called!");
        int att_id = Integer.valueOf(request.getParameter("att_id"));
        int type_id = Integer.valueOf(request.getParameter("type_id"));
        String reason = request.getParameter("reason");
        System.out.println(att_id+":"+reason+":"+type_id);
        Response response =  new Response();
        if (empManager.addApplication(att_id,type_id,reason)){
            response.setResponse("added");
            return response;
        }
        response.setResponse("failed");
        return response;
    }

    /*
    method2:������ url=${context}/employee/punch
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/punch")
    Response handlePunch(HttpSession session, HttpServletRequest request){
        System.out.println("handlePunch() called!");
        String user = (String) session.getAttribute("user");
        String dutyDay =  new java.sql.Date(System.currentTimeMillis()).toString();
        boolean isCome = Boolean.valueOf(request.getParameter("isCome"));
        System.out.println(user+":"+dutyDay+":"+isCome);
        int result = empManager.punch(user,dutyDay,isCome);
        if (result == PUNCH_SUCC){
            return new Response("success");
        }
        else if (result == PUNCHED){
            return new Response("punched");
        }
        else
            return new Response("failed");
    }
}
