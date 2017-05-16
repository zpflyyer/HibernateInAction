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
                <form modelAttribute = "user" id="login_form" class="form-horizontal" action="${context}/login" method="post" style="padding: 30px;border:groove;background-color: #AFD9EE;">
                    <font color="red"><errors path="empName"/></font>
                    <div class="form-group">
                        <label>Username</label><font color="red"><errors path="empName"/></font>
                        <input type="text" class="form-control" name="username" path="empName"/>
                    </div>
                    <div class="form-group">
                        <label>Email address</label><font color="red"><errors path="empPass"/></font>
                        <input type="password" class="form-control" name="email" path="empPass"/>
                    </div>
                    <div class="form-group">
                        <button type="submit" name="submit" class="btn btn-primary">Submit</button>
                    </div>
                </form>
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
                        regexp: {
                            regexp: /^[a-zA-Z0-9_]+$/,
                            message: '用户名只能包含大写、小写、数字和下划线'
                        }
                    }
                },
                email: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        },
                         stringLength: {
                             min: 3,
                             max: 12,
                             message: '密码长度必须在3到12位之间'
                         }
                    }
                }
            }
        });
    });
</script>
</html>