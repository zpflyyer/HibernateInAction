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
		<div class="clearfix" style="margin-top: 40px;"></div>
    <div class="container" style="background-color: whitesmoke;">
    	<div class="clearfix" style="margin-top: 20px;"></div>
        <div><h1 style="text-align: center;padding-bottom: 100px;">欢迎使用实习生管理工作流系统</h1></div>
		<div ><br><br></div>
        <div class="col-lg-8 col-lg-offset-2" style="background-color: seashell;">
        	<div><br></div>
            <ul class="nav nav-pills" role="tablist">
              <li role="presentation" class="dropdown">
                <a id="drop4" href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                     <span class="glyphicon glyphicon-user" style="margin-right: 10px;"></span>${username}
                  <span class="caret"></span>
                </a>
                <ul id="menu1" class="dropdown-menu" aria-labelledby="drop4">
                  <li><a href="#">修改密码</a></li>
                  <li role="separator" class="divider"></li>
                  <li><a href="#">完善个人信息</a></li>
                </ul>
              </li>
              <li role="presentation" class="active"><a href="${context}/logout">登出</a></li>
           </ul>
           <div><br></div>
        </div>
        <div class="clearfix" style="margin-bottom: 50px;"></div>
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <div>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#all" aria-controls="all" role="tab" data-toggle="tab">部门实习生管理</a></li>
                    <li role="presentation"><a href="#customer" aria-controls="customer" role="tab" data-toggle="tab">上月实习生发薪记录</a></li>
                    <li role="presentation"><a href="#employee" aria-controls="employee" role="tab" data-toggle="tab">处理申请</a></li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="all">
                        <table class="table table-bordered table-striped" id="employee_tb" contenteditable="false">
                            <thead id="employee_tb_head" >
                                 <tr>
                                    <th>姓名</th>
                                    <th>密码</th>
                                    <th>工资</th>
                                    <th>删除/编辑</th>
                                </tr>
                            </thead>
                            <tbody id="employee_tb_body">
                                <c:forEach var="employee" items="${employeeList}" varStatus="status">
                                    <tr id="${employee.empName}">
                                        <td>${employee.empName}</td>
                                        <td>${employee.empPass}</td>
                                        <td>${employee.amount}</td>
                                        <td>
                                            <button type="button" class="btn btn-sm btn-danger"  data-toggle="modal" data-name="${employee.empName}" data-target="#myModal_del">
                                              <span class="glyphicon glyphicon-remove"></span>
                                            </button>
                                            <button type="button" class="btn btn-sm btn-warning" data-toggle="modal" data-name="${employee.empName}" data-target="#myModal_edit">
                                              <span class="glyphicon glyphicon-edit"></span>
                                            </button>
                                        </td>
                                    </tr>
                               </c:forEach>
                                <tr id="emp_add">
                                    <td></td>
                                    <td></td>
                                    <td></td>
                                    <td>
                                        <button type="button" class="btn btn-sm btn-default" >
                                          <span class="glyphicon glyphicon-plus"></span>
                                        </button>
                                        <button type="button" class="btn btn-sm btn-info" >
                                          <span class="glyphicon glyphicon-refresh"></span>
                                        </button>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="customer">
                        <table class="table table-bordered table-striped" id="depSal_tb" contenteditable="false" >
                            <thead id="depSal_tb_head" >
                                 <tr>
                                    <th>实习生</th>
                                    <th>工资</th>
                                </tr>
                            </thead>
                            <tbody id="depSal_tb_body">
                                <c:forEach var="sal" items="${depSalist}" varStatus="status">
                                    <tr id="${sal.empName}">
                                        <td>${sal.empName}</td>
                                        <td>${sal.amount}</td>
                                    </tr>
                               </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="employee">
                        <c:if test="${not empty appList}">
                            <table class="table table-bordered table-striped" id="app_tb" contenteditable="false">
                                <thead id="app_tb_head" >
                                     <tr>
                                        <th>实习生</th>
                                        <th>考勤日期</th>
                                        <th>考勤类型</th>
                                        <th>申请类型</th>
                                        <th>申请理由</th>
                                        <th>处理</th>
                                    </tr>
                                </thead>
                                <tbody id="app_tb_body">
                                    <c:forEach var="app" items="${appList}" varStatus="status">
                                        <tr >
                                            <td>${app.emp}</td>
                                            <td>${app.date}</td>
                                            <td>${app.unAttend}</td>
                                            <td>${app.toAttend}</td>
                                            <td>${app.reason}</td>
                                            <td><button class="btn btn-link"  id="${app.emp}_handle" data-toggle="modal" data-app_emp="${app.emp}" data-app_date="${app.date}" data-app_id="${app.id}" data-target="#myModal_check">处理</button></td>
                                        </tr>
                                   </c:forEach>
                                </tbody>
                            </table>
                        </c:if>
                        <c:if test="${empty appList}">
                            <div class="clearfix" style="margin-bottom: 70px;"></div>
                            <button class="btn btn-block" id="no" style="padding: 10px;"><span class="glyphicon glyphicon-alert"><a> 尚无申请需要处理</a></span></button>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
        <div class="clearfix" style="margin-bottom: 170px;"></div>
        <div id="text_area"></div>
    </div>

    <!-- Modal -->
    <div class="modal fade" id="myModal_del" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_del">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title text-danger" id="myModalLabel_del" >警告</h4>
          </div>
          <div class="modal-body" id="del_warn">
             确认要删除用户：<span></span> 吗？
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" id="del_warn_y" class="btn btn-primary btn-warning" data-dismiss="modal">删除</button>
          </div>
        </div>
      </div>
    </div>

    <div class="modal fade" id="myModal_edit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_edit">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title text-danger" id="myModalLabel_edit" >更新实习生<span></span>的资料</h4>
              </div>
              <div class="modal-body" id="edit_tip">
                 <form>
                    <div class="form-group">
                        <label for="edit-pass" class="control-label">密码:</label>
                        <input type="text" class="form-control" id="edit_pass">
                    </div>
                    <div class="form-group">
                        <label for="edit-salary" class="control-label">薪水:</label>
                        <input type="number" class="form-control" id="edit_salary"></textarea>
                    </div>
                </form>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="edit_tip_y" class="btn btn-primary btn-warning" data-dismiss="modal">提交更新</button>
              </div>
            </div>
          </div>
    </div>

    <div class="modal fade" id="myModal_check" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_check">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title text-info" id="myModalLabel_check" >处理<span></span>对<span></span>出勤申请的处理</h4>
          </div>
          <div class="modal-body" id="check_info">
            	<div class="form-group">
                    <label for="check_type" class="control-label">申请类型</label>
                    <select class="form-control"  id="check_result">
					    <option value="true">同意</option>
					    <option value="false">驳回</option>
					</select>
                </div>
             <form>
                <div class="form-group">
                    <label for="check_reason" class="control-label">批复说明</label>
						<textarea class="form-control" id="check_reason"></textarea>
                </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default btn-info" data-dismiss="modal">取消</button>
            <button type="button" id="check_y" class="btn btn-primary btn-warning" data-dismiss="modal">提交</button>
          </div>
        </div>
      </div>
	</div>
    <script type="text/javascript">
        $("#myModal_del").on("show.bs.modal",function(e){
            var del_name = $(e.relatedTarget).data("name");
            $("#del_warn span").get(0).innerHTML=del_name;
            $(this).find("#del_warn_y").off("click").on("click",function(){
                var postData_del = {
                	"emp_name" : del_name
                };
                $.post("${context}/manager/delEmpl",postData_del,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    if(statusText=="success"&&response=="deleted"){
                    	$("#"+del_name).remove();
                    	alert("删除成功");
                     }
                     else if(statusText=="success"&&response=="referenced"){
                        alert("无法删除");
                     }
                     else{
                        alert("删除员工失败");
                     }
                },
                "text"
            );
            })
        });
        $("#myModal_edit").on("show.bs.modal",function(e){
            var edit_name = $(e.relatedTarget).data("name");
            $("#myModalLabel_edit span").get(0).innerHTML=edit_name;
            $(this).find("#edit_tip_y").off("click").on("click",function(){
                var postData_edit = {
                    "emp_name" : edit_name,
                    "emp_pass" : $("#edit_pass").get(0).value,
                    "emp_salary" : $("#edit_salary").get(0).value
                };
                $.post("${context}/manager/updEmpl",postData_edit,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    if(statusText=="success"&&response=="updated"){
                        $("#"+edit_name).find("td").get(1).innerHTML=postData_edit.emp_pass;
                        $("#"+edit_name).find("td").get(2).innerHTML=postData_edit.emp_salary;
                     }
                     else{
                        alert("更新员工失败");
                     }
                },
                "text"
            );
            });
        });
        $("#myModal_check").on("show.bs.modal",function(e){
            var app_emp = $(e.relatedTarget).data("app_emp");
            var app_date = $(e.relatedTarget).data("app_date");
            $("#myModalLabel_check span").get(0).innerHTML=app_emp;
            $("#myModalLabel_check span").get(1).innerHTML=app_date;
            $(this).find("#check_y").off("click").on("click",function(){
            var app_id = $(e.relatedTarget).data("app_id");
            var result = $("#check_result").val();
            var reason = $("#check_reason").val();
            var postData_check = {
                "app_id" : app_id,
                "mgr" : "${username}",
                "result" : result,
                "reason" : reason
            };
            alert(app_id+":"+"${username}"+":"+result+":"+reason)
            $.post("${context}/manager/check",postData_check,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    if(statusText=="success"&&response=="added"){
                        alert("已提交");
                        $("#"+app_emp+"_handle").get(0).innerHTML="已处理";
                        $("#"+app_emp+"_handle").attr("disabled",true);
                     }
                     else{
                        alert("提交失败");
                     }
                },

            );
            });
        });
        $("#employee_tb_head tr:only-child").find("th").css("text-align","center");
        $("#employee_tb_body").css("text-align","center");
        $("#depSal_tb_head tr:only-child").find("th").css("text-align","center");
        $("#depSal_tb_body").css("text-align","center");
        $("#app_tb_head tr:only-child").find("th").css("text-align","center");
        $("#app_tb_body").css("text-align","center");
        $("#employee_tb_body tr:last-child").each(
            function(i)
            {
                $(this).find("td:last-child").each(
                    function(i)
                    {
                        $(this).find(".btn-default").on("click"
                            ,function(event)
                            {
                                $("#emp_add").find("td:not('#emp_add td:last-child')").attr("contenteditable","true");
                            }
                        );
                        $(this).find(".btn-info").on("click"
                            ,function(event)
                            {
                                $("#emp_add").find("td").attr("contenteditable","false");
                                var name=$("#emp_add").find("td").get(0).innerHTML;
                                var pass=$("#emp_add").find("td").get(1).innerHTML;
                                var salary=$("#emp_add").find("td").get(2).innerHTML;
                                var postData_add = {
                                    "emp_name" : name,
                                    "emp_pass": pass,
                                    "emp_salary" : salary
                                };
                                $.post("${context}/manager/addEmpl",postData_add,
                                    function(data,statusText){
                                        $("#text_area").innerHTML=statusText;
                                        var response=eval("(" + data + ")").response;
                                        if(statusText=="success"&&response=="added"){
                                             var name_add=eval("(" + data + ")").name;
                                             var pass_add=eval("(" + data + ")").pass;
                                             var salary_add=eval("(" + data + ")").salary;
                                             var new_row = $("#employee_tb_body").find("tr:first-child").clone();
                                             new_row.find("td").get(0).innerHTML=name_add;
                                             new_row.find("td").get(1).innerHTML=pass_add;
                                             new_row.find("td").get(2).innerHTML=salary_add;
                                             $(new_row).find("td:last-child").each(
                                                function(i)
                                                {
                                                   $(this).find(".btn-danger").attr("data-name",name);
                                                   $(this).find(".btn-warning").attr("data-name",name);
                                                   $(this).find(".btn-danger").parents("tr").attr("id",name);
                                                }
                                            );
                                             $("#employee_tb_body").find("tr:last-child").before(new_row);
                                             $("#emp_add").find("td").get(0).innerHTML="";
                                             $("#emp_add").find("td").get(1).innerHTML="";
                                             $("#emp_add").find("td").get(2).innerHTML="";
                                         }
                                         else if(statusText=="success"&&response=="existed"){
                                            alert("该员工已经存在");
                                         }
                                         else {
                                            alert("添加员工失败");
                                         }
                                    },
                                    "text"
                                );
                            }
                        );
                    }
                );
            }
        );
    </script>
</body>
</html>