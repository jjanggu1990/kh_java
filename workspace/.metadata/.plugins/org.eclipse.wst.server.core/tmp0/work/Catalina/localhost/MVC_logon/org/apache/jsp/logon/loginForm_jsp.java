/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-04-11 07:31:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.logon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/logon/color.jsp", Long.valueOf(1460348228000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

String bodyback_c="#e0ffff";
String back_c="#8fbc8f";
String title_c="#5f9ea0";
String value_c="#b0e0e6";
String bar="#778899";

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title> 로그인 </title>\n");
      out.write("<link href = \"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t<script language=\"javascript\">\n");
      out.write("\t\tfunction begin(){\n");
      out.write("\t\t\tdocument.myform.id.focus();\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction checkIt(){\n");
      out.write("\t\t\tif(!documnet.myform.id.value){\n");
      out.write("\t\t\t\talert(\"이름을 입력하지 않으셨습니다.\");\n");
      out.write("\t\t\t\tdocumnet.myform.id.focus();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tif(!documnet.myform.passwd.value){\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력하지 않으셨습니다.\");\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"begin()\" bgcolor=\"");
      out.print( bodyback_c );
      out.write("\">\n");
      out.write("<form name=\"myform\" action=\"loginPro.go\" method=\"post\" onSubmit=\"return checkIt()\">\n");
      out.write("\t<table cellSpacing=1 cellPadding=1 width=\"260\" border=1 align=\"center\">\n");
      out.write("\t\t<tr height=\"30\">\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"middle\" bgcolor=\"");
      out.print(title_c );
      out.write("\">\n");
      out.write("\t\t\t\t<strong>회원로그인</strong>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr height=\"30\">\n");
      out.write("\t\t\t<td width=\"110\" bgcolor=\"");
      out.print(title_c);
      out.write("\" align=center>아이디</td>\n");
      out.write("\t\t\t<td width=\"150\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=center>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"id\" size=\"15\" maxlength=\"12\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr hetigh=\"30\">\n");
      out.write("\t\t\t<td width =\"110\" bgcolor=\"");
      out.print(title_c );
      out.write("\" align=center>비밀번호</td>\n");
      out.write("\t\t\t<td width=\"150\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=center>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"passwd\" size=\"15\" maxlength=\"12\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr height=\"30\">\n");
      out.write("\t\t\t<td colspan=\"2\" align=\"middle\" bgcolor=\"");
      out.print(title_c );
      out.write("\" >\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"로그인\">\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"다시입력\">\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"회원가입\" onclick=\"javascript:window.location='inputForm.go'\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\t\n");
      out.write("\t</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
