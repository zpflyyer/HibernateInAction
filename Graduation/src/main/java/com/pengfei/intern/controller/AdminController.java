package com.pengfei.intern.controller;

import com.pengfei.intern.domain.Response;
import com.pengfei.intern.service.AdmManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    Response addItr(HttpSession session, HttpServletRequest request,
                     @RequestParam("name") String name,
                     @RequestParam("pass") String pass,
                     @RequestParam("salary") String salary,
                     @RequestParam("dept") String dept){
        System.out.println("addItr() called!");
        Response response = new Response();

        boolean result = admManager.addEmp(name,pass,Double.valueOf(salary),dept);
        if (result){
            response.setResponse("added");
        }
        else {
            response.setResponse("failed");
        }
        return response;
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
                    @RequestParam("name") String name,
                    @RequestParam("pass") String pass,
                    @RequestParam("salary") String salary){
        System.out.println("updItr() called!");
        Response response = new Response();

        boolean result = admManager.updEmp(name,pass,Double.valueOf(salary));
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
                    @RequestParam("pass") String pass,
                    @RequestParam("salary") String salary,
                    @RequestParam("dept") String dept){
        System.out.println("updMgr() called!");
        Response response = new Response();

        boolean result = admManager.updMgr(name,pass,Double.valueOf(salary),dept);
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
}
