index.jsp<%--
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
                <table class="table table-bordered" id="employee_tb">
                    <thead>
                         <tr>
                            <th>姓名</th>
                            <th>密码</th>
                            <th>工资</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="employee" items="${employeeList}" varStatus="status">
                            <tr id="${employee.empName}">
                                <td>${employee.empName}</td>
                                <td>${employee.empPass}</td>
                                <td>${employee.amount}</td>
                                <td>
                                    <button type="button" id="${employee.empName}_del" class="btn btn-sm" >
                                      <span class="glyphicon glyphicon-remove"></span>
                                    </button>
                                    <button type="button" id="${employee.empName}_edit" class="btn btn-sm" >
                                      <span class="glyphicon glyphicon-edit"></span>
                                    </button>
                                </td>
                            </tr>
                        </c:forEach>
                        <tr id="add_emp">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>
                                <button type="button" class="btn btn-sm" >
                                  <span class="glyphicon glyphicon-plus"></span>
                                </button>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>