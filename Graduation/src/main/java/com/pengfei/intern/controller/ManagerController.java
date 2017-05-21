package com.pengfei.intern.controller;

import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.MgrManager;
import com.pengfei.intern.validator.Task_vo_Validator;
import com.pengfei.intern.vo.ItrBean;
import com.pengfei.intern.vo.TaskBean;
import com.pengfei.intern.vo.form_vo.Task_vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

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

    @InitBinder("task_vo")
    public void initTaskBinder(DataBinder dataBinder){
        dataBinder.addValidators(new Task_vo_Validator());
    }

    /*
    method1:处理添加用户 url=${context}/manager/addEmpl
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/addEmpl")
    Intern addEmpl(HttpSession session, HttpServletRequest request){
        System.out.println("addEmpl() called!");

        Intern employee_add = new Intern();
        String manager = (String)session.getAttribute("user");

        for (ItrBean emp:
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
    Response updEmpl(HttpSession session, HttpServletRequest request,
                     @RequestParam("empName") String empName,
                     @RequestParam("empPass") String empPass,
                     @RequestParam("amount") double amount,
                     @RequestParam("email") String email,
                     @RequestParam("tel") String tel
                     ){
        System.out.println("updEmpl() called!");
        System.out.println(empName+":"+empPass+":"+amount);
        Response response = new Response();
        if (mgrManager.updEmp(empName,empPass,amount,email,tel)!=null){
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

    /*
    moethod5:处理布置任务 url = ${context}/manager/assign
     */
    @RequestMapping(method = RequestMethod.POST,value = "/assign")
    ModelAndView assign(HttpSession session, HttpServletRequest request,
                        @Validated @ModelAttribute("task_vo") Task_vo task_vo,
                        BindingResult bindingResult){
        System.out.println("assign() called!");
        ModelAndView modelAndView = new ModelAndView();
        String username = (String) session.getAttribute("user");

        modelAndView.addObject("employeeList",mgrManager.getEmpsByMgr(username));
        modelAndView.addObject("depSalist",mgrManager.getSalaryByMgr(username));
        modelAndView.addObject("appList",mgrManager.getAppsByMgr(username));
        modelAndView.addObject("taskList",mgrManager.getTasksByMgr(username));
        modelAndView.addObject("username",username);
        modelAndView.setViewName("manager2");
        //校分配任务输入
        if (bindingResult.hasFieldErrors()){
            System.out.println("分配任务非空校验失败");
            return modelAndView;
        }

        String mgr = (String) session.getAttribute("user");

        if(mgrManager.assignTask(mgr,task_vo.getTitle(),task_vo.getContent(),task_vo.getDeadline(),task_vo.getInternList())){
            modelAndView.setViewName("manager2");
        }
        return modelAndView;
    }

    /*
    method6:处理批阅任务 url = ${context}/manager/judge
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/judge")
    Response judge(HttpSession session, HttpServletRequest request,
                    @RequestParam("job_id") int job_id,
                    @RequestParam("grade") int grade,
                    @RequestParam("finished") boolean finished){
        System.out.println("jufge() called!");
        Response response = new Response();

        if(mgrManager.judgeJob(job_id,grade,finished)){
            response.setResponse("succeed");
            return response;
        }
        response.setResponse("failed");
        return response;
    }

    /*
    method7:
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/getEmpByMgr")
    List<ItrBean> getEmpByMgr(HttpSession session, HttpServletRequest request){
        System.out.println("getEmpByMgr() called!");
        String manager = (String)session.getAttribute("user");
        return mgrManager.getEmpsByMgr(manager);
    }


}
