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
        <div><h1 style="text-align: center;padding-bottom: 150px;">欢迎使用实习生管理工作流系统</h1></div>
        <div class="col-lg-8 col-lg-offset-2" style="background-color: seashell;">
        	<div class="clearfix" style="padding-top: 15px;"></div>
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
           <div class="clearfix" style="padding-top: 15px;"></div>
        </div>
        <div class="clearfix" style="padding-bottom: 30px;"></div>
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <div>
                <!-- Nav tabs -->
                <ul class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active"><a href="#unAttend" aria-controls="unAttend" role="tab" data-toggle="tab">近三天非正常出勤</a></li>
                    <li role="presentation"><a href="#mySal" aria-controls="mySal" role="tab" data-toggle="tab">我的发薪记录</a></li>
                    <li role="presentation"><a href="#employee" aria-controls="employee" role="tab" data-toggle="tab">打卡</a></li>
                    <li role="presentation"><a href="#manager" aria-controls="manager" role="tab" data-toggle="tab">。。</a></li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div role="tabpanel" class="tab-pane active" id="unAttend">
                        <table class="table table-bordered table-striped" id="unAttend_tb" contenteditable="false">
                            <thead id="unAttend_tb_head" >
                                 <tr>
                                    <th>出勤记录编号</th>
                                    <th>日期</th>
                                    <th>原因</th>
                                    <th>时间</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody id="unAttend_tb_body">
                                <c:forEach var="unAtt" items="${unAttendList}" varStatus="status">
                                    <tr id="${unAtt.id}">
                                        <td>${unAtt.id}</td>
                                        <td>${unAtt.dutyDay}</td>
                                        <td>${unAtt.unType}</td>
                                        <td>${unAtt.time}</td>
                                        <td><button class="btn btn-link"  id="${unAtt.id}_app" data-toggle="modal" data-att_date="${unAtt.dutyDay}" data-att_id="${unAtt.id}" data-target="#myModal_app">申请</button></td>
                                    </tr>
                               </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="mySal">
                        <table class="table table-bordered table-striped" id="sals_tb" contenteditable="false" >
                            <thead id="sals_tb_head" >
                                 <tr>
                                    <th>发薪时间</th>
                                    <th>工资</th>
                                </tr>
                            </thead>
                            <tbody id="sals_tb_body">
                                <c:forEach var="sal" items="${salist}" varStatus="status">
                                    <tr >
                                        <td>${sal.payMonth}</td>
                                        <td>${sal.amount}</td>
                                    </tr>
                               </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="employee">
                    	<div class="clearfix" style="padding-top: 110px;"></div>
                		<div class="row">
                			<c:if test="${valid == 0}">
                				<button class="btn btn-block" id="no" style="padding: 10px;"><span class="glyphicon glyphicon-alert"><a> 抱歉，现在不在打卡时间范围内</a></span></button>
               				</c:if>
               				<c:if test="${valid == 1 || valid == 3}">
                				<div class="clearfix" style="padding-top: 20px;"></div>
                				<button class="btn btn-block" id="come_punch" style="padding: 10px;"><span class="glyphicon glyphicon-import"><a> 上班打卡</a></span></button>
               				</c:if>
               				<c:if test="${valid == 2 || valid == 3}">
                				<div class="clearfix" style="padding-top: 20px;"></div>
                				<button class="btn btn-block" id="leave_punch" style="padding: 10px;"><span class="glyphicon glyphicon-export"><a> 下班打卡</a></span></button>
               				</c:if>
                		</div>
                    </div>
                    <div role="tabpanel" class="tab-pane" id="manager">

                    </div>
                </div>
            </div>
        </div>
        <div class="clearfix" style="padding-bottom: 270px;"></div>
        <div id="text_area"></div>
    </div>

    <div class="modal fade" id="myModal_app" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_app">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title text-danger" id="myModalLabel_app" >对<span></span>的非正常出勤提出申请</h4>
          </div>
          <div class="modal-body" id="app_info">
             <form>
                <div class="form-group">
                    <label for="app_type" class="control-label">申请类型</label>
                    <select class="form-control" name="app_type" id="type_select">
                    	<c:forEach var="type" items="${typeList}" varStatus="status">
										    <option value="${type.id}">${type.name}</option>
										  </c:forEach>
										</select>
                </div>
                <div class="form-group">
                    <label for="app_reason" class="control-label">申请原因</label>
 										<textarea class="form-control" id="app_reason"></textarea>
                </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" id="app_y" class="btn btn-primary btn-warning" data-dismiss="modal">提交申请</button>
          </div>
        </div>
      </div>
		</div>

    <script type="text/javascript">
        $("#myModal_app").on("show.bs.modal",function(e){
            $(this).find("#app_y").off("click").on("click",function(){
            	var att_id = $(e.relatedTarget).data("att_id");
	            var att_date = $(e.relatedTarget).data("att_date");
	            var att_type = $("#type_select").val();
	            var reason = $("#app_reason").val();

	            $("#myModalLabel_app span").get(0).innerHTML=att_date;
                var postData_app = {
                    "att_id" : att_id,
                    "type_id" : att_type,
                    "reason" : reason
                };
                $.post("${context}/employee/addApp",postData_app,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    alert(response);
                    if(statusText=="success"&&response=="added"){
                    		alert("已申请，待处理");
                        $("#"+att_id+"_app").get(0).innerHTML="已申请，待处理";
                        $("#"+att_id+"_app").get(0).attr("disabled",true);
                     }
                     else{
                        alert("提交失败");
                     }
                },
                "text"
            );
            });
        });
        $("#unAttend_tb_head tr:only-child").find("th").css("text-align","center");
        $("#unAttend_tb_body").css("text-align","center");
        $("#sals_tb_head tr:only-child").find("th").css("text-align","center");
        $("#sals_tb_body").css("text-align","center");
        $("#come_punch").on("click"
        	,function(){
        		var postData_come = {
        			"isCome" : true
        		};
        		$.post("${context}/employee/punch",postData_come,
        		function(data,statusText){
        			var response=eval("(" + data + ")").response;
        			alert(response);
        			if(statusText=="success"&&response=="success"){
                		alert("上班打卡成功");
                    	$("#come_punch span").find("a").get(0).innerHTML="上班打卡已完成";
	                 }
	                 else if(statusText=="success"&&response=="punched"){
	                    alert("您已经打过上班卡了，请勿重复打卡");
	                    $("#come_punch span").find("a").get(0).innerHTML="您已经打过上班卡了，请勿重复打卡";
	                 }
					 else{
	                    alert("上班打卡失败");
	                    $("#come_punch span").find("a").get(0).innerHTML="上班打卡失败";
	                }
					$("#come_punch").attr("disabled",true);
        		},
        		"text"
        		);
        	}
    	);
    	$("#leave_punch").on("click"
        	,function(){
        		var postData_come = {
        			"isCome" : false
        		};
        		$.post("${context}/employee/punch",postData_come,
        		function(data,statusText){
        			var response=eval("(" + data + ")").response;
        			if(statusText=="success"&&response=="success"){
                		alert("下班打卡成功");
                    	$("#leave_punch span").find("a").get(0).innerHTML="下班打卡已完成";
	                 }
	                 else if(statusText=="success"&&response=="punched"){
	                    alert("您已经打过下班卡了，请勿重复打卡");
	                    $("#leave_punch span").find("a").get(0).innerHTML="您已经打过下班卡了，请勿重复打卡";
	                 }
					 else{
	                    alert("下班打卡失败");
	                    $("#leave_punch span").find("a").get(0).innerHTML="下班打卡失败";
	                }
					$("#leave_punch").attr("disabled",true);
        		},
        		"text"
        		);
        	}
    	);
    </script>
</body>
</html>