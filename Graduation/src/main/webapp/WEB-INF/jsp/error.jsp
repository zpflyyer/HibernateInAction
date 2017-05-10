<%--
  User: yy
  Date: 3/11/14
  Time: 4:37 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<html>
<body>
<%@include file="head.jsp" %>
    <div class="container">
        <div class="row">
            <div>
                <div class="alert alert-danger alert-dismissible fade in" role="alert">
                  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button>
                  <h4>登录失败!</h4>
                  <p>用户名和密码不匹配.</p>
                  <p>
                    <a href="#"><button type="button" class="btn btn-success">找回密码</button></a>
                  </p>
                </div>
                <form action="${context}/login" method="post">
                      <div class="form-group">
                        <label for="exampleInputEmail1" >
                              <span class="glyphicon glyphicon-user"></span>
                        </label>
                        <input type="text" name="username" class="form-control" id="exampleInputEmail1" placeholder="Email">
                      </div>
                      <div class="form-group">
                        <label for="exampleInputPassword1">
                            <span class="glyphicon glyphicon-lock"></span>
                        </label>
                        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                      </div>
                      <button type="submit" class="btn btn-default">登录</button>
                    </form>
            </div>
        </div>
    </div>
</body>
</html>