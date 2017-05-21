package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/head.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("<html>\r\n");
      out.write("    <body>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Basic Page Needs -->\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("\n");
      out.write("    <title>Intern Management System</title>\n");
      out.write("    <meta name=\"author\" content=\"pengfei.zhao\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("    <!-- Mobile Specific Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- stylesheet -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrapValidator.min.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap-table.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap-editable.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/animate.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/fonts/font-awesome/css/font-awesome.css\">\n");
      out.write("    <!-- js code -->\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.0.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/json2.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/chart.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrapValidator.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/metisMenu/jquery.metisMenu.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/slimscroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jeditable/jquery.jeditable.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/pace/pace.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/inspinia.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-editable.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-table.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-table-zh-CN.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap-table-editable.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("    /* Custom Styles */\n");
      out.write("        ul.nav-tabs{\n");
      out.write("            width:180px;\n");
      out.write("            height: auto;\n");
      out.write("            margin-top: 30px;\n");
      out.write("            margin-left: 40px;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs li{\n");
      out.write("            margin: 0;\n");
      out.write("            border-top: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs li:first-child{\n");
      out.write("            border-top: none;\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs li a{\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 8px 16px;\n");
      out.write("            border-radius: 0;\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{\n");
      out.write("            color: #fff;\n");
      out.write("            background: #0088cc;\n");
      out.write("            border: 1px solid #0088cc;\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs li:first-child a{\n");
      out.write("            border-radius: 4px 4px 0 0;\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs li:last-child a{\n");
      out.write("            border-radius: 0 0 4px 4px;\n");
      out.write("        }\n");
      out.write("        ul.nav-tabs.affix{\n");
      out.write("            top: 30px; /* Set the top position of pinned element */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar-default navbar-static-side\" role=\"navigation\">\r\n");
      out.write("        <div class=\"sidebar-collapse\">\r\n");
      out.write("            <ul class=\"nav nav-tab metismenu\" id=\"side-menu\">\r\n");
      out.write("                <li class=\"nav-header\">\r\n");
      out.write("                    <div class=\"dropdown profile-element\"> <span>\r\n");
      out.write("                            <img alt=\"image\" class=\"img-circle\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/profile_small.jpg\" />\r\n");
      out.write("                             </span>\r\n");
      out.write("                        <a data-toggle=\"dropdown\" class=\"dropdown-toggle\" href=\"table_data_tables.html#\">\r\n");
      out.write("                            <span class=\"clear\"> <span class=\"block m-t-xs\"> <strong class=\"font-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</strong>\r\n");
      out.write("                             </span> <span class=\"text-muted text-xs block\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("<b class=\"caret\"></b></span> </span> </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu animated fadeInRight m-t-xs\">\r\n");
      out.write("                            <li><a href=\"profile.html\">我的资料</a></li>\r\n");
      out.write("                            <li><a href=\"mailbox.html\">修改密码</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout\">登出</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"logo-element\">\r\n");
      out.write("                        IN+\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#emp_tab\" aria-controls=\"emp_tab\" role=\"tab\" data-toggle=\"tab\"><i class=\"fa fa-user\"></i> <span class=\"nav-label\">实习生管理</span></a></li>\r\n");
      out.write("             \t<li><a href=\"#sal_tab\" aria-controls=\"sal_tab\" role=\"tab\" data-toggle=\"tab\"><i class=\"fa fa-calendar\"></i><span class=\"nav-label\">发薪记录</span></a></li>  \r\n");
      out.write("\t\t\t    <li><a href=\"#appli_tab\" aria-controls=\"appli_tab\" role=\"tab\" data-toggle=\"tab\"><i class=\"fa fa-edit\"></i><span class=\"nav-label\">处理申请</span><span class=\"label label-warning pull-right\">8</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#assign_tab\" aria-controls=\"assign_tab\" class=\"active\" role=\"tab\" data-toggle=\"tab\"><i class=\"fa fa-tasks\"></i><span class=\"nav-label\">分配任务</span></a></li>\r\n");
      out.write("\t\t\t    <li><a href=\"#task_tab\" aria-controls=\"task_tab\"  role=\"tab\" data-toggle=\"tab\"><i class=\"fa fa-calculator\"></i><span class=\"nav-label\">进度管理</span><span class=\"label label-info pull-right\">4</span></a></li>\r\n");
      out.write("            \t\r\n");
      out.write("                <!--<li>\r\n");
      out.write("                    <a href=\"table_data_tables.html#\"><i class=\"fa fa-bar-chart-o\"></i> <span class=\"nav-label\">薪资发放记录</span><span class=\"fa arrow\"></span></a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level collapse nav-tab\">\r\n");
      out.write("                    \t<li>\r\n");
      out.write("                    \t\t<a href=\"#sal_tab\" aria-controls=\"sal_tab\" role=\"tab\" data-toggle=\"tab\"><i class=\"fa fa-calendar\"></i><span class=\"nav-label\">发薪记录</span></a>\r\n");
      out.write("                    \t</li>\r\n");
      out.write("\t                    <li><a href=\"graph_flot.html\"><i class=\"fa fa-calendar\"></i>发薪记录</a></li>\r\n");
      out.write("\t                    <li><a href=\"graph_morris.html\"><i class=\"fa fa-dollar\"></i>上月发薪明细</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"table_data_tables.html#\"><i class=\"fa fa-edit\"></i> <span class=\"nav-label\">签核申请</span></span><span class=\"label label-info pull-right\">8</span></a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level collapse\">\r\n");
      out.write("                        <li><a href=\"form_basic.html\"><i class=\"fa fa-file-text\"></i>请假签核 <span class=\"label label-primary \">2</span></a></li>\r\n");
      out.write("                        <li><a href=\"form_advanced.html\"><i class=\"fa fa-question\"></i>考勤异议申请 <span class=\"label label-warning \">6</span></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"table_data_tables.html#\"><i class=\"fa fa-tasks\"></i> <span class=\"nav-label\">任务管理</span><span class=\"fa arrow\"></span></a>\r\n");
      out.write("                    <ul class=\"nav nav-second-level collapse\">\r\n");
      out.write("                        <li><a href=\"contacts.html\"><i class=\"fa fa-plus\"></i>添加新任务</a></li>\r\n");
      out.write("                        <li><a href=\"profile.html\"><i class=\"fa fa-calculator\"></i>任务进度管理</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>-->\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("\t        <div id=\"page-wrapper\" class=\"gray-bg\">\r\n");
      out.write("\t\t        <div class=\"row border-bottom\">\r\n");
      out.write("\t\t\t        <nav class=\"navbar navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\r\n");
      out.write("\t\t\t\t        <div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t            <a class=\"navbar-minimalize minimalize-styl-2 btn btn-primary \" href=\"#\"><i class=\"fa fa-bars\"></i> </a>\r\n");
      out.write("\t\t\t\t            <form role=\"search\" class=\"navbar-form-custom\" action=\"search_results.html\">\r\n");
      out.write("\t\t\t\t                <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t                    <input type=\"text\" placeholder=\"试着搜索一下吧\" class=\"form-control\" name=\"top-search\" id=\"top-search\">\r\n");
      out.write("\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t            </form>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t            <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("\t\t\t                <li>\r\n");
      out.write("\t\t\t                    <span class=\"m-r-sm text-muted welcome-message\">欢迎使用实习生管理系统.</span>\r\n");
      out.write("\t\t\t                </li>\r\n");
      out.write("\t\t\t                <li class=\"dropdown\">\r\n");
      out.write("\t\t\t                    <a class=\"dropdown-toggle count-info\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t                        <i class=\"fa fa-envelope\"></i>  <span class=\"label label-warning\">16</span>\r\n");
      out.write("\t\t\t                    </a>\r\n");
      out.write("\t\t\t                    <ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <div class=\"dropdown-messages-box\">\r\n");
      out.write("\t\t\t                                <a href=\"profile.html\" class=\"pull-left\">\r\n");
      out.write("\t\t\t                                    <img alt=\"image\" class=\"img-circle\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/a7.jpg\">\r\n");
      out.write("\t\t\t                                </a>\r\n");
      out.write("\t\t\t                                <div class=\"media-body\">\r\n");
      out.write("\t\t\t                                    <small class=\"pull-right\">46h ago</small>\r\n");
      out.write("\t\t\t                                    <strong>Mike Loreipsum</strong> started following <strong>Monica Smith</strong>. <br>\r\n");
      out.write("\t\t\t                                    <small class=\"text-muted\">3 days ago at 7:58 pm - 10.06.2014</small>\r\n");
      out.write("\t\t\t                                </div>\r\n");
      out.write("\t\t\t                            </div>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <div class=\"dropdown-messages-box\">\r\n");
      out.write("\t\t\t                                <a href=\"profile.html\" class=\"pull-left\">\r\n");
      out.write("\t\t\t                                    <img alt=\"image\" class=\"img-circle\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/a4.jpg\">\r\n");
      out.write("\t\t\t                                </a>\r\n");
      out.write("\t\t\t                                <div class=\"media-body \">\r\n");
      out.write("\t\t\t                                    <small class=\"pull-right text-navy\">5h ago</small>\r\n");
      out.write("\t\t\t                                    <strong>Chris Johnatan Overtunk</strong> started following <strong>Monica Smith</strong>. <br>\r\n");
      out.write("\t\t\t                                    <small class=\"text-muted\">Yesterday 1:21 pm - 11.06.2014</small>\r\n");
      out.write("\t\t\t                                </div>\r\n");
      out.write("\t\t\t                            </div>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <div class=\"dropdown-messages-box\">\r\n");
      out.write("\t\t\t                                <a href=\"profile.html\" class=\"pull-left\">\r\n");
      out.write("\t\t\t                                    <img alt=\"image\" class=\"img-circle\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/profile.jpg\">\r\n");
      out.write("\t\t\t                                </a>\r\n");
      out.write("\t\t\t                                <div class=\"media-body \">\r\n");
      out.write("\t\t\t                                    <small class=\"pull-right\">23h ago</small>\r\n");
      out.write("\t\t\t                                    <strong>Monica Smith</strong> love <strong>Kim Smith</strong>. <br>\r\n");
      out.write("\t\t\t                                    <small class=\"text-muted\">2 days ago at 2:30 am - 11.06.2014</small>\r\n");
      out.write("\t\t\t                                </div>\r\n");
      out.write("\t\t\t                            </div>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <div class=\"text-center link-block\">\r\n");
      out.write("\t\t\t                                <a href=\"mailbox.html\">\r\n");
      out.write("\t\t\t                                    <i class=\"fa fa-envelope\"></i> <strong>查看所有申请</strong>\r\n");
      out.write("\t\t\t                                </a>\r\n");
      out.write("\t\t\t                            </div>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ul>\r\n");
      out.write("\t\t\t                </li>\r\n");
      out.write("\t\t\t                <li class=\"dropdown\">\r\n");
      out.write("\t\t\t                    <a class=\"dropdown-toggle count-info\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t                        <i class=\"fa fa-bell\"></i>  <span class=\"label label-primary\">8</span>\r\n");
      out.write("\t\t\t                    </a>\r\n");
      out.write("\t\t\t                    <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"mailbox.html\">\r\n");
      out.write("\t\t\t                                <div>\r\n");
      out.write("\t\t\t                                    <i class=\"fa fa-envelope fa-fw\"></i> You have 16 messages\r\n");
      out.write("\t\t\t                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("\t\t\t                                </div>\r\n");
      out.write("\t\t\t                            </a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"profile.html\">\r\n");
      out.write("\t\t\t                                <div>\r\n");
      out.write("\t\t\t                                    <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\r\n");
      out.write("\t\t\t                                    <span class=\"pull-right text-muted small\">12 minutes ago</span>\r\n");
      out.write("\t\t\t                                </div>\r\n");
      out.write("\t\t\t                            </a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"grid_options.html\">\r\n");
      out.write("\t\t\t                                <div>\r\n");
      out.write("\t\t\t                                    <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\r\n");
      out.write("\t\t\t                                    <span class=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("\t\t\t                                </div>\r\n");
      out.write("\t\t\t                            </a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <div class=\"text-center link-block\">\r\n");
      out.write("\t\t\t                                <a href=\"notifications.html\">\r\n");
      out.write("\t\t\t                                    <strong>查看所有通知</strong>\r\n");
      out.write("\t\t\t                                    <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t                                </a>\r\n");
      out.write("\t\t\t                            </div>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ul>\r\n");
      out.write("\t\t\t                </li>\r\n");
      out.write("\t\t\t                <li>\r\n");
      out.write("\t\t\t                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout\">\r\n");
      out.write("\t\t\t                        <i class=\"fa fa-sign-out\"></i> 退出登录\r\n");
      out.write("\t\t\t                    </a>\r\n");
      out.write("\t\t\t                </li>\r\n");
      out.write("\t\t\t            </ul>\t\t\r\n");
      out.write("\t\t\t        </nav>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"tab-content\">\r\n");
      out.write("\t\t        \t<div role=\"tabpanel\" class=\"tab-pane\" id=\"emp_tab\">\r\n");
      out.write("\t\t\t            <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("\t\t\t                <div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t                    <h2>实习生管理</h2>\r\n");
      out.write("\t\t\t                    <ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"#\">首页</a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"active\">\r\n");
      out.write("\t\t\t                            <strong>实习生管理</strong>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ol>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"col-lg-2\">\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t\t\t            <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t            <div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t            \t<div class=\"ibox float-e-margins\">\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                <h5>部门实习生信息表</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"ibox-tools\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"collapse-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-chevron-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 2</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"close-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            \t<a  class=\"btn btn-primary \">添加实习生</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <table class=\"table table-striped table-bordered table-hover \" id=\"emp_table\" >\r\n");
      out.write("\t\t\t\t\t\t            \t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t            \t\t</div>\r\n");
      out.write("\t\t\t\t\t            \t</div>\r\n");
      out.write("\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\r\n");
      out.write("\t\t        \t<div role=\"tabpanel\" class=\"tab-pane\" id=\"sal_tab\">\r\n");
      out.write("\t\t\t            <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("\t\t\t                <div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t                    <h2>发薪记录</h2>\r\n");
      out.write("\t\t\t                    <ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"#\">首页</a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"active\">\r\n");
      out.write("\t\t\t                            <strong>发薪记录</strong>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ol>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"col-lg-2\">\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t\t\t            <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t            <div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t            \t<div class=\"ibox float-e-margins\">\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                <h5>发新纪录表</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"ibox-tools\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"collapse-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-chevron-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 2</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"close-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <!--<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            \t<a  class=\"btn btn-primary \">添加实习生</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            </div>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <table class=\"table table-striped table-bordered table-hover \" id=\"sal_table\" >\r\n");
      out.write("\t\t\t\t\t\t            \t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t            \t\t</div>\r\n");
      out.write("\t\t\t\t\t            \t</div>\r\n");
      out.write("\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\t\r\n");
      out.write("\t\t        \t<div role=\"tabpanel\" class=\"tab-pane\" id=\"appli_tab\">\r\n");
      out.write("\t\t\t            <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("\t\t\t                <div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t                    <h2>申请处理</h2>\r\n");
      out.write("\t\t\t                    <ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"#\">首页</a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"active\">\r\n");
      out.write("\t\t\t                            <strong>申请处理</strong>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ol>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"col-lg-2\">\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t\t\t            <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t            <div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t            \t<div class=\"ibox float-e-margins\">\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                <h5>考勤异常申请汇总</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"ibox-tools\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"collapse-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-chevron-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 2</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"close-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <!--<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            \t<a  class=\"btn btn-primary \">添加实习生</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            </div>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <table class=\"table table-striped table-bordered table-hover \" id=\"app_table\" >\r\n");
      out.write("\t\t\t\t\t\t            \t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t            \t\t</div>\r\n");
      out.write("\t\t\t\t\t            \t</div>\r\n");
      out.write("\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\t\r\n");
      out.write("\t\t        \t<div role=\"tabpanel\" class=\"tab-pane active\" id=\"assign_tab\">\r\n");
      out.write("\t\t\t            <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("\t\t\t                <div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t                    <h2>任务分配</h2>\r\n");
      out.write("\t\t\t                    <ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"#\">首页</a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"active\">\r\n");
      out.write("\t\t\t                            <strong>任务分配</strong>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ol>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"col-lg-2\">\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t\t\t            <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t            <div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t            \t<div class=\"ibox float-e-margins\">\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                <h5>分配新任务</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"ibox-tools\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"collapse-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-chevron-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 2</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"close-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t\t                    ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/jsp/manager2.jsp(392,27) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("task_vo");
      // /WEB-INF/jsp/manager2.jsp(392,27) null
      _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", new String("form-horizontal"));
      // /WEB-INF/jsp/manager2.jsp(392,27) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}/manager/assign", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/manager2.jsp(392,27) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      // /WEB-INF/jsp/manager2.jsp(392,27) null
      _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "style", new String("padding: 35px;"));
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t                        <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager2.jsp(393,49) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f0.setPath("title");
            int[] _jspx_push_body_count_form_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f0 = _jspx_th_form_005ferrors_005f0.doStartTag();
              if (_jspx_th_form_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f0);
            }
            out.write("</font>\r\n");
            out.write("\t\t\t\t\t\t\t                        <div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t                            <div class=\"input-group \">\r\n");
            out.write("\t\t\t\t\t\t\t                              <span class=\"input-group-addon\" id=\"title_icon\">\r\n");
            out.write("\t\t\t\t\t\t\t                                <span class=\"glyphicon glyphicon-header\"></span>\r\n");
            out.write("\t\t\t\t\t\t\t                              </span>\r\n");
            out.write("\t\t\t\t\t\t\t                              ");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t                            </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager2.jsp(402,49) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f1.setPath("content");
            int[] _jspx_push_body_count_form_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f1 = _jspx_th_form_005ferrors_005f1.doStartTag();
              if (_jspx_th_form_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f1);
            }
            out.write("</font>\r\n");
            out.write("\t\t\t\t\t\t\t                        <div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t                            <div class=\"input-group \">\r\n");
            out.write("\t\t\t\t\t\t\t                              <span class=\"input-group-addon\" id=\"content_icon\">\r\n");
            out.write("\t\t\t\t\t\t\t                                <span class=\"glyphicon glyphicon-book\"></span>\r\n");
            out.write("\t\t\t\t\t\t\t                              </span>\r\n");
            out.write("\t\t\t\t\t\t\t                              ");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t                            </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager2.jsp(411,49) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f2.setPath("deadline");
            int[] _jspx_push_body_count_form_005ferrors_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f2 = _jspx_th_form_005ferrors_005f2.doStartTag();
              if (_jspx_th_form_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f2.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f2);
            }
            out.write("</font>\r\n");
            out.write("\t\t\t\t\t\t\t                        <div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t                            <div class=\"input-group \">\r\n");
            out.write("\t\t\t\t\t\t\t                              <span class=\"input-group-addon\" id=\"deadline_icon\">\r\n");
            out.write("\t\t\t\t\t\t\t                                <span class=\"glyphicon glyphicon-time\"></span>\r\n");
            out.write("\t\t\t\t\t\t\t                              </span>\r\n");
            out.write("\t\t\t\t\t\t\t                              ");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t                            </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager2.jsp(420,49) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f3.setPath("internList");
            int[] _jspx_push_body_count_form_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f3 = _jspx_th_form_005ferrors_005f3.doStartTag();
              if (_jspx_th_form_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f3);
            }
            out.write("</font>\r\n");
            out.write("\t\t\t\t\t\t\t                        <div class=\"form-group\">\r\n");
            out.write("\t\t\t\t\t\t\t                            <div class=\"input-group \">\r\n");
            out.write("\t\t\t\t\t\t\t                            <span class=\"input-group-addon\" id=\"deadline_icon\">\r\n");
            out.write("\t\t\t\t\t\t\t                               <span class=\"glyphicon glyphicon-user\" ></span>\r\n");
            out.write("\t\t\t\t\t\t\t                            </span>\r\n");
            out.write("\t\t\t\t\t\t\t                              ");
            if (_jspx_meth_c_005fforEach_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t                            </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        </div>\r\n");
            out.write("\t\t\t\t\t\t\t                        <button type=\"submit\"  class=\"btn btn-block btn-primary\">提 交</button>\r\n");
            out.write("\t\t\t\t\t\t\t                    ");
            int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\t\t\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t            \t\t</div>\r\n");
      out.write("\t\t\t\t\t            \t</div>\r\n");
      out.write("\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\t\r\n");
      out.write("\t\t        \t<div role=\"tabpanel\" class=\"tab-pane\" id=\"task_tab\">\r\n");
      out.write("\t\t\t            <div class=\"row wrapper border-bottom white-bg page-heading\">\r\n");
      out.write("\t\t\t                <div class=\"col-lg-10\">\r\n");
      out.write("\t\t\t                    <h2>进度管理</h2>\r\n");
      out.write("\t\t\t                    <ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t                        <li>\r\n");
      out.write("\t\t\t                            <a href=\"#\">首页</a>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                        <li class=\"active\">\r\n");
      out.write("\t\t\t                            <strong>进度管理</strong>\r\n");
      out.write("\t\t\t                        </li>\r\n");
      out.write("\t\t\t                    </ol>\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t                <div class=\"col-lg-2\">\r\n");
      out.write("\t\t\t                </div>\r\n");
      out.write("\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        <div class=\"wrapper wrapper-content animated fadeInRight\">\r\n");
      out.write("\t\t\t\t            <div class=\"row\">\r\n");
      out.write("\t\t\t\t\t            <div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t            \t<div class=\"ibox float-e-margins\">\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                <h5>进度表</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t                <div class=\"ibox-tools\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"collapse-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-chevron-up\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"table_data_tables.html#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 1</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <li><a href=\"table_data_tables.html#\">Config option 2</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                        </li>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    <a class=\"close-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t                        <i class=\"fa fa-times\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t                    </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t            <div class=\"ibox-content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <!--<div class=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            \t<a  class=\"btn btn-primary \">添加实习生</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            </div>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t            <table class=\"table table-striped table-bordered table-hover \" id=\"task_table\" >\r\n");
      out.write("\t\t\t\t\t\t            \t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t            \t\t</div>\r\n");
      out.write("\t\t\t\t\t            \t</div>\r\n");
      out.write("\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t        </div>\r\n");
      out.write("\t\t\t        </div>\t\t\t        \r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t        <div class=\"footer\">\r\n");
      out.write("\t\t            <div class=\"pull-right\">\r\n");
      out.write("\t\t                10GB of <strong>250GB</strong> Free.\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t            <div>\r\n");
      out.write("\t\t                <strong>Copyright</strong> Example Company &copy; 2014-2015\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"modal fade\" id=\"myModal_check\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_check\">\r\n");
      out.write("          <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("              <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title text-info\" id=\"myModalLabel_check\" >处理<span></span>对<span></span>出勤申请的处理</h4>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-body\" id=\"check_info\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"check_type\" class=\"control-label\">申请类型</label>\r\n");
      out.write("                        <select class=\"form-control\"  id=\"check_result\">\r\n");
      out.write("                            <option value=\"true\">同意</option>\r\n");
      out.write("                            <option value=\"false\">驳回</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 <form>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"check_reason\" class=\"control-label\">批复说明</label>\r\n");
      out.write("                            <textarea class=\"form-control\" id=\"check_reason\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default btn-info\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" id=\"check_y\" class=\"btn btn-primary\" data-dismiss=\"modal\">提交</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal_task\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_task\">\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("            <h4 class=\"modal-title text-danger\" id=\"myModalLabel_task\" >批阅实习生<span></span>的任务完成情况</h4>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\" id=\"task_tip\">\r\n");
      out.write("             <form>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"input_grade\" class=\"control-label\">分数:</label>\r\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"input_grade\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                \t<label for=\"check_finished\" class=\"control-label\">申请类型</label>\r\n");
      out.write("                    <select class=\"form-control\" name=\"check_finished\" id=\"check_finished\">\r\n");
      out.write("\t\t\t\t    \t<option value=true>完成</option>\r\n");
      out.write("\t\t\t\t    \t<option value=false>未完成</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            <button type=\"button\" id=\"task_tip_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">提交更新</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page-Level Scripts -->\r\n");
      out.write("    <script>\r\n");
      out.write("        $('.container-fluid').height($(window).height());\r\n");
      out.write("        $(\"#emp_table\").bootstrapTable({\r\n");
      out.write("            columns: [{\r\n");
      out.write("                checkbox:true\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'id',\r\n");
      out.write("                title: '员工号',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'real_name',\r\n");
      out.write("                title: '姓名',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'empName',\r\n");
      out.write("                title: '登录名',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'empPass',\r\n");
      out.write("                title: '密码',\r\n");
      out.write("                align:'center',\r\n");
      out.write("                editable: {\r\n");
      out.write("                    type: 'password',\r\n");
      out.write("                    title: '密码',\r\n");
      out.write("                    validate: function (v) {\r\n");
      out.write("                        if (!v) return '密码不能为空';\r\n");
      out.write("                        if (v.legnth < 8) return '密码长度不得小于8位';\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }, {\r\n");
      out.write("                field: 'amount',\r\n");
      out.write("                title: '薪水',\r\n");
      out.write("                align:'center',\r\n");
      out.write("                editable: {\r\n");
      out.write("                        type: 'number',\r\n");
      out.write("                        title: '薪水',\r\n");
      out.write("                        validate: function (v) {\r\n");
      out.write("                            if (!v) return '薪水不能为空';\r\n");
      out.write("                            if (isNaN(v)) return '薪水必须是数字';\r\n");
      out.write("                            var age = parseInt(v);\r\n");
      out.write("                            if (age <= 0) return '薪水必须是正整数';\r\n");
      out.write("                        }\r\n");
      out.write("                }\r\n");
      out.write("            }, {\r\n");
      out.write("                 field: 'tel',\r\n");
      out.write("                 title: '电话',\r\n");
      out.write("                 align:'center',\r\n");
      out.write("                 editable: {\r\n");
      out.write("                         type: 'number',\r\n");
      out.write("                         title: '电话',\r\n");
      out.write("                         validate: function (v) {\r\n");
      out.write("                             if (!v) return '电话不能为空';\r\n");
      out.write("                         }\r\n");
      out.write("                 }\r\n");
      out.write("            }, {\r\n");
      out.write("                  field: 'email',\r\n");
      out.write("                  title: '邮箱',\r\n");
      out.write("                  align:'center',\r\n");
      out.write("                  editable: {\r\n");
      out.write("                          type: 'email',\r\n");
      out.write("                          title: '邮箱',\r\n");
      out.write("                          validate: function (v) {\r\n");
      out.write("                              if (!v) return '邮箱不能为空';\r\n");
      out.write("                          }\r\n");
      out.write("                   }\r\n");
      out.write("            },{\r\n");
      out.write("                 field: 'id_number',\r\n");
      out.write("                 title: '证件号码',\r\n");
      out.write("                 align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                 field: 'board',\r\n");
      out.write("                 title: '入职日期',\r\n");
      out.write("                 align:'center'\r\n");
      out.write("            }],\r\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/getEmpByMgr',\r\n");
      out.write("            method: 'post',\r\n");
      out.write("            search:true,\r\n");
      out.write("            striped:true,\r\n");
      out.write("            sortName: \"id\",\r\n");
      out.write("            pageList:'[3,5,10]',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            searchOnEnterKey:true,\r\n");
      out.write("            showColumns:true,\r\n");
      out.write("            showToggle:true,\r\n");
      out.write("            showPaginationSwitch:true,\r\n");
      out.write("            searchAlign:'left',\r\n");
      out.write("            paginationHAlign:'right',\r\n");
      out.write("            paginationPreText:'<',\r\n");
      out.write("            paginationNextText:'>',\r\n");
      out.write("            clickToSelect:false,\r\n");
      out.write("            maintainSelected:false,\r\n");
      out.write("　　　　　　 onEditableSave: function (field, row, oldValue, $el) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    type: \"post\",\r\n");
      out.write("                    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/updEmpl',\r\n");
      out.write("                    data: row,\r\n");
      out.write("                    success: function (data, status) {\r\n");
      out.write("                        if (status == \"success\") {\r\n");
      out.write("                            alert(\"编辑成功\");\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function () {\r\n");
      out.write("                        alert(\"Error\");\r\n");
      out.write("                    },\r\n");
      out.write("                    complete: function () {\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#sal_table\").bootstrapTable({\r\n");
      out.write("            columns: [{\r\n");
      out.write("                checkbox:true\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'id',\r\n");
      out.write("                title: '员工号',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'real_name',\r\n");
      out.write("                title: '姓名',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'base',\r\n");
      out.write("                title: '基本工资',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                 field: 'sick_pay',\r\n");
      out.write("                 title: '病假扣薪',\r\n");
      out.write("                 align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'issue_pay',\r\n");
      out.write("                title: '事假扣薪',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'work_pay',\r\n");
      out.write("                title: '出差补贴',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'late_pay',\r\n");
      out.write("                title: '迟到扣薪',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'early_pay',\r\n");
      out.write("                title: '早退扣薪',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                 field: 'unAttend_pay',\r\n");
      out.write("                 title: '旷工扣薪',\r\n");
      out.write("                 align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                 field: 'amount',\r\n");
      out.write("                 title: '工资结余',\r\n");
      out.write("                 align:'center'\r\n");
      out.write("            }],\r\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/getSalByMgr',\r\n");
      out.write("            method: 'post',\r\n");
      out.write("            search:true,\r\n");
      out.write("            striped:true,\r\n");
      out.write("            sortName: \"id\",\r\n");
      out.write("            pageList:'[3,5,10]',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            searchOnEnterKey:true,\r\n");
      out.write("            showColumns:true,\r\n");
      out.write("            showToggle:true,\r\n");
      out.write("            showPaginationSwitch:true,\r\n");
      out.write("            searchAlign:'left',\r\n");
      out.write("            paginationHAlign:'right',\r\n");
      out.write("            paginationPreText:'<',\r\n");
      out.write("            paginationNextText:'>',\r\n");
      out.write("            clickToSelect:false,\r\n");
      out.write("            maintainSelected:false\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#app_table\").bootstrapTable({\r\n");
      out.write("            columns: [{\r\n");
      out.write("                checkbox:true\r\n");
      out.write("            },\r\n");
      out.write("            {\r\n");
      out.write("                field: 'emp_id',\r\n");
      out.write("                title: '员工号',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'emp',\r\n");
      out.write("                title: '员工',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'date',\r\n");
      out.write("                title: '申请日期',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                 field: 'unAttend',\r\n");
      out.write("                 title: '考勤情况',\r\n");
      out.write("                 align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'toAttend',\r\n");
      out.write("                title: '申请修改',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'reason',\r\n");
      out.write("                title: '申请说明',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'operate',\r\n");
      out.write("                title: '操作',\r\n");
      out.write("                align: 'center',\r\n");
      out.write("                formatter: operateFormatter\r\n");
      out.write("            }],\r\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/getAppByMgr',\r\n");
      out.write("            method: 'post',\r\n");
      out.write("            search:true,\r\n");
      out.write("            striped:true,\r\n");
      out.write("            sortName: \"emp_id\",\r\n");
      out.write("            pageList:'[3,5,10]',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            searchOnEnterKey:true,\r\n");
      out.write("            showColumns:true,\r\n");
      out.write("            showToggle:true,\r\n");
      out.write("            showPaginationSwitch:true,\r\n");
      out.write("            searchAlign:'left',\r\n");
      out.write("            paginationHAlign:'right',\r\n");
      out.write("            paginationPreText:'<',\r\n");
      out.write("            paginationNextText:'>',\r\n");
      out.write("            clickToSelect:false,\r\n");
      out.write("            maintainSelected:false\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#task_table\").bootstrapTable({\r\n");
      out.write("            columns: [{\r\n");
      out.write("                checkbox:true\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'task_title',\r\n");
      out.write("                title: '任务',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'intern',\r\n");
      out.write("                title: '实习生',\r\n");
      out.write("                align:'center'\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'grade',\r\n");
      out.write("                title: '分数',\r\n");
      out.write("                align:'center',\r\n");
      out.write("                editable: {\r\n");
      out.write("                        type: 'number',\r\n");
      out.write("                        title: '评分',\r\n");
      out.write("                        validate: function (v) {\r\n");
      out.write("                            var val = parseInt(v);\r\n");
      out.write("                            if (val < 0) return '评分必须大于等于0';\r\n");
      out.write("                            else if(val > 100) return '评分不能大于100';\r\n");
      out.write("                        }\r\n");
      out.write("                }\r\n");
      out.write("            },{\r\n");
      out.write("                field: 'finished',\r\n");
      out.write("                title: '完成情况',\r\n");
      out.write("                align:'center',\r\n");
      out.write("                editable: {\r\n");
      out.write("                     type: \"select\",\r\n");
      out.write("                     source: [{ value: true, text: \"完成\" }, { value: false, text: \"未完成\" }],\r\n");
      out.write("                     title: \"评价\",\r\n");
      out.write("                     emptytext: \"已处理\",\r\n");
      out.write("                     placeholder: \"进行处理\",\r\n");
      out.write("                     mode: \"popup\"\r\n");
      out.write("                }\r\n");
      out.write("            }],\r\n");
      out.write("            url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/getTaskByMgr',\r\n");
      out.write("            method: 'post',\r\n");
      out.write("            search:true,\r\n");
      out.write("            striped:true,\r\n");
      out.write("            sortName: \"task_title\",\r\n");
      out.write("            pageList:'[3,5,10]',\r\n");
      out.write("            pagination:true,\r\n");
      out.write("            searchOnEnterKey:true,\r\n");
      out.write("            showColumns:true,\r\n");
      out.write("            showToggle:true,\r\n");
      out.write("            showPaginationSwitch:true,\r\n");
      out.write("            searchAlign:'left',\r\n");
      out.write("            paginationHAlign:'right',\r\n");
      out.write("            paginationPreText:'<',\r\n");
      out.write("            paginationNextText:'>',\r\n");
      out.write("            clickToSelect:false,\r\n");
      out.write("            maintainSelected:false,\r\n");
      out.write("　　　　　　 onEditableSave: function (field, row, oldValue, $el) {\r\n");
      out.write("                $.ajax({\r\n");
      out.write("                    type: \"post\",\r\n");
      out.write("                    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/judge',\r\n");
      out.write("                    data: row,\r\n");
      out.write("                    success: function (data, status) {\r\n");
      out.write("                        if (status == \"success\") {\r\n");
      out.write("                            alert(\"编辑成功\");\r\n");
      out.write("                        }\r\n");
      out.write("                    },\r\n");
      out.write("                    error: function () {\r\n");
      out.write("                        alert(\"Error\");\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        function operateFormatter(value, row, index) {\r\n");
      out.write("          return \"<button class='btn btn-link'  id='\"+row.emp+\"_\"+row.date+\"' data-toggle='modal' data-app_emp='\"+row.emp+\"' data-app_date='\"+row.date+\"' data-app_id='\"+row.id+\"' data-target='#myModal_check'>处理</button>\";\r\n");
      out.write("        };\r\n");
      out.write("        function taskOperateFormatter(value, row, index) {\r\n");
      out.write("          return \"<button class='btn btn-link'  id='\"+row.job_id+\"'data-toggle='modal' data-job_id='\"+row.job_id+\"' data-intern='\"+row.intern+\"' data-target='#myModal_task'>评价</button>\";\r\n");
      out.write("        };\r\n");
      out.write("\t     $(\"#myModal_check\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("\t        var app_emp = $(e.relatedTarget).data(\"app_emp\");\r\n");
      out.write("\t        var app_date = $(e.relatedTarget).data(\"app_date\");\r\n");
      out.write("\t        $(\"#myModalLabel_check span\").get(0).innerHTML=app_emp;\r\n");
      out.write("\t        $(\"#myModalLabel_check span\").get(1).innerHTML=app_date;\r\n");
      out.write("\t        $(this).find(\"#check_y\").off(\"click\").on(\"click\",function(){\r\n");
      out.write("\t        var app_id = $(e.relatedTarget).data(\"app_id\");\r\n");
      out.write("\t        var result = $(\"#check_result\").val();\r\n");
      out.write("\t        var reason = $(\"#check_reason\").val();\r\n");
      out.write("\t        var postData_check = {\r\n");
      out.write("\t            \"app_id\" : app_id,\r\n");
      out.write("\t            \"mgr\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",\r\n");
      out.write("\t            \"result\" : result,\r\n");
      out.write("\t            \"reason\" : reason\r\n");
      out.write("\t        };\r\n");
      out.write("\t        $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/check\",postData_check,\r\n");
      out.write("\t            function(data,statusText){\r\n");
      out.write("\t                var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("\t                if(statusText==\"success\"&&response==\"checked\"){\r\n");
      out.write("\t                    $(\"#\"+app_emp+\"_\"+app_date).get(0).innerHTML=\"已处理\";\r\n");
      out.write("\t                    $(\"#\"+app_emp+\"_\"+app_date).attr(\"disabled\",true);\r\n");
      out.write("\t                 }\r\n");
      out.write("\t                 else{\r\n");
      out.write("\t                    alert(\"提交失败\");\r\n");
      out.write("\t                 }\r\n");
      out.write("\t            },\r\n");
      out.write("\t            \"text\"\r\n");
      out.write("\t        );\r\n");
      out.write("\t        });\r\n");
      out.write("\t    });\r\n");
      out.write("        $(\"#myModal_task\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("            var job_id = $(e.relatedTarget).data(\"job_id\");\r\n");
      out.write("            var intern = $(e.relatedTarget).data(\"intern\");\r\n");
      out.write("            $(\"#myModalLabel_task span\").get(0).innerHTML=intern;\r\n");
      out.write("\r\n");
      out.write("            $(this).find(\"#task_tip_y\").off(\"click\").on(\"click\"\r\n");
      out.write("            ,function(){\r\n");
      out.write("                var finished = $(\"#check_finished\").val();\r\n");
      out.write("                var grade = $(\"#input_grade\").val();\r\n");
      out.write("                var postData_task = {\r\n");
      out.write("                    \"job_id\" : job_id,\r\n");
      out.write("                    \"grade\" : grade,\r\n");
      out.write("                    \"finished\" : finished\r\n");
      out.write("                };\r\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/judge\",postData_task,\r\n");
      out.write("                    function(data,statusText){\r\n");
      out.write("                        var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("                        if(statusText==\"success\"&&response==\"succeed\"){\r\n");
      out.write("                            $(\"#\"+job_id).get(0).innerHTML=\"已评价\";\r\n");
      out.write("                            $(\"#\"+job_id).attr(\"disabled\",true);\r\n");
      out.write("                         }\r\n");
      out.write("                         else{\r\n");
      out.write("                            alert(\"提交失败\");\r\n");
      out.write("                         }\r\n");
      out.write("                    },\r\n");
      out.write("                    \"text\"\r\n");
      out.write("                );\r\n");
      out.write("           });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/head.jsp(1,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("context");
    // /WEB-INF/jsp/head.jsp(1,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager2.jsp(399,37) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("title");
    // /WEB-INF/jsp/manager2.jsp(399,37) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/jsp/manager2.jsp(399,37) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/jsp/manager2.jsp(399,37) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("题目"));
    // /WEB-INF/jsp/manager2.jsp(399,37) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "aria-describedby", new String("title_icon"));
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager2.jsp(408,37) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("content");
    // /WEB-INF/jsp/manager2.jsp(408,37) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/jsp/manager2.jsp(408,37) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/jsp/manager2.jsp(408,37) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "placeholder", new String("内容"));
    // /WEB-INF/jsp/manager2.jsp(408,37) null
    _jspx_th_form_005ftextarea_005f0.setDynamicAttribute(null, "aria-describedby", new String("content_icon"));
    int[] _jspx_push_body_count_form_005ftextarea_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f0 = _jspx_th_form_005ftextarea_005f0.doStartTag();
      if (_jspx_th_form_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager2.jsp(417,37) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("deadline");
    // /WEB-INF/jsp/manager2.jsp(417,37) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "type", new String("date"));
    // /WEB-INF/jsp/manager2.jsp(417,37) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/jsp/manager2.jsp(417,37) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "placeholder", new String("截止日期"));
    // /WEB-INF/jsp/manager2.jsp(417,37) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "aria-describedby", new String("deadline_icon"));
    // /WEB-INF/jsp/manager2.jsp(417,37) null
    _jspx_th_form_005finput_005f1.setDynamicAttribute(null, "style", new String("text-align:center;"));
    int[] _jspx_push_body_count_form_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f1 = _jspx_th_form_005finput_005f1.doStartTag();
      if (_jspx_th_form_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fstyle_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager2.jsp(426,37) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("emp");
    // /WEB-INF/jsp/manager2.jsp(426,37) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager2.jsp(426,37) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t                                  ");
          if (_jspx_meth_form_005fcheckbox_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t                              ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/manager2.jsp(427,41) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.empName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager2.jsp(427,41) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setPath("internList");
    // /WEB-INF/jsp/manager2.jsp(427,41) null
    _jspx_th_form_005fcheckbox_005f0.setDynamicAttribute(null, "style", new String("margin-left:15px;"));
    int[] _jspx_push_body_count_form_005fcheckbox_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f0 = _jspx_th_form_005fcheckbox_005f0.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
    }
    return false;
  }
}
