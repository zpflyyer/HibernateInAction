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
                            <li><a href="profile.html">我的资料</a></li>
                            <li><a href="mailbox.html">修改密码</a></li>
                            <li class="divider"></li>
                            <li><a href="${context}/logout">登出</a></li>
                        </ul>
                    </div>
                    <div class="logo-element">
                        IN+
                    </div>
                </li>
                <li><a href="#emp_tab" aria-controls="emp_tab" role="tab" data-toggle="tab"><i class="fa fa-user"></i> <span class="nav-label">实习生管理</span></a></li>
                <li><a href="#mgr_tab" aria-controls="emgr_tab" role="tab" data-toggle="tab"><i class="fa fa-user"></i> <span class="nav-label">经理管理</span></a></li>
             	<li><a href="#sal_tab" aria-controls="sal_tab" role="tab" data-toggle="tab"><i class="fa fa-calendar"></i><span class="nav-label">发薪记录</span></a></li>  
			    <li><a href="#appli_tab" aria-controls="appli_tab" role="tab" data-toggle="tab"><i class="fa fa-edit"></i><span class="nav-label">处理申请</span><span class="label label-warning pull-right">8</span></a></li>
			    <li><a href="#assign_tab" aria-controls="assign_tab" class="active" role="tab" data-toggle="tab"><i class="fa fa-tasks"></i><span class="nav-label">分配任务</span></a></li>
			    <li><a href="#task_tab" aria-controls="task_tab"  role="tab" data-toggle="tab"><i class="fa fa-calculator"></i><span class="nav-label">进度管理</span><span class="label label-info pull-right">4</span></a></li>
            	
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
			                <li class="dropdown">
			                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="table_data_tables.html#">
			                        <i class="fa fa-envelope"></i>  <span class="label label-warning">16</span>
			                    </a>
			                    <ul class="dropdown-menu dropdown-messages">
			                        <li>
			                            <div class="dropdown-messages-box">
			                                <a href="profile.html" class="pull-left">
			                                    <img alt="image" class="img-circle" src="${context}/img/a7.jpg">
			                                </a>
			                                <div class="media-body">
			                                    <small class="pull-right">46h ago</small>
			                                    <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>. <br>
			                                    <small class="text-muted">3 days ago at 7:58 pm - 10.06.2014</small>
			                                </div>
			                            </div>
			                        </li>
			                        <li class="divider"></li>
			                        <li>
			                            <div class="dropdown-messages-box">
			                                <a href="profile.html" class="pull-left">
			                                    <img alt="image" class="img-circle" src="${context}/img/a4.jpg">
			                                </a>
			                                <div class="media-body ">
			                                    <small class="pull-right text-navy">5h ago</small>
			                                    <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica Smith</strong>. <br>
			                                    <small class="text-muted">Yesterday 1:21 pm - 11.06.2014</small>
			                                </div>
			                            </div>
			                        </li>
			                        <li class="divider"></li>
			                        <li>
			                            <div class="dropdown-messages-box">
			                                <a href="profile.html" class="pull-left">
			                                    <img alt="image" class="img-circle" src="${context}/img/profile.jpg">
			                                </a>
			                                <div class="media-body ">
			                                    <small class="pull-right">23h ago</small>
			                                    <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>
			                                    <small class="text-muted">2 days ago at 2:30 am - 11.06.2014</small>
			                                </div>
			                            </div>
			                        </li>
			                        <li class="divider"></li>
			                        <li>
			                            <div class="text-center link-block">
			                                <a href="mailbox.html">
			                                    <i class="fa fa-envelope"></i> <strong>查看所有申请</strong>
			                                </a>
			                            </div>
			                        </li>
			                    </ul>
			                </li>
			                <li class="dropdown">
			                    <a class="dropdown-toggle count-info" data-toggle="dropdown" href="table_data_tables.html#">
			                        <i class="fa fa-bell"></i>  <span class="label label-primary">8</span>
			                    </a>
			                    <ul class="dropdown-menu dropdown-alerts">
			                        <li>
			                            <a href="mailbox.html">
			                                <div>
			                                    <i class="fa fa-envelope fa-fw"></i> You have 16 messages
			                                    <span class="pull-right text-muted small">4 minutes ago</span>
			                                </div>
			                            </a>
			                        </li>
			                        <li class="divider"></li>
			                        <li>
			                            <a href="profile.html">
			                                <div>
			                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
			                                    <span class="pull-right text-muted small">12 minutes ago</span>
			                                </div>
			                            </a>
			                        </li>
			                        <li class="divider"></li>
			                        <li>
			                            <a href="grid_options.html">
			                                <div>
			                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
			                                    <span class="pull-right text-muted small">4 minutes ago</span>
			                                </div>
			                            </a>
			                        </li>
			                        <li class="divider"></li>
			                        <li>
			                            <div class="text-center link-block">
			                                <a href="notifications.html">
			                                    <strong>查看所有通知</strong>
			                                    <i class="fa fa-angle-right"></i>
			                                </a>
			                            </div>
			                        </li>
			                    </ul>
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
		        	<div role="tabpanel" class="tab-pane" id="emp_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>实习生管理</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>实习生管理</strong>
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
								                <h5>实习生信息表</h5>
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
									            <div class="">
									            	<a  class="btn btn-primary ">添加实习生</a>
									            </div>
									            <table class="table table-striped table-bordered table-hover " id="emp_table" >
						            			</table>
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>
		        	<div role="tabpanel" class="tab-pane" id="mgr_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>经理管理</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>经理管理</strong>
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
								                <h5>经理信息表</h5>
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
									            <div class="">
									            	<a  class="btn btn-primary ">添加经理</a>
									            </div>
									            <table class="table table-striped table-bordered table-hover " id="mgr_table" >
						            			</table>
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>
		        	<div role="tabpanel" class="tab-pane" id="sal_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>发薪记录</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>发薪记录</strong>
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
								                <h5>发新纪录表</h5>
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
		        	<div role="tabpanel" class="tab-pane" id="appli_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>申请处理</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>申请处理</strong>
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
								                <h5>考勤异常申请汇总</h5>
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
									            <table class="table table-striped table-bordered table-hover " id="app_table" >
						            			</table>
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>	
		        	<div role="tabpanel" class="tab-pane active" id="assign_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>任务分配</h2>
			                    <ol class="breadcrumb">
			                        <li>
			                            <a href="#">首页</a>
			                        </li>
			                        <li class="active">
			                            <strong>任务分配</strong>
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
								                <h5>分配新任务</h5>
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
						            		</div>
					            	</div>
					            </div>
				            </div>
				        </div>
			        </div>	
		        	<div role="tabpanel" class="tab-pane" id="task_tab">
			            <div class="row wrapper border-bottom white-bg page-heading">
			                <div class="col-lg-10">
			                    <h2>进度管理</h2>
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
		            <div class="pull-right">
		                10GB of <strong>250GB</strong> Free.
		            </div>
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

    <!-- Page-Level Scripts -->
    <script>
        $('.container-fluid').height($(window).height());
        $("#emp_table").bootstrapTable({
            columns: [{
                checkbox:true
            },
            {
                field: 'id',
                title: '员工号',
                align:'center'
            },{
                field: 'real_name',
                title: '姓名',
                align:'center',
                editable: {
                    type: 'text',
                    title: '姓名',
                    validate: function (v) {
                        if (!v) return '姓名不能为空';
                    }
                }
            },{
                field: 'empName',
                title: '登录名',
                align:'center'
            },{
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
                }
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
                }
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
                 }
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
                   }
            },{
                 field: 'id_number',
                 title: '证件号码',
                 align:'center',
                 editable: {
                    type: 'number',
                    title: '证件号码',
                    validate: function (v) {
                        if (!v) return '证件号码不能为空';
                    }
                 }
            },{
                 field: 'board',
                 title: '入职日期',
                 align:'center'
            },{
                  field: 'dept',
                  title: '部门',
                  align:'center',
                  editable: {
                     type: "select",
                     source: function() {
                         var result;
                         $.ajax({
                             url: '${context}/admin/getAllDept',
                             type: 'POST',
                             global: false,
                             async: false,
                             dataType: 'json',
                             success: function(data) {
                                 result = data;
                             }
                         });
                         return result;
                     },
                     title: "部门调整",
                     emptytext: "",
                     mode: "popup"
                  }
            }],
            url: '${context}/admin/getAllItr',
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
            maintainSelected:false,
