package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/head.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.release();
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
      out.write("<body>\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Basic Page Needs -->\n");
      out.write("    <meta charset=\"utf-8\"/>\n");
      out.write("\n");
      out.write("    <title>Working Flow System</title>\n");
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
      out.write("\n");
      out.write("\n");
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
      out.write("</head>");
      out.write("\r\n");
      out.write("\t\t<div class=\"clearfix\" style=\"margin-top: 40px;\"></div>\r\n");
      out.write("    <div class=\"container\" style=\"background-color: whitesmoke;\">\r\n");
      out.write("    \t<div class=\"clearfix\" style=\"margin-top: 20px;\"></div>\r\n");
      out.write("        <div><h1 style=\"text-align: center;padding-bottom: 100px;\">欢迎使用实习生管理工作流系统</h1></div>\r\n");
      out.write("\t\t<div ><br><br></div>\r\n");
      out.write("        <div class=\"col-lg-8 col-lg-offset-2\" style=\"background-color: seashell;\">\r\n");
      out.write("        \t<div><br></div>\r\n");
      out.write("            <ul class=\"nav nav-pills\" role=\"tablist\">\r\n");
      out.write("              <li role=\"presentation\" class=\"dropdown\">\r\n");
      out.write("                <a id=\"drop4\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                     <span class=\"glyphicon glyphicon-user\" style=\"margin-right: 10px;\"></span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                  <span class=\"caret\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul id=\"menu1\" class=\"dropdown-menu\" aria-labelledby=\"drop4\">\r\n");
      out.write("                  <li><a href=\"#\">修改密码</a></li>\r\n");
      out.write("                  <li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("                  <li><a href=\"#\">完善个人信息</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li role=\"presentation\" class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout\">登出</a></li>\r\n");
      out.write("           </ul>\r\n");
      out.write("           <div><br></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clearfix\" style=\"margin-bottom: 50px;\"></div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2\">\r\n");
      out.write("                <div>\r\n");
      out.write("                <!-- Nav tabs -->\r\n");
      out.write("                <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"#all\" aria-controls=\"all\" role=\"tab\" data-toggle=\"tab\">部门实习生管理</a></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"#customer\" aria-controls=\"customer\" role=\"tab\" data-toggle=\"tab\">上月实习生发薪记录</a></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"#employee\" aria-controls=\"employee\" role=\"tab\" data-toggle=\"tab\">处理申请</a></li>\r\n");
      out.write("<!--                    <li role=\"presentation\"><a href=\"#attends\" aria-controls=\"attends\" role=\"tab\" data-toggle=\"tab\">出勤统计</a></li>\r\n");
      out.write("-->\r\n");
      out.write("                    <li role=\"presentation\" class=\"active\"><a href=\"#command\" aria-controls=\"command\" role=\"tab\" data-toggle=\"tab\">分配任务</a></li>\r\n");
      out.write("                    <li role=\"presentation\"><a href=\"#tasks\" aria-controls=\"tasks\" role=\"tab\" data-toggle=\"tab\">任务进度</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <!-- Tab panes -->\r\n");
      out.write("                <div class=\"tab-content\">\r\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"tasks\">\r\n");
      out.write("                        <table class=\"table table-bordered table-striped\" id=\"tasks_tb\" contenteditable=\"false\">\r\n");
      out.write("                            <thead id=\"tasks_tb_head\" >\r\n");
      out.write("                                 <tr>\r\n");
      out.write("                                    <th>任务</th>\r\n");
      out.write("                                    <th>实习生</th>\r\n");
      out.write("                                    <th>进度</th>\r\n");
      out.write("                                    <th>分数</th>\r\n");
      out.write("                                    <th>操作</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"tasks_tb_body\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"all\">\r\n");
      out.write("                        <table class=\"table table-bordered table-striped\" id=\"employee_tb\" contenteditable=\"false\">\r\n");
      out.write("                            <thead id=\"employee_tb_head\" >\r\n");
      out.write("                                 <tr>\r\n");
      out.write("                                    <th>姓名</th>\r\n");
      out.write("                                    <th>密码</th>\r\n");
      out.write("                                    <th>工资</th>\r\n");
      out.write("                                    <th>删除/编辑</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"employee_tb_body\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <tr id=\"emp_add\">\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td></td>\r\n");
      out.write("                                    <td>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-default\" >\r\n");
      out.write("                                          <span class=\"glyphicon glyphicon-plus\"></span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-info\" >\r\n");
      out.write("                                          <span class=\"glyphicon glyphicon-refresh\"></span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"customer\">\r\n");
      out.write("                        <table class=\"table table-bordered table-striped\" id=\"depSal_tb\" contenteditable=\"false\" >\r\n");
      out.write("                            <thead id=\"depSal_tb_head\" >\r\n");
      out.write("                                 <tr>\r\n");
      out.write("                                    <th>实习生</th>\r\n");
      out.write("                                    <th>工资</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"depSal_tb_body\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"employee\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"attends\">\r\n");
      out.write("                        <table class=\"table table-bordered table-striped\" id=\"depSal_tb\" contenteditable=\"false\" >\r\n");
      out.write("                            <thead id=\"depSal_tb_head\" >\r\n");
      out.write("                                 <tr>\r\n");
      out.write("                                    <th>实习生</th>\r\n");
      out.write("                                    <th>出勤</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody id=\"depSal_tb_body\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane active\" id=\"command\">\r\n");
      out.write("                        <!--\r\n");
      out.write("                        ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f0.setParent(null);
      // /WEB-INF/jsp/manager1.jsp(200,24) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setModelAttribute("task_vo");
      // /WEB-INF/jsp/manager1.jsp(200,24) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}/manager/assign", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/manager1.jsp(200,24) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f0.setMethod("post");
      int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
        if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                            <table class=\"table table-bordered table-striped\" >\r\n");
            out.write("                                <tr>\r\n");
            out.write("                                    <td>任务标题</td>\r\n");
            out.write("                                    <td>");
            if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("                                    <td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager1.jsp(205,58) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</font></td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("                                    <td>描述</td>\r\n");
            out.write("                                    <td>");
            if (_jspx_meth_form_005ftextarea_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("                                    <td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager1.jsp(210,58) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</font></td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("                                    <td>截止日期</td>\r\n");
            out.write("                                    <td>");
            if (_jspx_meth_form_005finput_005f1(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("                                    <td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager1.jsp(215,58) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</font></td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                                 <tr>\r\n");
            out.write("                                     <td>分配目标</td>\r\n");
            out.write("                                     <td>\r\n");
            out.write("                                        ");
            if (_jspx_meth_c_005fforEach_005f6(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
              return;
            out.write("\r\n");
            out.write("                                     <td>\r\n");
            out.write("                                     <td><font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
            // /WEB-INF/jsp/manager1.jsp(224,59) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
            out.write("</font></td>\r\n");
            out.write("                                 </tr>\r\n");
            out.write("                                <tr>\r\n");
            out.write("                                    <td><input type = \"submit\" value = \"提交\"/></td>\r\n");
            out.write("                                </tr>\r\n");
            out.write("                            </table>\r\n");
            out.write("                        ");
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
        _005fjspx_005ftagPool_005fform_005fform_0026_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
      }
      out.write("\r\n");
      out.write("                        -->\r\n");
      out.write("                        ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_005fform_005f1.setPageContext(_jspx_page_context);
      _jspx_th_form_005fform_005f1.setParent(null);
      // /WEB-INF/jsp/manager1.jsp(232,24) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f1.setModelAttribute("task_vo");
      // /WEB-INF/jsp/manager1.jsp(232,24) null
      _jspx_th_form_005fform_005f1.setDynamicAttribute(null, "class", new String("form-horizontal"));
      // /WEB-INF/jsp/manager1.jsp(232,24) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f1.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}/manager/assign", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      // /WEB-INF/jsp/manager1.jsp(232,24) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_form_005fform_005f1.setMethod("post");
      // /WEB-INF/jsp/manager1.jsp(232,24) null
      _jspx_th_form_005fform_005f1.setDynamicAttribute(null, "style", new String("padding: 35px;"));
      int[] _jspx_push_body_count_form_005fform_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_form_005fform_005f1 = _jspx_th_form_005fform_005f1.doStartTag();
        if (_jspx_eval_form_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                            <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f4.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
            // /WEB-INF/jsp/manager1.jsp(233,46) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f4.setPath("title");
            int[] _jspx_push_body_count_form_005ferrors_005f4 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f4 = _jspx_th_form_005ferrors_005f4.doStartTag();
              if (_jspx_th_form_005ferrors_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f4.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f4);
            }
            out.write("</font>\r\n");
            out.write("                            <div class=\"form-group\">\r\n");
            out.write("                                <div class=\"input-group \">\r\n");
            out.write("                                  <span class=\"input-group-addon\" id=\"title_icon\">\r\n");
            out.write("                                    <span class=\"glyphicon glyphicon-header\"></span>\r\n");
            out.write("                                  </span>\r\n");
            out.write("                                  ");
            if (_jspx_meth_form_005finput_005f2(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                </div>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f5.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
            // /WEB-INF/jsp/manager1.jsp(242,46) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f5.setPath("content");
            int[] _jspx_push_body_count_form_005ferrors_005f5 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f5 = _jspx_th_form_005ferrors_005f5.doStartTag();
              if (_jspx_th_form_005ferrors_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f5.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f5);
            }
            out.write("</font>\r\n");
            out.write("                            <div class=\"form-group\">\r\n");
            out.write("                                <div class=\"input-group \">\r\n");
            out.write("                                  <span class=\"input-group-addon\" id=\"content_icon\">\r\n");
            out.write("                                    <span class=\"glyphicon glyphicon-book\"></span>\r\n");
            out.write("                                  </span>\r\n");
            out.write("                                  ");
            if (_jspx_meth_form_005ftextarea_005f1(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                </div>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f6.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
            // /WEB-INF/jsp/manager1.jsp(251,46) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f6.setPath("deadline");
            int[] _jspx_push_body_count_form_005ferrors_005f6 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f6 = _jspx_th_form_005ferrors_005f6.doStartTag();
              if (_jspx_th_form_005ferrors_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f6.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f6);
            }
            out.write("</font>\r\n");
            out.write("                            <div class=\"form-group\">\r\n");
            out.write("                                <div class=\"input-group \">\r\n");
            out.write("                                  <span class=\"input-group-addon\" id=\"deadline_icon\">\r\n");
            out.write("                                    <span class=\"glyphicon glyphicon-time\"></span>\r\n");
            out.write("                                  </span>\r\n");
            out.write("                                  ");
            if (_jspx_meth_form_005finput_005f3(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                </div>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <font color=\"red\">");
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_005ferrors_005f7 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_005ferrors_005f7.setPageContext(_jspx_page_context);
            _jspx_th_form_005ferrors_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
            // /WEB-INF/jsp/manager1.jsp(260,46) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_form_005ferrors_005f7.setPath("internList");
            int[] _jspx_push_body_count_form_005ferrors_005f7 = new int[] { 0 };
            try {
              int _jspx_eval_form_005ferrors_005f7 = _jspx_th_form_005ferrors_005f7.doStartTag();
              if (_jspx_th_form_005ferrors_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_005ferrors_005f7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_005ferrors_005f7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_005ferrors_005f7.doFinally();
              _005fjspx_005ftagPool_005fform_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ferrors_005f7);
            }
            out.write("</font>\r\n");
            out.write("                            <div class=\"form-group\">\r\n");
            out.write("                                <div class=\"input-group \">\r\n");
            out.write("                                <span class=\"input-group-addon\" id=\"deadline_icon\">\r\n");
            out.write("                                   <span class=\"glyphicon glyphicon-user\" ></span>\r\n");
            out.write("                                </span>\r\n");
            out.write("                                  ");
            if (_jspx_meth_c_005fforEach_005f7(_jspx_th_form_005fform_005f1, _jspx_page_context, _jspx_push_body_count_form_005fform_005f1))
              return;
            out.write("\r\n");
            out.write("                                </div>\r\n");
            out.write("                            </div>\r\n");
            out.write("                            <button type=\"submit\"  class=\"btn btn-success btn-block\">提 交</button>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_form_005fform_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_005fform_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_005fform_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_005fform_005f1.doFinally();
        _005fjspx_005ftagPool_005fform_005fform_0026_005fstyle_005fmodelAttribute_005fmethod_005fclass_005faction.reuse(_jspx_th_form_005fform_005f1);
      }
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clearfix\" style=\"margin-bottom: 170px;\"></div>\r\n");
      out.write("        <div id=\"text_area\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal_del\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_del\">\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("            <h4 class=\"modal-title text-danger\" id=\"myModalLabel_del\" >警告</h4>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\" id=\"del_warn\">\r\n");
      out.write("             确认要删除用户：<span></span> 吗？\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            <button type=\"button\" id=\"del_warn_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">删除</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"myModal_edit\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_edit\">\r\n");
      out.write("          <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("              <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                <h4 class=\"modal-title text-danger\" id=\"myModalLabel_edit\" >更新实习生<span></span>的资料</h4>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-body\" id=\"edit_tip\">\r\n");
      out.write("                 <form>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"edit-pass\" class=\"control-label\">密码:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"edit_pass\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label for=\"edit-salary\" class=\"control-label\">薪水:</label>\r\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"edit_salary\"></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("                <button type=\"button\" id=\"edit_tip_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">提交更新</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
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
      out.write("    <div class=\"modal fade\" id=\"myModal_check\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_check\">\r\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("          <div class=\"modal-header\">\r\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("            <h4 class=\"modal-title text-info\" id=\"myModalLabel_check\" >处理<span></span>对<span></span>出勤申请的处理</h4>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-body\" id=\"check_info\">\r\n");
      out.write("            \t<div class=\"form-group\">\r\n");
      out.write("                    <label for=\"check_type\" class=\"control-label\">申请类型</label>\r\n");
      out.write("                    <select class=\"form-control\"  id=\"check_result\">\r\n");
      out.write("\t\t\t\t\t    <option value=\"true\">同意</option>\r\n");
      out.write("\t\t\t\t\t    <option value=\"false\">驳回</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("                </div>\r\n");
      out.write("             <form>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"check_reason\" class=\"control-label\">批复说明</label>\r\n");
      out.write("\t\t\t\t\t\t<textarea class=\"form-control\" id=\"check_reason\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"modal-footer\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-info\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("            <button type=\"button\" id=\"check_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">提交</button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(\"#myModal_del\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("            var del_name = $(e.relatedTarget).data(\"name\");\r\n");
      out.write("            $(\"#del_warn span\").get(0).innerHTML=del_name;\r\n");
      out.write("            $(this).find(\"#del_warn_y\").off(\"click\").on(\"click\",function(){\r\n");
      out.write("                var postData_del = {\r\n");
      out.write("                \t\"emp_name\" : del_name\r\n");
      out.write("                };\r\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/delEmpl\",postData_del,\r\n");
      out.write("                function(data,statusText){\r\n");
      out.write("                    var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("                    if(statusText==\"success\"&&response==\"deleted\"){\r\n");
      out.write("                    \t$(\"#\"+del_name).remove();\r\n");
      out.write("                    \talert(\"删除成功\");\r\n");
      out.write("                     }\r\n");
      out.write("                     else if(statusText==\"success\"&&response==\"referenced\"){\r\n");
      out.write("                        alert(\"无法删除\");\r\n");
      out.write("                     }\r\n");
      out.write("                     else{\r\n");
      out.write("                        alert(\"删除员工失败\");\r\n");
      out.write("                     }\r\n");
      out.write("                },\r\n");
      out.write("                \"text\"\r\n");
      out.write("            );\r\n");
      out.write("            })\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#myModal_edit\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("            var edit_name = $(e.relatedTarget).data(\"name\");\r\n");
      out.write("            $(\"#myModalLabel_edit span\").get(0).innerHTML=edit_name;\r\n");
      out.write("            $(this).find(\"#edit_tip_y\").off(\"click\").on(\"click\",function(){\r\n");
      out.write("                var postData_edit = {\r\n");
      out.write("                    \"emp_name\" : edit_name,\r\n");
      out.write("                    \"emp_pass\" : $(\"#edit_pass\").get(0).value,\r\n");
      out.write("                    \"emp_salary\" : $(\"#edit_salary\").get(0).value\r\n");
      out.write("                };\r\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/updEmpl\",postData_edit,\r\n");
      out.write("                function(data,statusText){\r\n");
      out.write("                    var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("                    if(statusText==\"success\"&&response==\"updated\"){\r\n");
      out.write("                        $(\"#\"+edit_name).find(\"td\").get(1).innerHTML=postData_edit.emp_pass;\r\n");
      out.write("                        $(\"#\"+edit_name).find(\"td\").get(2).innerHTML=postData_edit.emp_salary;\r\n");
      out.write("                     }\r\n");
      out.write("                     else{\r\n");
      out.write("                        alert(\"更新员工失败\");\r\n");
      out.write("                     }\r\n");
      out.write("                },\r\n");
      out.write("                \"text\"\r\n");
      out.write("            );\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#myModal_check\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("            var app_emp = $(e.relatedTarget).data(\"app_emp\");\r\n");
      out.write("            var app_date = $(e.relatedTarget).data(\"app_date\");\r\n");
      out.write("            $(\"#myModalLabel_check span\").get(0).innerHTML=app_emp;\r\n");
      out.write("            $(\"#myModalLabel_check span\").get(1).innerHTML=app_date;\r\n");
      out.write("            $(this).find(\"#check_y\").off(\"click\").on(\"click\",function(){\r\n");
      out.write("            var app_id = $(e.relatedTarget).data(\"app_id\");\r\n");
      out.write("            var result = $(\"#check_result\").val();\r\n");
      out.write("            var reason = $(\"#check_reason\").val();\r\n");
      out.write("            var postData_check = {\r\n");
      out.write("                \"app_id\" : app_id,\r\n");
      out.write("                \"mgr\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",\r\n");
      out.write("                \"result\" : result,\r\n");
      out.write("                \"reason\" : reason\r\n");
      out.write("            };\r\n");
      out.write("            alert(app_id+\":\"+\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"+\":\"+result+\":\"+reason)\r\n");
      out.write("            $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/check\",postData_check,\r\n");
      out.write("                function(data,statusText){\r\n");
      out.write("                    var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("                    alert(response);\r\n");
      out.write("                    if(statusText==\"success\"&&response==\"checked\"){\r\n");
      out.write("                        alert(\"#\"+app_emp);\r\n");
      out.write("                        $(\"#\"+app_emp+\"_\"+app_date).get(0).innerHTML=\"已处理\";\r\n");
      out.write("                        $(\"#\"+app_emp+\"_\"+app_date).attr(\"disabled\",true);\r\n");
      out.write("                     }\r\n");
      out.write("                     else{\r\n");
      out.write("                        alert(\"提交失败\");\r\n");
      out.write("                     }\r\n");
      out.write("                },\r\n");
      out.write("                \"text\"\r\n");
      out.write("            );\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        $(\"#myModal_task\").on(\"show.bs.modal\",function(e){\r\n");
      out.write("            var job_id = $(e.relatedTarget).data(\"job_id\");\r\n");
      out.write("            var intern = $(e.relatedTarget).data(\"intern\");\r\n");
      out.write("            $(\"#myModalLabel_task span\").get(0).innerHTML=intern;\r\n");
      out.write("            \r\n");
      out.write("            $(this).find(\"#task_tip_y\").off(\"click\").on(\"click\"\r\n");
      out.write("            ,function(){\r\n");
      out.write("\t            var finished = $(\"#check_finished\").val();\r\n");
      out.write("\t            var grade = $(\"#input_grade\").val();\r\n");
      out.write("\t            var postData_task = {\r\n");
      out.write("\t                \"job_id\" : job_id,\r\n");
      out.write("\t                \"grade\" : grade,\r\n");
      out.write("\t                \"finished\" : finished\r\n");
      out.write("\t            };\r\n");
      out.write("\t            alert(job_id+\":\"+grade+\":\"+finished)\r\n");
      out.write("\t            $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/judge\",postData_task,\r\n");
      out.write("\t                function(data,statusText){\r\n");
      out.write("\t                    var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("\t                    alert(response);\r\n");
      out.write("\t                    if(statusText==\"success\"&&response==\"succeed\"){\r\n");
      out.write("\t                        $(\"#\"+job_id).get(0).innerHTML=\"已评价\";\r\n");
      out.write("\t                        $(\"#\"+job_id).attr(\"disabled\",true);\r\n");
      out.write("\t                     }\r\n");
      out.write("\t                     else{\r\n");
      out.write("\t                        alert(\"提交失败\");\r\n");
      out.write("\t                     }\r\n");
      out.write("\t                },\r\n");
      out.write("\t                \"text\"\r\n");
      out.write("\t            );\r\n");
      out.write("           });\r\n");
      out.write("        });        \r\n");
      out.write("        $(\"#employee_tb_head tr:only-child\").find(\"th\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#employee_tb_body\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#depSal_tb_head tr:only-child\").find(\"th\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#depSal_tb_body\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#app_tb_head tr:only-child\").find(\"th\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#app_tb_body\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#tasks_tb_head tr:only-child\").find(\"th\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#tasks_tb_body\").css(\"text-align\",\"center\");\r\n");
      out.write("        $(\"#employee_tb_body tr:last-child\").each(\r\n");
      out.write("            function(i)\r\n");
      out.write("            {\r\n");
      out.write("                $(this).find(\"td:last-child\").each(\r\n");
      out.write("                    function(i)\r\n");
      out.write("                    {\r\n");
      out.write("                        $(this).find(\".btn-default\").on(\"click\"\r\n");
      out.write("                            ,function(event)\r\n");
      out.write("                            {\r\n");
      out.write("                                $(\"#emp_add\").find(\"td:not('#emp_add td:last-child')\").attr(\"contenteditable\",\"true\");\r\n");
      out.write("                            }\r\n");
      out.write("                        );\r\n");
      out.write("                        $(this).find(\".btn-info\").on(\"click\"\r\n");
      out.write("                            ,function(event)\r\n");
      out.write("                            {\r\n");
      out.write("                                $(\"#emp_add\").find(\"td\").attr(\"contenteditable\",\"false\");\r\n");
      out.write("                                var name=$(\"#emp_add\").find(\"td\").get(0).innerHTML;\r\n");
      out.write("                                var pass=$(\"#emp_add\").find(\"td\").get(1).innerHTML;\r\n");
      out.write("                                var salary=$(\"#emp_add\").find(\"td\").get(2).innerHTML;\r\n");
      out.write("                                var postData_add = {\r\n");
      out.write("                                    \"emp_name\" : name,\r\n");
      out.write("                                    \"emp_pass\": pass,\r\n");
      out.write("                                    \"emp_salary\" : salary\r\n");
      out.write("                                };\r\n");
      out.write("                                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/manager/addEmpl\",postData_add,\r\n");
      out.write("                                    function(data,statusText){\r\n");
      out.write("                                        $(\"#text_area\").innerHTML=statusText;\r\n");
      out.write("                                        var response=eval(\"(\" + data + \")\").response;\r\n");
      out.write("                                        if(statusText==\"success\"&&response==\"added\"){\r\n");
      out.write("                                             var name_add=eval(\"(\" + data + \")\").name;\r\n");
      out.write("                                             var pass_add=eval(\"(\" + data + \")\").pass;\r\n");
      out.write("                                             var salary_add=eval(\"(\" + data + \")\").salary;\r\n");
      out.write("                                             var new_row = $(\"#employee_tb_body\").find(\"tr:first-child\").clone();\r\n");
      out.write("                                             new_row.find(\"td\").get(0).innerHTML=name_add;\r\n");
      out.write("                                             new_row.find(\"td\").get(1).innerHTML=pass_add;\r\n");
      out.write("                                             new_row.find(\"td\").get(2).innerHTML=salary_add;\r\n");
      out.write("                                             $(new_row).find(\"td:last-child\").each(\r\n");
      out.write("                                                function(i)\r\n");
      out.write("                                                {\r\n");
      out.write("                                                   $(this).find(\".btn-danger\").attr(\"data-name\",name);\r\n");
      out.write("                                                   $(this).find(\".btn-warning\").attr(\"data-name\",name);\r\n");
      out.write("                                                   $(this).find(\".btn-danger\").parents(\"tr\").attr(\"id\",name);\r\n");
      out.write("                                                }\r\n");
      out.write("                                            );\r\n");
      out.write("                                             $(\"#employee_tb_body\").find(\"tr:last-child\").before(new_row);\r\n");
      out.write("                                             $(\"#emp_add\").find(\"td\").get(0).innerHTML=\"\";\r\n");
      out.write("                                             $(\"#emp_add\").find(\"td\").get(1).innerHTML=\"\";\r\n");
      out.write("                                             $(\"#emp_add\").find(\"td\").get(2).innerHTML=\"\";\r\n");
      out.write("                                         }\r\n");
      out.write("                                         else if(statusText==\"success\"&&response==\"existed\"){\r\n");
      out.write("                                            alert(\"该员工已经存在\");\r\n");
      out.write("                                         }\r\n");
      out.write("                                         else {\r\n");
      out.write("                                            alert(\"添加员工失败\");\r\n");
      out.write("                                         }\r\n");
      out.write("                                    },\r\n");
      out.write("                                    \"text\"\r\n");
      out.write("                                );\r\n");
      out.write("                            }\r\n");
      out.write("                        );\r\n");
      out.write("                    }\r\n");
      out.write("                );\r\n");
      out.write("            }\r\n");
      out.write("        );\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/manager1.jsp(69,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("task");
    // /WEB-INF/jsp/manager1.jsp(69,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(69,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                               ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/manager1.jsp(70,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("job");
    // /WEB-INF/jsp/manager1.jsp(70,36) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.jobBeanList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(70,36) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${task.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.intern}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                                            ");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.grade}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td><button class=\"btn btn-link\"  id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.job_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-toggle=\"modal\" data-job_id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.job_id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-intern=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.intern}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_task\">评价</button></td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/manager1.jsp(74,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.finished}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <td>已完成</td>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/manager1.jsp(77,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!job.finished}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                <td>尚未完成</td>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/jsp/manager1.jsp(99,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("employee");
    // /WEB-INF/jsp/manager1.jsp(99,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(99,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empPass}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-danger\"  data-toggle=\"modal\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_del\">\r\n");
          out.write("                                              <span class=\"glyphicon glyphicon-remove\"></span>\r\n");
          out.write("                                            </button>\r\n");
          out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-warning\" data-toggle=\"modal\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_edit\">\r\n");
          out.write("                                              <span class=\"glyphicon glyphicon-edit\"></span>\r\n");
          out.write("                                            </button>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                               ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent(null);
    // /WEB-INF/jsp/manager1.jsp(139,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("sal");
    // /WEB-INF/jsp/manager1.jsp(139,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depSalist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(139,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sal.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sal.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                               ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/manager1.jsp(149,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty appList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <table class=\"table table-bordered table-striped\" id=\"app_tb\" contenteditable=\"false\">\r\n");
        out.write("                                <thead id=\"app_tb_head\" >\r\n");
        out.write("                                     <tr>\r\n");
        out.write("                                        <th>实习生</th>\r\n");
        out.write("                                        <th>考勤日期</th>\r\n");
        out.write("                                        <th>考勤类型</th>\r\n");
        out.write("                                        <th>申请类型</th>\r\n");
        out.write("                                        <th>申请理由</th>\r\n");
        out.write("                                        <th>处理</th>\r\n");
        out.write("                                    </tr>\r\n");
        out.write("                                </thead>\r\n");
        out.write("                                <tbody id=\"app_tb_body\">\r\n");
        out.write("                                    ");
        if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                </tbody>\r\n");
        out.write("                            </table>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/manager1.jsp(162,36) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("app");
    // /WEB-INF/jsp/manager1.jsp(162,36) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(162,36) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <tr >\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.emp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.unAttend}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.toAttend}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.reason}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                            <td><button class=\"btn btn-link\"  id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.emp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('_');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-toggle=\"modal\" data-app_emp=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.emp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-app_date=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.date}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-app_id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_check\">处理</button></td>\r\n");
          out.write("                                        </tr>\r\n");
          out.write("                                   ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/manager1.jsp(175,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty appList}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <div class=\"clearfix\" style=\"margin-bottom: 70px;\"></div>\r\n");
        out.write("                            <button class=\"btn btn-block\" id=\"no\" style=\"padding: 10px;\"><span class=\"glyphicon glyphicon-alert\"><a> 尚无申请需要处理</a></span></button>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent(null);
    // /WEB-INF/jsp/manager1.jsp(189,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("sal");
    // /WEB-INF/jsp/manager1.jsp(189,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depSalist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(189,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sal.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sal.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sal.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                               ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager1.jsp(204,40) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("title");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f0 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager1.jsp(209,40) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f0.setPath("content");
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
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005fpath_005fnobody.reuse(_jspx_th_form_005ftextarea_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager1.jsp(214,40) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f1.setPath("deadline");
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
      _005fjspx_005ftagPool_005fform_005finput_0026_005fpath_005fnobody.reuse(_jspx_th_form_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/manager1.jsp(220,40) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVar("emp");
    // /WEB-INF/jsp/manager1.jsp(220,40) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(220,40) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            ");
          if (_jspx_meth_form_005fcheckbox_005f0(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f0 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /WEB-INF/jsp/manager1.jsp(221,44) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.empName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(221,44) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f0.setPath("internList");
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
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fpath_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /WEB-INF/jsp/manager1.jsp(239,34) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f2.setPath("title");
    // /WEB-INF/jsp/manager1.jsp(239,34) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/jsp/manager1.jsp(239,34) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/jsp/manager1.jsp(239,34) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "placeholder", new String("题目"));
    // /WEB-INF/jsp/manager1.jsp(239,34) null
    _jspx_th_form_005finput_005f2.setDynamicAttribute(null, "aria-describedby", new String("title_icon"));
    int[] _jspx_push_body_count_form_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f2 = _jspx_th_form_005finput_005f2.doStartTag();
      if (_jspx_th_form_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.reuse(_jspx_th_form_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_form_005ftextarea_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_005ftextarea_005f1 = (org.springframework.web.servlet.tags.form.TextareaTag) _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005ftextarea_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /WEB-INF/jsp/manager1.jsp(248,34) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005ftextarea_005f1.setPath("content");
    // /WEB-INF/jsp/manager1.jsp(248,34) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/jsp/manager1.jsp(248,34) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/jsp/manager1.jsp(248,34) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "placeholder", new String("内容"));
    // /WEB-INF/jsp/manager1.jsp(248,34) null
    _jspx_th_form_005ftextarea_005f1.setDynamicAttribute(null, "aria-describedby", new String("content_icon"));
    int[] _jspx_push_body_count_form_005ftextarea_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005ftextarea_005f1 = _jspx_th_form_005ftextarea_005f1.doStartTag();
      if (_jspx_th_form_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005ftextarea_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005ftextarea_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005ftextarea_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005ftextarea_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.reuse(_jspx_th_form_005ftextarea_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /WEB-INF/jsp/manager1.jsp(257,34) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f3.setPath("deadline");
    // /WEB-INF/jsp/manager1.jsp(257,34) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "type", new String("text"));
    // /WEB-INF/jsp/manager1.jsp(257,34) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "class", new String("form-control"));
    // /WEB-INF/jsp/manager1.jsp(257,34) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "placeholder", new String("截止日期"));
    // /WEB-INF/jsp/manager1.jsp(257,34) null
    _jspx_th_form_005finput_005f3.setDynamicAttribute(null, "aria-describedby", new String("deadline_icon"));
    int[] _jspx_push_body_count_form_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f3 = _jspx_th_form_005finput_005f3.doStartTag();
      if (_jspx_th_form_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005faria_002ddescribedby_005fnobody.reuse(_jspx_th_form_005finput_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f1);
    // /WEB-INF/jsp/manager1.jsp(266,34) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVar("emp");
    // /WEB-INF/jsp/manager1.jsp(266,34) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(266,34) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
      if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                      ");
          if (_jspx_meth_form_005fcheckbox_005f1(_jspx_th_c_005fforEach_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
            return true;
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\r\n");
          out.write("                                  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f7.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fcheckbox_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:checkbox
    org.springframework.web.servlet.tags.form.CheckboxTag _jspx_th_form_005fcheckbox_005f1 = (org.springframework.web.servlet.tags.form.CheckboxTag) _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.CheckboxTag.class);
    _jspx_th_form_005fcheckbox_005f1.setPageContext(_jspx_page_context);
    _jspx_th_form_005fcheckbox_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f7);
    // /WEB-INF/jsp/manager1.jsp(267,38) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.empName}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/manager1.jsp(267,38) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fcheckbox_005f1.setPath("internList");
    // /WEB-INF/jsp/manager1.jsp(267,38) null
    _jspx_th_form_005fcheckbox_005f1.setDynamicAttribute(null, "style", new String("margin-left:15px;"));
    int[] _jspx_push_body_count_form_005fcheckbox_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fcheckbox_005f1 = _jspx_th_form_005fcheckbox_005f1.doStartTag();
      if (_jspx_th_form_005fcheckbox_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fcheckbox_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fcheckbox_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fcheckbox_005f1.doFinally();
      _005fjspx_005ftagPool_005fform_005fcheckbox_0026_005fvalue_005fstyle_005fpath_005fnobody.reuse(_jspx_th_form_005fcheckbox_005f1);
    }
    return false;
  }
}
