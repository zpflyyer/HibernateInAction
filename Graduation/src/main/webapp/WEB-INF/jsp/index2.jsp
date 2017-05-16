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
<body>
<%@include file="head.jsp" %>
    <div class="clearfix" style="margin-top: 40px;"></div>
    <div class="container" style="background-color: whitesmoke;">
    	<div class="clearfix" style="margin-top: 80px;"></div>
        <div><h1 style="text-align: center;margin-bottom: 95px;">欢迎使用实习生管理工作流系统</h1></div>
        <div class="row">
            <div class="col-lg-4 col-lg-offset-4" >
                <font color="red">${requestScope.message}</font>
                <sf:form modelAttribute = "user" id="login_form" class="form-horizontal" action="${context}/login" method="post" style="padding: 30px;border:groove;background-color: #AFD9EE;">
                    <font color="red"><sf:errors path="empName"/></font>
                    <div class="form-group">
                        <div class="input-group ">
                          <span class="input-group-addon" id="basic-addon1">
                            <span class="glyphicon glyphicon-user"></span>
                          </span>
                          <sf:input id="userName" name="username" path="empName" type="text" class="form-control" placeholder="用户名" aria-describedby="basic-addon1"/>
                        </div>
                    </div>
                    <font color="red"><sf:errors path="empPass"/></font>
                    <div class="form-group">
                        <div class="input-group ">
                          <span class="input-group-addon" id="basic-addon1">
                            <span class="glyphicon glyphicon-lock"></span>
                          </span>
                          <sf:input id="passWord" name="password" path="empPass" type="password" class="form-control" placeholder="密码" aria-describedby="basic-addon1"/>
                        </div>
                    </div>
                    <button type="submit"  class="btn btn-success btn-block">登 录</button>
                </sf:form>
            <div>
        </div>
        <div class="clearfix" style="margin-top: 300px;"></div>
    </div>
</body>
<script type="text/javascript">
    $(function () {
        $("#login_form").bootstrapValidator({
            message: 'This value is not valid',
            feedbackIcons: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                username: {
                    message: '用户名验证失败',
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        },
                        stringLength: {
                            min: 6,
                            max: 18,
                            message: '用户名长度必须在6到10位之间'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '用户名只能包含大写、小写、数字和下划线'
                        }
                    }
                },
                password: {
                    validators: {
                        notEmpty: {
                            message: '米玛不能为空'
                        },
                         stringLength: {
                             min: 6,
                             max: 18,
                             message: '密码长度必须在6到18位之间'
                         },
                          regexp: {
                              regexp: /^[a-zA-Z0-9_]+$/,
                              message: '密码只能包含大写、小写、数字和下划线'
                          }
                    }
                }
            }
        });
    });
</script>
</html>