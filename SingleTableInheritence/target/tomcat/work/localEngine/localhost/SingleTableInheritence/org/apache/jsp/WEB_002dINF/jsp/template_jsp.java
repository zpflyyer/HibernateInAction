package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/jsp/head.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<c:set var=\"context\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("    <!-- js code -->\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${context}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.2.1.js\"></script>\n");
      out.write("\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<!--[if lt IE 7 ]>\r\n");
      out.write("<html class=\"ie ie6\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 7 ]>\r\n");
      out.write("<html class=\"ie ie7\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if IE 8 ]>\r\n");
      out.write("<html class=\"ie ie8\" lang=\"en\"> <![endif]-->\r\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!-->\r\n");
      out.write("<html lang=\"en\"> <!--<![endif]-->\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <h1>Welcome, this is SpringMVC Bootstrap WebApp</h1>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("      <div class=\"col-md-1\">.col-md-1</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-8\">.col-md-8</div>\r\n");
      out.write("      <div class=\"col-md-4\">.col-md-4</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-4\">.col-md-4</div>\r\n");
      out.write("      <div class=\"col-md-4\">.col-md-4</div>\r\n");
      out.write("      <div class=\"col-md-4\">.col-md-4</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-6\">.col-md-6</div>\r\n");
      out.write("      <div class=\"col-md-6\">.col-md-6</div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
}
