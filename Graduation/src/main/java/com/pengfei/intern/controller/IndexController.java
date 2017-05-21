package com.pengfei.intern.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.AdmManager;
import com.pengfei.intern.service.ItrManager;
import com.pengfei.intern.service.MgrManager;
import com.pengfei.intern.validator.Task_vo_Validator;
import com.pengfei.intern.validator.UserValidator;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.form_vo.Task_vo;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.pengfei.intern.service.ItrManager.LOGIN_ADM;
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
    @Autowired
    private AdmManager admManager;

    @InitBinder("user")
    public void initUserBinder(DataBinder dataBinder){
        dataBinder.addValidators(new UserValidator());
    }

    @RequestMapping(method = RequestMethod.GET)
    String getHome(Model model){
        System.out.println("getHome() called!");
        model.addAttribute("user",new ItrBean());
        return "index3";
    }

    @RequestMapping(value = "/updpwd" , method = RequestMethod.POST)
    Response updPass(HttpSession session, HttpServletRequest request){
        Response response = new Response();
        return response;
    }

    @SneakyThrows
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    ModelAndView handleLogin(HttpSession session,
                             @ModelAttribute("user") @Validated ItrBean itrBean,
                             BindingResult bindingResult){
        System.out.println("handleLogin() called!");
        ModelAndView modelAndView = new ModelAndView();
        //校验登录输入
        if (bindingResult.hasFieldErrors()){
            modelAndView.setViewName("index3");
            System.out.println("登录非空校验失败");
            return modelAndView;
        }
        Manager manager= new Manager();
        String username = itrBean.getEmpName();
        String password = itrBean.getEmpPass();
        manager.setName(username);manager.setPass(password);
        System.out.println(username + ":" + password);
        int result = itrManager.validLogin(manager);
        if(result == LOGIN_MGR){
            session.setAttribute("user",manager.getName());
            session.setAttribute("user_level","manager");
            modelAndView.addObject("employeeList",mgrManager.getEmpsByMgr(username));
            modelAndView.addObject("depSalist",mgrManager.getSalaryByMgr(username));
            modelAndView.addObject("appList",mgrManager.getAppsByMgr(username));
            modelAndView.addObject("taskList",mgrManager.getTasksByMgr(username));
            modelAndView.addObject("task_vo",new Task_vo());
            modelAndView.addObject("username",username);
            modelAndView.addObject("role","经理");
            modelAndView.setViewName("manager2");
        }
        else if(result == LOGIN_EMP){
            session.setAttribute("user",manager.getName());
            session.setAttribute("user_level","employee");
            modelAndView.addObject("valid", itrManager.validPunch(username,
                    new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
            );
            //可能有类型转换异常
            modelAndView.addObject("attList", new ObjectMapper().writeValueAsString(itrManager.allAttendByName(username)));
            modelAndView.addObject("unAttendList", itrManager.unAttend(username));
            System.out.println(new ObjectMapper().writeValueAsString(itrManager.unAttend(username)));
            modelAndView.addObject("typeList", itrManager.getAllType());
            modelAndView.addObject("salist", itrManager.empSalary(username));
            modelAndView.addObject("jobList",itrManager.getJobByIntern(username));
            modelAndView.addObject("username",username);
            modelAndView.addObject("role","intern");
            modelAndView.setViewName("employee");
        }
        else if(result == LOGIN_ADM){
            session.setAttribute("user",manager.getName());
            session.setAttribute("user_level","admin");
            modelAndView.addObject("employeeList",admManager.getAllItr());
            modelAndView.addObject("mgrList",admManager.getAllMgr());
            modelAndView.addObject("username",username);
            modelAndView.addObject("role","admin");
            modelAndView.setViewName("admin");
        }
        else {
            modelAndView.addObject("message","用户名/密码不匹配");
            modelAndView.setViewName("index3");
            modelAndView.addObject("user",new ItrBean());
        }
        return modelAndView;
    }

    @RequestMapping(value = "/logout")
    String logOut(HttpSession session){
        session.invalidate();
        return "redirect:" + "/";
    }

    @ResponseBody
    @RequestMapping(value = "/inter")
    String testInterceptor(){
        return "hello";
    }
}

