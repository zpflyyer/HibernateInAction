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
              <li role="presentation" ><a>
              	当前身份:
              	<c:if test="${role == 'admin'}">
              		管理员
              	</c:if>
              	<c:if test="${role == 'manager'}">
              		经理
              	</c:if>
              	<c:if test="${role == 'intern'}">
              		实习生
              	</c:if>
              </a></li>
           </ul>
           <div><br></div>
        </div>
        <div class="clearfix" style="margin-bottom: 50px;"></div>
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <div>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#itr" aria-controls="itr" role="tab" data-toggle="tab">实习生管理</a></li>
                    <li role="presentation"><a href="#mgr" aria-controls="mgr" role="tab" data-toggle="tab">经理管理</a></li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="itr">
                        <table class="table table-bordered table-striped" id="employee_tb" contenteditable="false">
                            <thead id="itr_tb_head" >
                                 <tr>
                                    <th>姓名</th>
                                    <th>密码</th>
                                    <th>工资</th>
                                    <th>部门</th>
                                    <th>删除/编辑</th>
                                </tr>
                            </thead>
                            <tbody id="itr_tb_body">
                                <c:forEach var="employee" items="${employeeList}" varStatus="status">
                                    <tr id="${employee.empName}">
                                        <td>${employee.empName}</td>
                                        <td>${employee.empPass}</td>
                                        <td>${employee.amount}</td>
                                        <td>${employee.dept}</td>
                                        <td>
                                            <button type="button" class="btn btn-sm btn-danger"  data-toggle="modal" data-name="${employee.empName}" data-target="#myModal_del">
                                              <span class="glyphicon glyphicon-remove"></span>
                                            </button>
                                            <button type="button" class="btn btn-sm btn-warning" data-toggle="modal" data-name="${employee.empName}" data-target="#myModal_edit">
                                              <span class="glyphicon glyphicon-edit"></span>
                                            </button>
                                             <button type="button" class="btn btn-sm btn-info" data-toggle="modal" data-name="${employee.empName}" data-target="#myModal_merge">
                                              <span class="glyphicon glyphicon-move"></span>
                                            </button>                                           
                                        </td>
                                    </tr>
                               </c:forEach>
                                <tr id="emp_add">
                                    <td></td>
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
                    <div role="tabpanel" class="tab-pane" id="mgr">
                        <table class="table table-bordered table-striped" id="employee_tb" contenteditable="false">
                            <thead id="mgr_tb_head" >
                                 <tr>
                                    <th>姓名</th>
                                    <th>密码</th>
                                    <th>部门</th>
                                    <th>删除/编辑</th>
                                </tr>
                            </thead>
                            <tbody id="mgr_tb_body">
                                <c:forEach var="mgr" items="${mgrList}" varStatus="status">
                                    <tr id="${mgr.mgrName}">
                                        <td>${mgr.mgrName}</td>
                                        <td>${mgr.mgrPass}</td>
                                        <td>${mgr.mgrDept}</td>
                                        <td>
                                            <button type="button" class="btn btn-sm btn-danger"  data-toggle="modal" data-name="${mgr.mgrName}" data-target="#myModal_del_mgr">
                                              <span class="glyphicon glyphicon-remove"></span>
                                            </button>
                                            <button type="button" class="btn btn-sm btn-warning" data-toggle="modal" data-name="$${mgr.mgrName}" data-target="#myModal_edit_mgr">
                                              <span class="glyphicon glyphicon-edit"></span>
                                            </button>
                                             <button type="button" class="btn btn-sm btn-info" data-toggle="modal" data-name="$${mgr.mgrName}" data-target="#myModal_merge_mgr">
                                              <span class="glyphicon glyphicon-move"></span>
                                            </button>
                                        </td>
                                    </tr>
                               </c:forEach>
                            </tbody>
                        </table>
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
    
    <div class="modal fade" id="myModal_merge" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_merge">
          <div class="modal-dialog" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title text-danger" id="myModalLabel_merge" >迁移实习生<span></span></h4>
              </div>
              <div class="modal-body" id="merge_tip">
			         	<div class="form-group">
	                <label for="merge_to" class="control-label">迁移到</label>
	                <select class="form-control" name="merge_to" id="merge_select">
	                	<c:forEach var="mgr" items="${mgrlist}" varStatus="status">
								    	<option value="${mgr.mgrName}">${mgr.mgrName}</option>
								    </c:forEach>
									</select>
		            </div>                
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button type="button" id="merge_tip_y" class="btn btn-primary btn-warning" data-dismiss="modal">提交</button>
              </div>
            </div>
          </div>
    </div>
    
    <script type="text/javascript">
        $("#itr_tb_head tr:only-child").find("th").css("text-align","center");
        $("#itr_tb_body").css("text-align","center");
        
        $("#mgr_tb_head tr:only-child").find("th").css("text-align","center");
        $("#mgr_tb_body").css("text-align","center");
        
        $("#myModal_del").on("show.bs.modal",function(e){
            var del_name = $(e.relatedTarget).data("name");
            $("#del_warn span").get(0).innerHTML=del_name;
            $(this).find("#del_warn_y").off("click").on("click",function(){
                var postData_del = {
                	"name" : del_name
                };
                $.post("${context}/admin/delItr",postData_del,
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
                    "name" : edit_name,
                    "pass" : $("#edit_pass").get(0).value,
                    "salary" : $("#edit_salary").get(0).value
                };
                $.post("${context}/admin/updItr",postData_edit,
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
        
        $("#myModal_merge").on("show.bs.modal",function(e){
            var merge_name = $(e.relatedTarget).data("name");
            $("#myModalLabel_merge span").get(0).innerHTML=merge_name;
            $(this).find("#merge_tip_y").off("click").on("click",function(){
                var postData_edit = {
                    "itr" : edit_name,
                    "mgr" : $("#merge_select").val()
                };
                $.post("${context}/admin/merge",postData_edit,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    if(statusText=="success"&&response=="merged"){
                        $("#"+edit_name).find("td").get(3).innerHTML=postData_edit.mgr;
                     }
                     else{
                        alert("迁移失败");
                     }
                },
                "text"
            );
            });
        });        
      
        $("#itr_tb_body tr:last-child").each(
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
                                var mgr=$("#emp_add").find("td").get(3).innerHTML;
                                alert(name+pass+salary+mgr);
                                var postData_add = {
                                    "name" : name,
                                    "pass": pass,
                                    "salary" : salary,
                                    "dept" : dept
                                };
                                $.post("${context}/admin/addItr",postData_add,
                                    function(data,statusText){
                                        var response=eval("(" + data + ")").response;
                                        if(statusText=="success"&&response=="added"){
                                             alert("添加员工成功");
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