<%--
  User: yy
  Date: 3/11/14
  Time: 4:37 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<html>
<body>
<%@include file="head.jsp" %>
		<div class="clearfix" style="margin-top: 40px;"></div>
    <div class="container" style="background-color: whitesmoke;">
    	<div class="clearfix" style="margin-top: 80px;"></div>
        <div><h1 style="text-align: center;margin-bottom: 95px;">欢迎使用实习生管理工作流系统</h1></div>
        <div class="row">
            <div class="col-lg-4 col-lg-offset-4" >
                <div class="alert alert-danger alert-dismissible fade in" role="alert">
                  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                  <h4>${requestScope.message}!</h4>
                </div>
                <form:form modelAttribute = "user" class="form-horizontal" action="${context}/login" method="post" style="padding: 30px;border:groove;background-color: #AFD9EE;">
                    <div class="form-group">
                        <div class="input-group ">
                          <span class="input-group-addon" id="basic-addon1">
                            <span class="glyphicon glyphicon-user"></span>
                          </span>
                          <form:input id="userName" path="empName" type="text" class="form-control" placeholder="用户名" aria-describedby="basic-addon1"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group ">
                          <span class="input-group-addon" id="basic-addon1">
                            <span class="glyphicon glyphicon-lock"></span>
                          </span>
                          <form:input id="passWord" path="empPass" type="password" class="form-control" placeholder="密码" aria-describedby="basic-addon1"/>
                        </div>
                    </div>
                    <font color="red"><form:errors path="empPass"/></font> <font color="red"><form:errors path="empPass"/></font>
                    <button type="submit"  class="btn btn-success btn-block">登 录</button>
                </form:form>
            <div>
        </div>
        <div class="clearfix" style="margin-top: 300px;"></div>
    </div>
</body>
</html>