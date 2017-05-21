<%--
  User: yy
  Date: 3/11/14
  Time: 4:37 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<html>
<%@include file="head.jsp" %>
<body class="gray-bg">
    <div class="loginColumns animated fadeInDown">
	    <!--<div>
	        <h4 class="logo-name">IMS</h1>
	    </div>-->
        <div class="row">

            <div class="col-md-6">
                <h2 class="font-bold">欢迎使用IMS</h2>

                <p>
                    IMS (Internship Management System) 专注于实习生管理服务.
                </p>

                <p>
                    IMS有哪些特点：
                    <ul>
                    	<li> 美观的UI设计，使得您的访问和交互体验非凡.</li>
                    	<li> 便捷的信息管理操作，给您高效直接的操作效率.</li>
                    	<li> 智能化的工作流方式，让您的工作更加轻松.</li>
                    </ul>
                </p>
                <p>
                	为什么选择IMS：
                    <ul>
                    	<li> 选择IMS，选择愉快的实习体验.</li>
                    	<li> 选择IMS，选择专业的实习生管理方式.</li>
                    </ul>
                </p>
            </div>
            <div class="col-md-6">
                <div class="ibox-content">
                    <font color="red">${requestScope.message}</font>
                    <sf:form class="m-t" modelAttribute = "user" role="form" action="${context}/login" method="post">
                        <font color="red"><sf:errors path="empName"/></font>
                        <div class="form-group">
                            <sf:input path="empName" type="text" class="form-control" placeholder="用户名" required="">
                        </div>
                        <font color="red"><sf:errors path="empPass"/></font>
                        <div class="form-group">
                            <sf:input path="empPass" type="password" class="form-control" placeholder="密码" required="">
                        </div>
                        <button type="submit" class="btn btn-primary block full-width m-b">登录</button>

                        <a href="login_two_columns.html#">
                            <small>忘记密码?</small>
                        </a>

                        <p class="text-muted text-center">
                            <small>还没有IMS账号?</small>
                        </p>
                        <a class="btn btn-sm btn-white btn-block" href="register.html">创建您的IMS账号</a>
                    </sf:form>
                    <p class="m-t">
                        <small>IMS的设计来自Pengfei.Zhao@163.com &copy; 2017</small>
                    </p>
                </div>
            </div>
        </div>
        <hr/>
        <div class="row">
            <div class="col-md-6">
                                     系统 设计和开发版权归Pengfei.Zhao@163.com所有，侵权必究
            </div>
            <div class="col-md-6 text-right">
               <small>© 2017-2021</small>
            </div>
        </div>
    </div>

</body>

</html>
