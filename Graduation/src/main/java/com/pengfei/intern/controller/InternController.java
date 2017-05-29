package com.pengfei.intern.controller;


import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.ItrManager;
import com.pengfei.intern.vo.AttendBean;
import com.pengfei.intern.vo.JobBean;
import com.pengfei.intern.vo.SalaryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.List;

import static com.pengfei.intern.service.ItrManager.*;

/**
 * Created by zhaopen on 4/30/2017.
 */
@Controller
@RequestMapping(value = "/employee")
public class InternController {

    @Autowired
    private ItrManager itrManager;

    /*
    method1:处理添加申请 url=${context}/employee/addApp
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
        if (itrManager.addApplication(att_id,type_id,reason)){
            response.setResponse("added");
            return response;
        }
        response.setResponse("failed");
        return response;
    }

    /*
    method2:处理打卡 url=${context}/employee/punch
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/punch")
    Response handlePunch(HttpSession session, HttpServletRequest request){
        System.out.println("handlePunch() called!");
        String user = (String) session.getAttribute("user");
        String dutyDay =  new java.sql.Date(System.currentTimeMillis()).toString();
        boolean isCome = Boolean.valueOf(request.getParameter("isCome"));
        System.out.println(user+":"+dutyDay+":"+isCome);
        int result = itrManager.punch(user,dutyDay,isCome);
        if (result == PUNCH_SUCC){
            return new Response("success");
        }
        else if (result == PUNCHED){
            return new Response("punched");
        }
        else
            return new Response("failed");
    }

    /*
    method3:处理接受工作 url=${context}/employee/finishjob
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/accept")
    Response acceptJob(HttpSession session,
                       @RequestParam("job_id") int job_id,
                       @RequestParam("accepted") String accepted){
        System.out.println("acceptJob() called!");
        Response response = new Response();
        String user = (String) session.getAttribute("user");

        if(itrManager.acceptJob(job_id,accepted)){
            response.setResponse("succeed");
            return response;
        }
        response.setResponse("failed");
        return response;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getUnAttByItr")
    List<AttendBean> getUnAttByItr(HttpSession session){
        System.out.println("getUnAttByItr() called!");
        String itr = (String)session.getAttribute("user");
        return itrManager.unAttend(itr);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getSalHistotyByItr")
    List<SalaryBean> getSalHistotyByItr(HttpSession session){
        System.out.println("getSalHistotyByItr() called!");
        String itr = (String)session.getAttribute("user");
        return itrManager.empSalary(itr);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getJobByItr")
    List<JobBean> getJobByItr(HttpSession session){
        System.out.println("getJobByItr() called!");
        String itr = (String)session.getAttribute("user");
        return itrManager.getJobByIntern(itr);
    }



}

