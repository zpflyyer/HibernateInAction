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
        <!-- 点击触发后，将内容进行更改data-complete-text表示为完成后的内容 -->
        <button  type="button"   class="btn btn-primary  mybtn"  data-complete-text="finish"  autocomplete="off">点击后内容自动更改</button>
        <script>
           $('.mybtn').on('click', function () {
                $(this).button('complete') // 内容将变为finish
            })
        </script>

        <div class="row">
            <div>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#all" aria-controls="all" role="tab" data-toggle="tab">所有人</a></li>
                    <li role="presentation"><a href="#customer" aria-controls="customer" role="tab" data-toggle="tab">客户</a></li>
                    <li role="presentation"><a href="#employee" aria-controls="employee" role="tab" data-toggle="tab">雇员</a></li>
                    <li role="presentation"><a href="#manager" aria-controls="manager" role="tab" data-toggle="tab">经理</a></li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="all">
                        <table class="table table-bordered" id="all_tb">
                            <thead>
                                 <tr>
                                    <th>ID</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>省份</th>
                                    <th>城市</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="person" items="${personList}" varStatus="status">
                                    <tr>
                                        <td>${person.id}</td>
                                        <td>${person.name}</td>
                                        <td>${person.gender}</td>
                                        <td>${person.age}</td>
                                        <td>${person.address.province}</td>
                                        <td>${person.address.city}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="customer">
                        <table class="table table-bordered" id="customer_tb">
                            <thead>
                                 <tr>
                                    <th>ID</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>省份</th>
                                    <th>城市</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="customer" items="${customerList}" varStatus="status">
                                    <tr>
                                        <td>${customer.id}</td>
                                        <td>${customer.name}</td>
                                        <td>${customer.gender}</td>
                                        <td>${customer.age}</td>
                                        <td>${customer.address.province}</td>
                                        <td>${customer.address.city}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="employee">
                        <table class="table table-bordered" id="employee_tb">
                            <thead>
                                 <tr>
                                    <th>ID</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>省份</th>
                                    <th>城市</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="employee" items="${employeeList}" varStatus="status">
                                    <tr>
                                        <td>${employee.id}</td>
                                        <td>${employee.name}</td>
                                        <td>${employee.gender}</td>
                                        <td>${employee.age}</td>
                                        <td>${employee.address.province}</td>
                                        <td>${employee.address.city}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="manager">
                        <table class="table table-bordered" id="manager_tb">
                            <thead>
                                 <tr>
                                    <th>ID</th>
                                    <th>姓名</th>
                                    <th>性别</th>
                                    <th>年龄</th>
                                    <th>省份</th>
                                    <th>城市</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="manager" items="${managerList}" varStatus="status">
                                    <tr>
                                        <td>${manager.id}</td>
                                        <td>${manager.name}</td>
                                        <td>${manager.gender}</td>
                                        <td>${manager.age}</td>
                                        <td>${manager.address.province}</td>
                                        <td>${manager.address.city}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>