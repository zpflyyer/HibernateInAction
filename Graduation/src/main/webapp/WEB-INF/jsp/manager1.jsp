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
	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		 <div class="navbar-header">
			 　<!-- .navbar-toggle样式用于toggle收缩的内容，即nav-collapse collapse样式所在元素 -->
			 <button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".navbar-responsive-collapse">
				 <span class="sr-only">Toggle Navigation</span>
				 <span class="icon-bar"></span>
				 <span class="icon-bar"></span>
				 <span class="icon-bar"></span>
			 </button>
			 <!-- 确保无论是宽屏还是窄屏，navbar-brand都显示 -->
			 <a href="##" class="navbar-brand">实习生管理系统</a>
		 </div>
		 <!-- 屏幕宽度小于768px时，div.navbar-responsive-collapse容器里的内容都会隐藏，显示icon-bar图标，当点击icon-bar图标时，再展开。屏幕大于768px时，默认显示。 -->
		 <div class="collapse navbar-collapse navbar-responsive-collapse">
			 <ul class="nav navbar-nav">
	            <li role="presentation"><a href="#all" aria-controls="all" role="tab" data-toggle="tab">部门实习生管理</a></li>
	            <li role="presentation"><a href="#customer" aria-controls="customer" role="tab" data-toggle="tab">上月实习生发薪记录</a></li>
	            <li role="presentation"><a href="#employee" aria-controls="employee" role="tab" data-toggle="tab">处理申请</a></li>
	<!--                    <li role="presentation"><a href="#attends" aria-controls="attends" role="tab" data-toggle="tab">出勤统计</a></li>
	-->
	            <li role="presentation" class="active"><a href="#command" aria-controls="command" role="tab" data-toggle="tab">分配任务</a></li>
	            <li role="presentation"><a href="#tasks" aria-controls="tasks" role="tab" data-toggle="tab">任务进度</a></li>
	            <li class="dropdown">
					 <a href="##" data-toggle="dropdown" class="dropdown-toggle">${username}<span class="caret"></span></a>
					 <ul class="dropdown-menu">
						 <li><a href="##">密码修改</a></li>
						 <li><a href="##">个人信息管理</a></li>
						 <li><a href="##">我的通知</a></li>
						 <li><a href="${context}/logout">登出</a></li>
					 </ul>
			    </li>
			 </ul>
		 </div>
	</div>
	<div class="clearfix" style="margin-bottom: 50px;"></div>

    <div class="container-fluid" style="background-color: whitesmoke;">
    	<div class="clearfix" style="margin-bottom: 100px;"></div>
        <div class="row">
        	<div class="col-md-3">
	    		<ul class="nav nav-tabs nav-stacked affix" data-spy="affix"
				    data-offset-top="70">
					    <li role="presentation" class="active"><a href="#all" aria-controls="all" role="tab" data-toggle="tab">部门实习生管理</a></li>
					    <li role="presentation"><a href="#customer" aria-controls="customer" role="tab" data-toggle="tab">上月实习生发薪记录</a></li>
					    <li role="presentation"><a href="#employee" aria-controls="employee" role="tab" data-toggle="tab">处理申请</a></li>
					    <li role="presentation"><a href="#command" aria-controls="command" role="tab" data-toggle="tab">分配任务</a></li>
					    <li role="presentation"><a href="#tasks" aria-controls="tasks" role="tab" data-toggle="tab">任务进度</a></li>
	    	            <li class="dropdown">
							 <a href="##" data-toggle="dropdown" class="dropdown-toggle">${username}<span class="caret"></span></a>
							 <ul class="dropdown-menu">
								 <li><a href="##">密码修改</a></li>
								 <li><a href="##">个人信息管理</a></li>
								 <li><a href="##">我的通知</a></li>
								 <li><a href="${context}/logout">登出</a></li>
							 </ul>
					    </li>
				</ul>
			</div>	
			<div class="col-md-6 col-md-offset-1">
	            		<div class="tab-content">
	                <div role="tabpanel" class="tab-pane" id="tasks">
	                    <table class="table table-bordered table-striped" id="tasks_tb" contenteditable="false">
	                        <thead id="tasks_tb_head" >
	                             <tr>
	                                <th>任务</th>
	                                <th>实习生</th>
	                                <th>进度</th>
	                                <th>分数</th>
	                                <th>删除/编辑</th>
	                            </tr>
	                        </thead>
	                        <tbody id="tasks_tb_body">
	                            <c:forEach var="task" items="${taskList}" varStatus="status">
	                                <c:forEach var="job" items="${task.jobBeanList}" varStatus="status">
	                                    <tr>
	                                        <td>${task.title}</td>
	                                        <td>${job.intern}</td>
	                                        <td>${job.finished}</td>
	                                        <td>${job.grade}</td>
	                                        <td><button class="btn btn-link"  id="${job.job_id}" data-toggle="modal" data-job_id="${job.job_id}" data-intern="${job.intern}" data-target="#myModal_task">评价</button></td>
	                                    </tr>
	                                </c:forEach>
	                           </c:forEach>
	                        </tbody>
	                    </table>
	                </div>
	                <div role="tabpanel" class="tab-pane" id="all">
	                    <table id="table"></table>
	                    <!-- <table class="table table-bordered table-striped" id="employee_tb" contenteditable="false">
	                        <thead id="employee_tb_head" >
	                             <tr>
	                                <th>姓名</th>
	                                <th>密码</th>
	                                <th>工资</th>
	                                <th>电话</th>
	                                <th>邮箱</th>
	                                <th>入职日期</th>
	                                <th>删除/编辑</th>
	                            </tr>
	                        </thead>
	                        <tbody id="employee_tb_body">
	                            <c:forEach var="employee" items="${employeeList}" varStatus="status">
	                                <tr id="${employee.empName}">
	                                    <td>${employee.empName}</td>
	                                    <td>${employee.empPass}</td>
	                                    <td>${employee.amount}</td>
	                                    <td>${employee.tel}</td>
	                                    <td>${employee.email}</td>
	                                    <td>${employee.board}</td>
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
	                    </table> -->
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
	                                        <td><button class="btn btn-link"  id="${app.emp}_${app.date}" data-toggle="modal" data-app_emp="${app.emp}" data-app_date="${app.date}" data-app_id="${app.id}" data-target="#myModal_check">处理</button></td>
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
	                <div role="tabpanel" class="tab-pane" id="attends">
	                    <table class="table table-bordered table-striped" id="depSal_tb" contenteditable="false" >
	                        <thead id="depSal_tb_head" >
	                             <tr>
	                                <th>实习生</th>
	                                <th>出勤</th>
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
	                <div role="tabpanel" class="tab-pane active" id="command">
	                    <!--
	                    <form:form modelAttribute = "task_vo" action="${context}/manager/assign" method="post">
	                        <table class="table table-bordered table-striped" >
	                            <tr>
	                                <td>任务标题</td>
	                                <td><form:input path = "title"/></td>
	                                <td><font color="red"><form:errors path="title"/></font></td>
	                            </tr>
	                            <tr>
	                                <td>描述</td>
	                                <td><form:textarea path = "content"/></td>
	                                <td><font color="red"><form:errors path="content"/></font></td>
	                            </tr>
	                            <tr>
	                                <td>截止日期</td>
	                                <td><form:input path = "deadline"/></td>
	                                <td><font color="red"><form:errors path="deadline"/></font></td>
	                            </tr>
	                             <tr>
	                                 <td>分配目标</td>
	                                 <td>
	                                    <c:forEach var="emp" items="${employeeList}" varStatus="status">
	                                        <form:checkbox value="${emp.empName}" path="internList" /> ${emp.empName}
	                                    </c:forEach>
	                                 <td>
	                                 <td><font color="red"><form:errors path="internList"/></font></td>
	                             </tr>
	                            <tr>
	                                <td><input type = "submit" value = "提交"/></td>
	                            </tr>
	                        </table>
	                    </form:form>
	                    -->
	                    <form:form modelAttribute = "task_vo"  class="form-horizontal" action="${context}/manager/assign" method="post" style="padding: 35px;">
	                        <font color="red"><form:errors path="title"/></font>
	                        <div class="form-group">
	                            <div class="input-group ">
	                              <span class="input-group-addon" id="title_icon">
	                                <span class="glyphicon glyphicon-header"></span>
	                              </span>
	                              <form:input path="title" type="text" class="form-control" placeholder="题目" aria-describedby="title_icon"/>
	                            </div>
	                        </div>
	                        <font color="red"><form:errors path="content"/></font>
	                        <div class="form-group">
	                            <div class="input-group ">
	                              <span class="input-group-addon" id="content_icon">
	                                <span class="glyphicon glyphicon-book"></span>
	                              </span>
	                              <form:textarea path="content" type="text" class="form-control" placeholder="内容" aria-describedby="content_icon"/>
	                            </div>
	                        </div>
	                        <font color="red"><form:errors path="deadline"/></font>
	                        <div class="form-group">
	                            <div class="input-group ">
	                              <span class="input-group-addon" id="deadline_icon">
	                                <span class="glyphicon glyphicon-time"></span>
	                              </span>
	                              <form:input path="deadline" type="text" class="form-control" placeholder="截止日期" aria-describedby="deadline_icon"/>
	                            </div>
	                        </div>
	                        <font color="red"><form:errors path="internList"/></font>
	                        <div class="form-group">
	                            <div class="input-group ">
	                            <span class="input-group-addon" id="deadline_icon">
	                               <span class="glyphicon glyphicon-user" ></span>
	                            </span>
	                              <c:forEach var="emp" items="${employeeList}" varStatus="status">
	                                  <form:checkbox value="${emp.empName}" path="internList" style="margin-left:15px;"/> ${emp.empName}
	                              </c:forEach>
	                            </div>
	                        </div>
	                        <button type="submit"  class="btn btn-success btn-block">提 交</button>
	                    </form:form>
	                </div>
	            </div>
	    			</div>
		
            <div class="clearfix" style="margin-bottom: 170px;"></div>
   		</div>
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
                        <input type="password" class="form-control" id="edit_pass">
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

    <div class="modal fade" id="myModal_task" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_task">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title text-danger" id="myModalLabel_task" >批阅实习生<span></span>的任务完成情况</h4>
          </div>
          <div class="modal-body" id="task_tip">
             <form>
                <div class="form-group">
                    <label for="input_grade" class="control-label">分数:</label>
                    <input type="number" class="form-control" id="input_grade">
                </div>
                <div class="form-group">
                	<label for="check_finished" class="control-label">申请类型</label>
                    <select class="form-control" name="check_finished" id="type_select">
				    	<option value=true>完成</option>
				    	<option value=false>未完成</option>
					</select>
                </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" id="task_tip_y" class="btn btn-primary btn-warning" data-dismiss="modal">提交更新</button>
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
	${empData}
    <script type="text/javascript">
        $('.container-fluid').height($(window).height());
        $("#table").bootstrapTable({
            columns: [{
                checkbox:true
            },
            {
                field: 'empName',
                title: '姓名',
                align:'center'
            }, {
                field: 'empPass',
                title: '密码',
                align:'center',
                editable: {
                    type: 'password',
                    title: '密码',
                    validate: function (v) {
                        if (!v) return '密码不能为空';
                        if (v.legnth < 8) return '密码长度不得小于8位';
                    }
                 },
            }, {
                field: 'amount',
                title: '薪水',
                align:'center',
                  editable: {
                        type: 'number',
                        title: '薪水',
                        validate: function (v) {
                            if (!v) return '薪水不能为空';
                            if (isNaN(v)) return '薪水必须是数字';
                            var age = parseInt(v);
                            if (age <= 0) return '薪水必须是正整数';
                        }
                   },
            }, {
                 field: 'tel',
                 title: '电话',
                 align:'center',
                   editable: {
                         type: 'number',
                         title: '电话',
                         validate: function (v) {
                             if (!v) return '电话不能为空';
                         }
                    },
            }, {
                  field: 'email',
                  title: '邮箱',
                  align:'center',
                    editable: {
                          type: 'email',
                          title: '邮箱',
                          validate: function (v) {
                              if (!v) return '邮箱不能为空';
                          }
                     },
            }, {
                 field: 'board',
                 title: '入职日期',
                 align:'center'
            }],
            url: '${context}/manager/getEmpByMgr',
            method: 'post',
            search:true,
            striped:true,
            sortName: "amount",
            sortOrder:"desc",
            pageList:'[3,5,10]',
            pagination:true,
            searchOnEnterKey:true,
            showColumns:true,
            showToggle:true,
            showPaginationSwitch:true,
            searchAlign:'left',
            paginationHAlign:'right',
            paginationPreText:'<',
            paginationNextText:'>',
            clickToSelect:false,
            maintainSelected:false,
　　　　　　 onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: '${context}/manager/updEmpl',
                    data: row,
                    success: function (data, status) {
                        if (status == "success") {
                            alert("编辑成功");
                        }
                    },
                    error: function () {
                        alert("Error");
                    },
                    complete: function () {
                    }
                });
            }

        });
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
                alert(response);
                if(statusText=="success"&&response=="checked"){
                    alert("#"+app_emp);
                    $("#"+app_emp+"_"+app_date).get(0).innerHTML="已处理";
                    $("#"+app_emp+"_"+app_date).attr("disabled",true);
                 }
                 else{
                    alert("提交失败");
                 }
            },
            "text"
        );
        });
    });
    $("#myModal_task").on("show.bs.modal",function(e){
        var job_id = $(e.relatedTarget).data("job_id");
        var intern = $(e.relatedTarget).data("intern");
        $("#myModalLabel_task span").get(0).innerHTML=intern;

        $(this).find("#task_tip_y").off("click").on("click"
        ,function(){
            var finished = $("#check_finished").val();
            var grade = $("#input_grade").val();
            var postData_task = {
                "job_id" : job_id,
                "grade" : grade,
                "finished" : finished
            };
            alert(job_id+":"+grade+":"+finished)
            $.post("${context}/manager/judge",postData_task,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    alert(response);
                    if(statusText=="success"&&response=="succeed"){
                        $("#"+app_emp+"_"+app_date).get(0).innerHTML="已处理";
                        $("#"+app_emp+"_"+app_date).attr("disabled",true);
                     }
                     else{
                        alert("提交失败");
                     }
                },
                "text"
            );
       });
    });
    $("#employee_tb_head tr:only-child").find("th").css("text-align","center");
    $("#employee_tb_body").css("text-align","center");
    $("#depSal_tb_head tr:only-child").find("th").css("text-align","center");
    $("#depSal_tb_body").css("text-align","center");
    $("#app_tb_head tr:only-child").find("th").css("text-align","center");
    $("#app_tb_body").css("text-align","center");
    $("#tasks_tb_head tr:only-child").find("th").css("text-align","center");
    $("#tasks_tb_body").css("text-align","center");
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