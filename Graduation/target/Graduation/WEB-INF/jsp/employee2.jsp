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

    <div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav nav-tab metismenu" id="side-menu">
                <li class="nav-header">
                    <div class="dropdown profile-element"> <span>
                            <img alt="image" class="img-circle" src="${context}/img/profile_small.jpg" />
                             </span>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="table_data_tables.html#">
                            <span class="clear"> <span class="block m-t-xs"> <strong class="font-bold">${role}</strong>
                             </span> <span class="text-muted text-xs block">${username}<b class="caret"></b></span> </span> </a>
                        <ul class="dropdown-menu animated fadeInRight m-t-xs">
                            <li><a data-toggle="modal" data-target="#edit_pwd">修改密码</a></li>
                            <li class="divider"></li>
                            <li><a href="${context}/logout">登出</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        IMS
                    </div>
                </li>
                <li><a href="#unatt_tab" aria-controls="unatt_tab" role="tab" data-toggle="tab"><i class="fa fa-user"></i> <span class="nav-label">考勤异常</span></a></li>
             	<li><a href="#punch_tab" aria-controls="punch_tab" role="tab" data-toggle="tab"><i class="fa fa-calendar"></i><span class="nav-label">打卡</span></a></li>
			    <li><a href="#sal_tab" aria-controls="sal_tab" role="tab" data-toggle="tab"><i class="fa fa-edit"></i><span class="nav-label">发薪纪录</span></a></li>
			    <li><a href="#job_tab" aria-controls="job_tab" class="active" role="tab" data-toggle="tab"><i class="fa fa-tasks"></i><span class="nav-label">我的任务</span></a></li>

                <!--<li>
                    <a href="table_data_tables.html#"><i class="fa fa-bar-chart-o"></i> <span class="nav-label">薪资发放记录</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse nav-tab">
                    	<li>
                    		<a href="#sal_tab" aria-controls="sal_tab" role="tab" data-toggle="tab"><i class="fa fa-calendar"></i><span class="nav-label">发薪记录</span></a>
                    	</li>
	                    <li><a href="graph_flot.html"><i class="fa fa-calendar"></i>发薪记录</a></li>
	                    <li><a href="graph_morris.html"><i class="fa fa-dollar"></i>上月发薪明细</a></li>
                    </ul>
                </li>

                <li>
                    <a href="table_data_tables.html#"><i class="fa fa-edit"></i> <span class="nav-label">签核申请</span></span><span class="label label-info pull-right">8</span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="form_basic.html"><i class="fa fa-file-text"></i>请假签核 <span class="label label-primary ">2</span></a></li>
                        <li><a href="form_advanced.html"><i class="fa fa-question"></i>考勤异议申请 <span class="label label-warning ">6</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="table_data_tables.html#"><i class="fa fa-tasks"></i> <span class="nav-label">任务管理</span><span class="fa arrow"></span></a>
                    <ul class="nav nav-second-level collapse">
                        <li><a href="contacts.html"><i class="fa fa-plus"></i>添加新任务</a></li>
                        <li><a href="profile.html"><i class="fa fa-calculator"></i>任务进度管理</a></li>
                    </ul>
                </li>-->
            </ul>
        </div>
    </nav>

	        <div id="page-wrapper" class="gray-bg">
		        <div class="row border-bottom">
			        <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
				        <div class="navbar-header">
				            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
				            <form role="search" class="navbar-form-custom" action="search_results.html">
				                <div class="form-group">
				                    <input type="text" placeholder="试着搜索一下吧" class="form-control" name="top-search" id="top-search">
				                </div>
				            </form>
				        </div>
			            <ul class="nav navbar-top-links navbar-right">
			                <li>
			                    <span class="m-r-sm text-muted welcome-message">欢迎使用实习生管理系统.</span>
			                </li>
			                <li>
			                    <a href="${context}/logout">
			                        <i class="fa fa-sign-out"></i> 退出登录
			                    </a>
			                </li>
			            </ul>		
			        </nav>
		        </div>
		        <div class="tab-content">
		        	<div role="tabpanel" class="tab-pane active" id="unatt_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>考勤异常</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>近期考勤异常</strong>
			                        </li>
			                    </ol>
			                </div>
			                <div class="col-lg-2">
			                </div>
			            </div>
				        <div class="wrapper wrapper-content animated fadeInRight">
				            <div class="row">
					            <div class="col-lg-12">
					            	<div class="ibox float-e-margins">
								            <div class="ibox-title">
								                <h5>考勤异常记录(一周内)</h5>
								                <div class="ibox-tools">
								                    <a class="collapse-link">
								                        <i class="fa fa-chevron-up"></i>
								                    </a>
								                    <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
								                        <i class="fa fa-wrench"></i>
								                    </a>
								                    <ul class="dropdown-menu dropdown-user">
								                        <li><a href="table_data_tables.html#">Config option 1</a>
								                        </li>
								                        <li><a href="table_data_tables.html#">Config option 2</a>
								                        </li>
								                    </ul>
								                    <a class="close-link">
								                        <i class="fa fa-times"></i>
								                    </a>
								                </div>
								            </div>
								            <div class="ibox-content">
									            <table class="table table-striped table-bordered table-hover " id="unatt_table" >
						            			</table>
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>
		        	<div role="tabpanel" class="tab-pane" id="punch_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>打卡</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>打卡</strong>
			                        </li>
			                    </ol>
			                </div>
			                <div class="col-lg-2">
			                </div>
			            </div>
				        <div class="wrapper wrapper-content animated fadeInRight">
				            <div class="row">
					            <div class="col-lg-12">
					            	<div class="ibox float-e-margins">
								            <div class="ibox-title">
								                <h5>打卡</h5>
								                <div class="ibox-tools">
								                    <a class="collapse-link">
								                        <i class="fa fa-chevron-up"></i>
								                    </a>
								                    <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
								                        <i class="fa fa-wrench"></i>
								                    </a>
								                    <ul class="dropdown-menu dropdown-user">
								                        <li><a href="table_data_tables.html#">Config option 1</a>
								                        </li>
								                        <li><a href="table_data_tables.html#">Config option 2</a>
								                        </li>
								                    </ul>
								                    <a class="close-link">
								                        <i class="fa fa-times"></i>
								                    </a>
								                </div>
								            </div>
								            <div class="ibox-content">
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
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>	
		        	<div role="tabpanel" class="tab-pane" id="sal_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>我的工资记录</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>我的工资记录</strong>
			                        </li>
			                    </ol>
			                </div>
			                <div class="col-lg-2">
			                </div>
			            </div>
				        <div class="wrapper wrapper-content animated fadeInRight">
				            <div class="row">
					            <div class="col-lg-12">
					            	<div class="ibox float-e-margins">
								            <div class="ibox-title">
								                <h5>我的工资记录表</h5>
								                <div class="ibox-tools">
								                    <a class="collapse-link">
								                        <i class="fa fa-chevron-up"></i>
								                    </a>
								                    <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
								                        <i class="fa fa-wrench"></i>
								                    </a>
								                    <ul class="dropdown-menu dropdown-user">
								                        <li><a href="table_data_tables.html#">Config option 1</a>
								                        </li>
								                        <li><a href="table_data_tables.html#">Config option 2</a>
								                        </li>
								                    </ul>
								                    <a class="close-link">
								                        <i class="fa fa-times"></i>
								                    </a>
								                </div>
								            </div>
								            <div class="ibox-content">
									            <!--<div class="">
									            	<a  class="btn btn-primary ">添加实习生</a>
									            </div>-->
									            <table class="table table-striped table-bordered table-hover " id="sal_table" >
						            			</table>
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>	
		        	<div role="tabpanel" class="tab-pane" id="job_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>我的任务</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>我的任务</strong>
			                        </li>
			                    </ol>
			                </div>
			                <div class="col-lg-2">
			                </div>
			            </div>
				        <div class="wrapper wrapper-content animated fadeInRight">
				            <div class="row">
					            <div class="col-lg-12">
					            	<div class="ibox float-e-margins">
                                        <div class="ibox-title">
                                            <h5>我的任务清单</h5>
                                            <div class="ibox-tools">
                                                <a class="collapse-link">
                                                    <i class="fa fa-chevron-up"></i>
                                                </a>
                                                <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
                                                    <i class="fa fa-wrench"></i>
                                                </a>
                                                <ul class="dropdown-menu dropdown-user">
                                                    <li><a href="table_data_tables.html#">Config option 1</a>
                                                    </li>
                                                    <li><a href="table_data_tables.html#">Config option 2</a>
                                                    </li>
                                                </ul>
                                                <a class="close-link">
                                                    <i class="fa fa-times"></i>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="ibox-content">
                                            <table class="table table-striped table-bordered table-hover " id="job_table" >
                                            </table>
                                        </div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>
		        	<div role="tabpanel" class="tab-pane" id="task_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>我的任务</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>进度管理</strong>
			                        </li>
			                    </ol>
			                </div>
			                <div class="col-lg-2">
			                </div>
			            </div>
				        <div class="wrapper wrapper-content animated fadeInRight">
				            <div class="row">
					            <div class="col-lg-12">
					            	<div class="ibox float-e-margins">
								            <div class="ibox-title">
								                <h5>进度表</h5>
								                <div class="ibox-tools">
								                    <a class="collapse-link">
								                        <i class="fa fa-chevron-up"></i>
								                    </a>
								                    <a class="dropdown-toggle" data-toggle="dropdown" href="table_data_tables.html#">
								                        <i class="fa fa-wrench"></i>
								                    </a>
								                    <ul class="dropdown-menu dropdown-user">
								                        <li><a href="table_data_tables.html#">Config option 1</a>
								                        </li>
								                        <li><a href="table_data_tables.html#">Config option 2</a>
								                        </li>
								                    </ul>
								                    <a class="close-link">
								                        <i class="fa fa-times"></i>
								                    </a>
								                </div>
								            </div>
								            <div class="ibox-content">
									            <!--<div class="">
									            	<a  class="btn btn-primary ">添加实习生</a>
									            </div>-->
									            <table class="table table-striped table-bordered table-hover " id="task_table" >
						            			</table>
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>
		        </div>
		        <div class="footer">
		            <div>
		                <strong>Copyright</strong> Example Company &copy; 2014-2015
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
                <button type="button" id="check_y" class="btn btn-primary" data-dismiss="modal">提交</button>
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
                    <select class="form-control" name="check_finished" id="check_finished">
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
    <div class="modal fade" id="edit_pwd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel_pwd">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <h4 class="modal-title text-danger" id="myModalLabel_pwd" >添加实习生</h4>
          </div>
          <div class="modal-body">
             <form>
                <div class="form-group">
                    <label for="pwd_old" class="control-label">旧密码:</label>
                    <input type="password" class="form-control" id="pwd_old">
                </div>
                <div class="form-group">
                    <label for="pwd_new" class="control-label">新密码:</label>
                    <input type="password" class="form-control" id="pwd_new">
                </div>
                <div class="form-group">
                    <label for="pwd_new1" class="control-label">确认新密码:</label>
                    <input type="password" class="form-control" id="pwd_new1">
                </div>
            </form>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
            <button type="button" id="pwd_tip_y" class="btn btn-primary btn-warning" data-dismiss="modal">确认更改密码</button>
          </div>
        </div>
      </div>
    </div>
    <!-- Page-Level Scripts -->
    <script>
        $('.container-fluid').height($(window).height());
        $("#edit_pwd").on("show.bs.modal",function(e){
            $(this).find("#pwd_tip_y").off("click").on("click",function(){
	            var pwd_old = $("#pwd_old").val();
	            var pwd_new = $("#pwd_new").val();
	            var pwd_new1 = $("#pwd_new1").val();
                var postData_pwd = {
                    "pwd_old" : pwd_old,
                    "pwd_new" : pwd_new,
                    "pwd_new1" : pwd_new1
                };
                $.ajax({
                    type: "post",
                    url: '${context}/pwdChange',
                    data: postData_pwd,
                    success: function (data, status) {
                        if (status == "success") {
                            alert("您的密码已经修改，请妥善保存");
                        }
                    },
                    error: function () {
                        alert("修改密码失败");
                    },
                    complete: function () {
                    }
                });
            });
        });
        $("#unatt_table").bootstrapTable({
            columns: [{
                checkbox:true
            },{
                field: 'id',
                title: '编号',
                align:'center'
            },{
                field: 'dutyDay',
                title: '日期',
                align:'center'
            },{
                field: 'type',
                title: '考勤类型',
                align:'center'
            },{
                field: 'time',
                title: '对应打卡时间',
                align:'center'
            },{
                field: 'operate',
                title: '申请',
                align: 'center',
                formatter: appOperateFormatter
            },{
                field: 'app_type',
                title: '最近申请类型',
                align:'center'
            },{
                 field: 'app_progress',
                 title: '处理进度',
                 align:'center'
            },{
                  field: 'granted',
                  title: '处理结果',
                  align:'center'
            },{
                 field: 'reason',
                 title: '批复说明',
                 align:'center'
            }],
            url: '${context}/employee/getUnAttByItr',
            method: 'post',
            search:true,
            striped:true,
            sortName: "id",
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
            maintainSelected:false
        });
        $("#sal_table").bootstrapTable({
            columns: [{
                checkbox:true
            },
            {
                field: 'month',
                title: '月份',
                align:'center'
            },{
                field: 'base',
                title: '基本工资',
                align:'center'
            },{
                 field: 'sick_pay',
                 title: '病假扣薪',
                 align:'center'
            },{
                field: 'issue_pay',
                title: '事假扣薪',
                align:'center'
            },{
                field: 'work_pay',
                title: '出差补贴',
                align:'center'
            },{
                field: 'late_pay',
                title: '迟到扣薪',
                align:'center'
            },{
                field: 'early_pay',
                title: '早退扣薪',
                align:'center'
            },{
                 field: 'unAttend_pay',
                 title: '旷工扣薪',
                 align:'center'
            },{
                 field: 'amount',
                 title: '工资结余',
                 align:'center'
            }],
            url: '${context}/employee/getSalHistotyByItr',
            method: 'post',
            search:true,
            striped:true,
            sortName: "month",
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
            maintainSelected:false
        });
        $("#job_table").bootstrapTable({
            columns: [{
                checkbox:true
            },
            {
                field: 'task_title',
                title: '任务',
                align:'center'
            },{
                field: 'task_content',
                title: '内容',
                align:'center'
            },{
                 field: 'assign_date',
                 title: '分派日期',
                 align:'center'
            },{
                field: 'accepted',
                title: '接受情况',
                align: 'center',
                editable: {
                     type: "select",
                     source: [{ value: '已接受', text: "已接受" }, { value: '不接受', text: "不接受" }],
                     title: "接受任务",
                     emptytext: "接受",
                     placeholder: "",
                     mode: "popup"
                }
            },{
                field: 'accept_date',
                title: '接受时间',
                align: 'center'
            },{
                field: 'finished',
                title: '完成情况',
                align:'center'
            },{
                field: 'deadline',
                title: '截止日期',
                align:'center'
            },{
                field: 'grade',
                title: '得分',
                align:'center'
            }],
            url: '${context}/employee/getJobByItr',
            method: 'post',
            search:true,
            striped:true,
            sortName: "deadline",
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
                    url: '${context}/employee/accept',
                    data: row,
                    success: function (data, status) {
                        if (status == "success") {
                            alert("操作成功");
                        }
                    },
                    error: function () {
                        alert("Error");
                    }
                });
            }
        });
        function appOperateFormatter(value, row, index) {
          return "<button class='btn btn-link'  id='"+row.id+"_app"+"' data-toggle='modal' data-att_date='"+row.dutyDay+"' data-att_id='"+row.id+"' data-target='#myModal_app'>申请</button>";
        };
        $("#myModal_app").on("show.bs.modal",function(e){
            var att_date = $(e.relatedTarget).data("att_date");
            $("#myModalLabel_app span").get(0).innerHTML=att_date;
            $(this).find("#app_y").off("click").on("click",function(){
            	var att_id = $(e.relatedTarget).data("att_id");
	            var att_type = $("#type_select").val();
	            var reason = $("#app_reason").val();

                var postData_app = {
                    "att_id" : att_id,
                    "type_id" : att_type,
                    "reason" : reason
                };
                $.post("${context}/employee/addApp",postData_app,
                function(data,statusText){
                    var response=eval("(" + data + ")").response;
                    if(statusText=="success"&&response=="added"){
                        $("#"+att_id+"_app").get(0).innerHTML="已申请，待处理";
                        $("#"+att_id+"_app").attr("disabled",true);
                     }
                     else{
                        alert("提交失败");
                     }
                },
                "text"
            );
            });
        });
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
