package com.pengfei.inheritence.Controller;

import com.pengfei.inheritence.Service.PersonService;
import com.pengfei.inheritence.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Field;
import java.util.List;


/**
 * Created by zhaopen on 4/30/2017.
 */
@Controller
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView getHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("personList",personService.getAll());
        modelAndView.addObject("employeeList",personService.getAllEmpl());
        modelAndView.addObject("managerList",personService.getAllManag());
        modelAndView.addObject("customerList",personService.getAllCustom());
        System.out.println(personService.getAll());
        System.out.println(personService.getAllEmpl());
        System.out.println(personService.getAllManag());
        System.out.println(personService.getAllCustom());
        return modelAndView;
    }

    @RequestMapping(value = "bt",method = RequestMethod.GET)
    ModelAndView getBootstrap(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("template");
        return modelAndView;
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    ModelAndView getLogin(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = "str")
    @ResponseBody
    public String handleAjaxStr(){
        return "hello-world!你好";
    }

    @RequestMapping(value = "json")
    @ResponseBody
    public List<Person> handleAjaxJson(){
        return personService.getAll();
    }
}

