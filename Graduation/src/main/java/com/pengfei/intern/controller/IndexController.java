package com.pengfei.intern.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.service.ItrManager;
import com.pengfei.intern.service.MgrManager;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.pengfei.intern.service.ItrManager.LOGIN_EMP;
import static com.pengfei.intern.service.ItrManager.LOGIN_MGR;

/**
 * Created by zhaopen on 4/30/2017.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private ItrManager itrManager;
    @Autowired
    private MgrManager mgrManager;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView getHome(){
        System.out.println("getHome() called!");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @SneakyThrows
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    ModelAndView handleLogin(HttpSession session,
                            @RequestParam("username") String username,
                            @RequestParam("password") String password){
        System.out.println("handleLogin() called!");
        ModelAndView modelAndView = new ModelAndView();
        Manager manager = new Manager();
        manager.setName(username);
        manager.setPass(password);
        System.out.println(username + ":" + password);
        int result = itrManager.validLogin(manager);
        if(result == LOGIN_MGR){
            session.setAttribute("user",manager.getName());
            session.setAttribute("user_level","manager");
            modelAndView.addObject("employeeList",mgrManager.getEmpsByMgr(username));
            modelAndView.addObject("depSalist",mgrManager.getSalaryByMgr(username));
            modelAndView.addObject("appList",mgrManager.getAppsByMgr(username));
            modelAndView.addObject("username",username);
            modelAndView.setViewName("manager1");
        }
        else if(result == LOGIN_EMP){
            session.setAttribute("user",manager.getName());
            session.setAttribute("user_level","employee");
            modelAndView.addObject("valid", itrManager.validPunch(username,
                    new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
            );
            //可能有类型转换异常
            modelAndView.addObject("attList", new ObjectMapper().writeValueAsString(itrManager.allAttendByName(username)));
            System.out.println(new ObjectMapper().writeValueAsString(itrManager.allAttendByName(username)));
            modelAndView.addObject("unAttendList", itrManager.unAttend(username));
            modelAndView.addObject("typeList", itrManager.getAllType());
            modelAndView.addObject("salist", itrManager.empSalary(username));
            modelAndView.addObject("username",username);
            modelAndView.setViewName("employee");
        }
        else
            modelAndView.setViewName("error");
        return modelAndView;
    }

    @RequestMapping(value = "/logout")
    String logOut(HttpSession session){
        session.invalidate();
        return "redirect:" + "/";
    }
}

