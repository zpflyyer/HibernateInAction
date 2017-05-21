package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/head.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]><html class=\"ie ie6\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]><html class=\"ie ie7\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]><html class=\"ie ie8\" lang=\"en\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html lang=\"en\"> <!--<![endif]-->\n");
      out.write("<html>\n");
      out.write("<body>\n");
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
      out.write("\n");
      out.write("\t\t<div class=\"clearfix\" style=\"margin-top: 40px;\"></div>\n");
      out.write("    <div class=\"container\" style=\"background-color: whitesmoke;\">\n");
      out.write("    \t<div class=\"clearfix\" style=\"margin-top: 20px;\"></div>\n");
      out.write("        <div><h1 style=\"text-align: center;padding-bottom: 100px;\">欢迎使用实习生管理工作流系统</h1></div>\n");
      out.write("\t\t<div ><br><br></div>\n");
      out.write("        <div class=\"col-lg-8 col-lg-offset-2\" style=\"background-color: seashell;\">\n");
      out.write("        \t<div><br></div>\n");
      out.write("            <ul class=\"nav nav-pills\" role=\"tablist\">\n");
      out.write("              <li role=\"presentation\" class=\"dropdown\">\n");
      out.write("                <a id=\"drop4\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                     <span class=\"glyphicon glyphicon-user\" style=\"margin-right: 10px;\"></span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\n");
      out.write("                  <span class=\"caret\"></span>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"menu1\" class=\"dropdown-menu\" aria-labelledby=\"drop4\">\n");
      out.write("                  <li><a href=\"#\">修改密码</a></li>\n");
      out.write("                  <li role=\"separator\" class=\"divider\"></li>\n");
      out.write("                  <li><a href=\"#\">完善个人信息</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li role=\"presentation\" class=\"active\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/logout\">登出</a></li>\n");
      out.write("              <li role=\"presentation\" ><a>\n");
      out.write("              \t当前身份:\n");
      out.write("              \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("              </a></li>\n");
      out.write("           </ul>\n");
      out.write("           <div><br></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\" style=\"margin-bottom: 50px;\"></div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-lg-offset-2\">\n");
      out.write("                <div>\n");
      out.write("                <!-- Nav tabs -->\n");
      out.write("                <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("                    <li role=\"presentation\" class=\"active\"><a href=\"#itr\" aria-controls=\"itr\" role=\"tab\" data-toggle=\"tab\">实习生管理</a></li>\n");
      out.write("                    <li role=\"presentation\"><a href=\"#mgr\" aria-controls=\"mgr\" role=\"tab\" data-toggle=\"tab\">经理管理</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!-- Tab panes -->\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane active\" id=\"itr\">\n");
      out.write("                        <table class=\"table table-bordered table-striped\" id=\"employee_tb\" contenteditable=\"false\">\n");
      out.write("                            <thead id=\"itr_tb_head\" >\n");
      out.write("                                 <tr>\n");
      out.write("                                    <th>姓名</th>\n");
      out.write("                                    <th>密码</th>\n");
      out.write("                                    <th>工资</th>\n");
      out.write("                                    <th>部门</th>\n");
      out.write("                                    <th>删除/编辑</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody id=\"itr_tb_body\">\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <tr id=\"emp_add\">\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-default\" >\n");
      out.write("                                          <span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-sm btn-info\" >\n");
      out.write("                                          <span class=\"glyphicon glyphicon-refresh\"></span>\n");
      out.write("                                        </button>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div role=\"tabpanel\" class=\"tab-pane\" id=\"mgr\">\n");
      out.write("                        <table class=\"table table-bordered table-striped\" id=\"employee_tb\" contenteditable=\"false\">\n");
      out.write("                            <thead id=\"mgr_tb_head\" >\n");
      out.write("                                 <tr>\n");
      out.write("                                    <th>姓名</th>\n");
      out.write("                                    <th>密码</th>\n");
      out.write("                                    <th>部门</th>\n");
      out.write("                                    <th>删除/编辑</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody id=\"mgr_tb_body\">\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\" style=\"margin-bottom: 170px;\"></div>\n");
      out.write("        <div id=\"text_area\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"myModal_del\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_del\">\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("            <h4 class=\"modal-title text-danger\" id=\"myModalLabel_del\" >警告</h4>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\" id=\"del_warn\">\n");
      out.write("             确认要删除用户：<span></span> 吗？\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("            <button type=\"button\" id=\"del_warn_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">删除</button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"modal fade\" id=\"myModal_edit\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_edit\">\n");
      out.write("          <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title text-danger\" id=\"myModalLabel_edit\" >更新实习生<span></span>的资料</h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\" id=\"edit_tip\">\n");
      out.write("                 <form>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"edit-pass\" class=\"control-label\">密码:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"edit_pass\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"edit-salary\" class=\"control-label\">薪水:</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"edit_salary\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("                <button type=\"button\" id=\"edit_tip_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">提交更新</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"modal fade\" id=\"myModal_merge\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel_merge\">\n");
      out.write("          <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                <h4 class=\"modal-title text-danger\" id=\"myModalLabel_merge\" >迁移实习生<span></span></h4>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\" id=\"merge_tip\">\n");
      out.write("\t\t\t         \t<div class=\"form-group\">\n");
      out.write("\t                <label for=\"merge_to\" class=\"control-label\">迁移到</label>\n");
      out.write("\t                <select class=\"form-control\" name=\"merge_to\" id=\"merge_select\">\n");
      out.write("\t                \t");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t            </div>                \n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\n");
      out.write("                <button type=\"button\" id=\"merge_tip_y\" class=\"btn btn-primary btn-warning\" data-dismiss=\"modal\">提交</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(\"#itr_tb_head tr:only-child\").find(\"th\").css(\"text-align\",\"center\");\n");
      out.write("        $(\"#itr_tb_body\").css(\"text-align\",\"center\");\n");
      out.write("        \n");
      out.write("        $(\"#mgr_tb_head tr:only-child\").find(\"th\").css(\"text-align\",\"center\");\n");
      out.write("        $(\"#mgr_tb_body\").css(\"text-align\",\"center\");\n");
      out.write("        \n");
      out.write("        $(\"#myModal_del\").on(\"show.bs.modal\",function(e){\n");
      out.write("            var del_name = $(e.relatedTarget).data(\"name\");\n");
      out.write("            $(\"#del_warn span\").get(0).innerHTML=del_name;\n");
      out.write("            $(this).find(\"#del_warn_y\").off(\"click\").on(\"click\",function(){\n");
      out.write("                var postData_del = {\n");
      out.write("                \t\"name\" : del_name\n");
      out.write("                };\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/delItr\",postData_del,\n");
      out.write("                function(data,statusText){\n");
      out.write("                    var response=eval(\"(\" + data + \")\").response;\n");
      out.write("                    if(statusText==\"success\"&&response==\"deleted\"){\n");
      out.write("                    \t$(\"#\"+del_name).remove();\n");
      out.write("                    \talert(\"删除成功\");\n");
      out.write("                     }\n");
      out.write("                     else if(statusText==\"success\"&&response==\"referenced\"){\n");
      out.write("                        alert(\"无法删除\");\n");
      out.write("                     }\n");
      out.write("                     else{\n");
      out.write("                        alert(\"删除员工失败\");\n");
      out.write("                     }\n");
      out.write("                },\n");
      out.write("                \"text\"\n");
      out.write("            );\n");
      out.write("            })\n");
      out.write("        });\n");
      out.write("        $(\"#myModal_edit\").on(\"show.bs.modal\",function(e){\n");
      out.write("            var edit_name = $(e.relatedTarget).data(\"name\");\n");
      out.write("            $(\"#myModalLabel_edit span\").get(0).innerHTML=edit_name;\n");
      out.write("            $(this).find(\"#edit_tip_y\").off(\"click\").on(\"click\",function(){\n");
      out.write("                var postData_edit = {\n");
      out.write("                    \"name\" : edit_name,\n");
      out.write("                    \"pass\" : $(\"#edit_pass\").get(0).value,\n");
      out.write("                    \"salary\" : $(\"#edit_salary\").get(0).value\n");
      out.write("                };\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/updItr\",postData_edit,\n");
      out.write("                function(data,statusText){\n");
      out.write("                    var response=eval(\"(\" + data + \")\").response;\n");
      out.write("                    if(statusText==\"success\"&&response==\"updated\"){\n");
      out.write("                        $(\"#\"+edit_name).find(\"td\").get(1).innerHTML=postData_edit.emp_pass;\n");
      out.write("                        $(\"#\"+edit_name).find(\"td\").get(2).innerHTML=postData_edit.emp_salary;\n");
      out.write("                     }\n");
      out.write("                     else{\n");
      out.write("                        alert(\"更新员工失败\");\n");
      out.write("                     }\n");
      out.write("                },\n");
      out.write("                \"text\"\n");
      out.write("            );\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $(\"#myModal_merge\").on(\"show.bs.modal\",function(e){\n");
      out.write("            var merge_name = $(e.relatedTarget).data(\"name\");\n");
      out.write("            $(\"#myModalLabel_merge span\").get(0).innerHTML=merge_name;\n");
      out.write("            $(this).find(\"#merge_tip_y\").off(\"click\").on(\"click\",function(){\n");
      out.write("                var postData_edit = {\n");
      out.write("                    \"itr\" : edit_name,\n");
      out.write("                    \"mgr\" : $(\"#merge_select\").val()\n");
      out.write("                };\n");
      out.write("                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/merge\",postData_edit,\n");
      out.write("                function(data,statusText){\n");
      out.write("                    var response=eval(\"(\" + data + \")\").response;\n");
      out.write("                    if(statusText==\"success\"&&response==\"merged\"){\n");
      out.write("                        $(\"#\"+edit_name).find(\"td\").get(3).innerHTML=postData_edit.mgr;\n");
      out.write("                     }\n");
      out.write("                     else{\n");
      out.write("                        alert(\"迁移失败\");\n");
      out.write("                     }\n");
      out.write("                },\n");
      out.write("                \"text\"\n");
      out.write("            );\n");
      out.write("            });\n");
      out.write("        });        \n");
      out.write("      \n");
      out.write("        $(\"#itr_tb_body tr:last-child\").each(\n");
      out.write("            function(i)\n");
      out.write("            {\n");
      out.write("                $(this).find(\"td:last-child\").each(\n");
      out.write("                    function(i)\n");
      out.write("                    {\n");
      out.write("                        $(this).find(\".btn-default\").on(\"click\"\n");
      out.write("                            ,function(event)\n");
      out.write("                            {\n");
      out.write("                                $(\"#emp_add\").find(\"td:not('#emp_add td:last-child')\").attr(\"contenteditable\",\"true\");\n");
      out.write("                            }\n");
      out.write("                        );\n");
      out.write("                        $(this).find(\".btn-info\").on(\"click\"\n");
      out.write("                            ,function(event)\n");
      out.write("                            {\n");
      out.write("                                $(\"#emp_add\").find(\"td\").attr(\"contenteditable\",\"false\");\n");
      out.write("                                var name=$(\"#emp_add\").find(\"td\").get(0).innerHTML;\n");
      out.write("                                var pass=$(\"#emp_add\").find(\"td\").get(1).innerHTML;\n");
      out.write("                                var salary=$(\"#emp_add\").find(\"td\").get(2).innerHTML;\n");
      out.write("                                var mgr=$(\"#emp_add\").find(\"td\").get(3).innerHTML;\n");
      out.write("                                alert(name+pass+salary+mgr);\n");
      out.write("                                var postData_add = {\n");
      out.write("                                    \"name\" : name,\n");
      out.write("                                    \"pass\": pass,\n");
      out.write("                                    \"salary\" : salary,\n");
      out.write("                                    \"dept\" : dept\n");
      out.write("                                };\n");
      out.write("                                $.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/admin/addItr\",postData_add,\n");
      out.write("                                    function(data,statusText){\n");
      out.write("                                        var response=eval(\"(\" + data + \")\").response;\n");
      out.write("                                        if(statusText==\"success\"&&response==\"added\"){\n");
      out.write("                                             alert(\"添加员工成功\");\n");
      out.write("                                         }\n");
      out.write("                                         else {\n");
      out.write("                                            alert(\"添加员工失败\");\n");
      out.write("                                         }\n");
      out.write("                                    },\n");
      out.write("                                    \"text\"\n");
      out.write("                                );\n");
      out.write("                            }\n");
      out.write("                        );\n");
      out.write("                    }\n");
      out.write("                );\n");
      out.write("            }\n");
      out.write("        );\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/admin.jsp(39,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              \t\t管理员\n");
        out.write("              \t");
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/admin.jsp(42,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role == 'manager'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              \t\t经理\n");
        out.write("              \t");
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

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/admin.jsp(45,15) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${role == 'intern'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              \t\t实习生\n");
        out.write("              \t");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/admin.jsp(76,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("employee");
    // /WEB-INF/jsp/admin.jsp(76,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employeeList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/admin.jsp(76,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empPass}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.dept}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-danger\"  data-toggle=\"modal\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_del\">\n");
          out.write("                                              <span class=\"glyphicon glyphicon-remove\"></span>\n");
          out.write("                                            </button>\n");
          out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-warning\" data-toggle=\"modal\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_edit\">\n");
          out.write("                                              <span class=\"glyphicon glyphicon-edit\"></span>\n");
          out.write("                                            </button>\n");
          out.write("                                             <button type=\"button\" class=\"btn btn-sm btn-info\" data-toggle=\"modal\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employee.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_merge\">\n");
          out.write("                                              <span class=\"glyphicon glyphicon-move\"></span>\n");
          out.write("                                            </button>                                           \n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/admin.jsp(123,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("mgr");
    // /WEB-INF/jsp/admin.jsp(123,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgrList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/admin.jsp(123,32) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrPass}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrDept}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-danger\"  data-toggle=\"modal\" data-name=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_del_mgr\">\n");
          out.write("                                              <span class=\"glyphicon glyphicon-remove\"></span>\n");
          out.write("                                            </button>\n");
          out.write("                                            <button type=\"button\" class=\"btn btn-sm btn-warning\" data-toggle=\"modal\" data-name=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_edit_mgr\">\n");
          out.write("                                              <span class=\"glyphicon glyphicon-edit\"></span>\n");
          out.write("                                            </button>\n");
          out.write("                                             <button type=\"button\" class=\"btn btn-sm btn-info\" data-toggle=\"modal\" data-name=\"$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" data-target=\"#myModal_merge_mgr\">\n");
          out.write("                                              <span class=\"glyphicon glyphicon-move\"></span>\n");
          out.write("                                            </button>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                               ");
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

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/jsp/admin.jsp(208,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("mgr");
    // /WEB-INF/jsp/admin.jsp(208,18) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgrlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/admin.jsp(208,18) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t    \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mgr.mgrName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t\t    ");
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
}
