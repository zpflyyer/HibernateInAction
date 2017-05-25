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
        //��¼�����ͷ�����ҳ�ǲ����ص�
        for (String s:
             IGNORE_URI) {
            if(servletPath.equals(s)){
                System.out.println("����У���·��");
                return  true;
            }
        }

        boolean flag = false;
        String user = (String)httpServletRequest.getSession().getAttribute("user");
        String level = (String)httpServletRequest.getSession().getAttribute("user_level");
        if (user == null || level == null){
            httpServletRequest.setAttribute("message","����δ��¼");
            //�ض��򵽵�¼ҳ
            httpServletRequest.setAttribute("message","δ��¼��");
            httpServletRequest.getRequestDispatcher("/").forward(httpServletRequest,httpServletResponse);
            System.out.println("δ��¼");
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
