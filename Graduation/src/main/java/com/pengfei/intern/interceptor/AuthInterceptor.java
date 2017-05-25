package com.pengfei.intern.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhaopen on 5/13/2017.
 */
public class AuthInterceptor implements HandlerInterceptor {
    private static String[] IGNORE_URI = {"/login","/","/logout"};
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String servletPath = httpServletRequest.getServletPath();
        //登录操作和访问首页是不拦截的
        for (String s:
             IGNORE_URI) {
            if(servletPath.equals(s)){
                System.out.println("无需校验的路径");
                return  true;
            }
        }

        boolean flag = false;
        String user = (String)httpServletRequest.getSession().getAttribute("user");
        String level = (String)httpServletRequest.getSession().getAttribute("user_level");
        if (user == null || level == null){
            httpServletRequest.setAttribute("message","您还未登录");
            //重定向到登录页
            httpServletRequest.setAttribute("message","未登录！");
            httpServletRequest.getRequestDispatcher("/").forward(httpServletRequest,httpServletResponse);
            System.out.println("未登录");
            return flag;
        }
        else flag = true;

        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