　　　　　　 onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: '${context}/admin/updItr',
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
        $("#mgr_table").bootstrapTable({
            columns: [{
                checkbox:true
            },
            {
                field: 'id',
                title: '员工号',
                align:'center'
            },{
                field: 'real_name',
                title: '姓名',
                align:'center',
                editable: {
                    type: 'text',
                    title: '姓名',
                    validate: function (v) {
                        if (!v) return '姓名不能为空';
                    }
                }
            },{
                field: 'empName',
                title: '登录名',
                align:'center'
            },{
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
                }
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
                 }
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
                   }
            },{
                  field: 'dept',
                  title: '部门',
                  align:'center',
                  editable: {
                    type: 'number',
                    title: '部门',
                    validate: function (v) {
                        if (!v) return '部门信息不能为空';
                    }
                  }
            }],
            url: '${context}/admin/getAllMgr',
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
            maintainSelected:false,
　　　　　　 onEditableSave: function (field, row, oldValue, $el) {
                $.ajax({
                    type: "post",
                    url: '${context}/admin/updMgr',
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
        $("#sal_table").bootstrapTable({
            columns: [{
                checkbox:true
            },
            {
                field: 'id',
                title: '员工号',
                align:'center'
            },{
                field: 'real_name',
                title: '姓名',
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
            url: '${context}/admin/getSals',
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
    </script>

</body>

</html>
