/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-05-04 10:29:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.decorator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class decorator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/F:/eclipse-jee-mars-1-win32-x86_64/java_git/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/INTERHASH/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/F:/eclipse-jee-mars-1-win32-x86_64/java_git/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/INTERHASH/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123645892000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1461320330785L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1461320330833L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      if (_jspx_meth_decorator_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>에벌레</title>\r\n");
      out.write("    <style>\r\n");
      out.write("      #jb-container {\r\n");
      out.write("        width: 1100px;\r\n");
      out.write("        margin: 0px auto;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        /* border: 1px solid #bcbcbc; */\r\n");
      out.write("      }\r\n");
      out.write("      #jb-header {\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        height: 120px;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("       /*  border: 1px solid #bcbcbc; */\r\n");
      out.write("      }\r\n");
      out.write("      #jb_search{\r\n");
      out.write("      \tmargin-top:100px;\r\n");
      out.write("      \tfloat: left;\r\n");
      out.write("      \twidth: 300px;\r\n");
      out.write("      \theight:auto;\r\n");
      out.write("      /* \tborder:1px solid #bcbcbc; */\r\n");
      out.write("      }\r\n");
      out.write("      #jb-content {\r\n");
      out.write("        width: 800px;\r\n");
      out.write("        height:auto;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("        float: right;\r\n");
      out.write("        /* border: 1px solid #bcbcbc; */\r\n");
      out.write("      }\r\n");
      out.write("      #jb-sidebar {\r\n");
      out.write("      \tposition:fixed;\r\n");
      out.write("        width: 230px;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        margin-bottom: 20px;\r\n");
      out.write("        float: left;\r\n");
      out.write("   /*      border: 1px solid #bcbcbc; */\r\n");
      out.write("      }\r\n");
      out.write("      #jb-footer {\r\n");
      out.write("        clear: both;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        /* border: 1px solid #bcbcbc; */\r\n");
      out.write("      }\r\n");
      out.write("      #jb-logo{\r\n");
      out.write("      \tfloat:left;\r\n");
      out.write("      \twidth:401px;\r\n");
      out.write("      \theight:auto;\r\n");
      out.write("      }\r\n");
      out.write("      #jb-logon{\r\n");
      out.write("      \tfloat:right;\r\n");
      out.write("      }\r\n");
      out.write("      ul {\r\n");
      out.write("      \tlist-style-type: none;\r\n");
      out.write("    \tmargin: 0;\r\n");
      out.write("    \tpadding: 0;\r\n");
      out.write("    \twidth: 230px;\r\n");
      out.write("    \tbackground-color: #f1f1f1;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tli a {\r\n");
      out.write("    \tdisplay: block;\r\n");
      out.write("    \tcolor: #000;\r\n");
      out.write("    \tpadding: 8px 0 8px 16px;\r\n");
      out.write("    \ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("/* Change the link color on hover */\r\n");
      out.write("\tli a:hover {\r\n");
      out.write("    \tbackground-color: #555;\r\n");
      out.write("\t    color: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/* ----------------------------------------------------------------------- */\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    $(function() {\r\n");
      out.write("        $(\"#conphoto\").on('change', function(){\r\n");
      out.write("             readURL(this); \r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("     function readURL(input) {\r\n");
      out.write("        if (input.files && input.files[0]) {\r\n");
      out.write("        var reader = new FileReader();\r\n");
      out.write("        \treader.onload = function (e) {\r\n");
      out.write(" \r\n");
      out.write("                 $('#blah').attr('src', e.target.result); \r\n");
      out.write("                 $('#blah').attr('height', '100px');\r\n");
      out.write("                 $('#blah').attr('width', '100px');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("          reader.readAsDataURL(input.files[0]);\r\n");
      out.write("        }\r\n");
      out.write("    } \r\n");
      out.write("    function fileUploadPreview(thisObj, preViewer) {\r\n");
      out.write("\t\t// 형식 체크\r\n");
      out.write("\t\tif (!/(\\.gif|\\.jpg|\\.jpeg|\\.png)$/i.test(thisObj.value)) {\r\n");
      out.write("\t\t\talert(\"이미지 형식의 파일을 선택하십시오\");\r\n");
      out.write("\t\t\t$(thisObj).val('');\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar preViewer = $('.preViewImg:last');//(typeof(preViewer) == \"object\") ? preViewer : document.getElementById(preViewer);\r\n");
      out.write("\t\tvar ua = window.navigator.userAgent;\r\n");
      out.write("\r\n");
      out.write("\t\t// 렌더링 버전 알아내기\r\n");
      out.write("\t\tvar rv = -1;\r\n");
      out.write("\r\n");
      out.write("\t\t// ie 브라우저이며 ie10 미만 버전\r\n");
      out.write("\t\tif (ua.indexOf(\"MSIE\") > -1 && rv < 10) {\r\n");
      out.write("\t\t\tvar img_path = \"\";\r\n");
      out.write("\t\t\tif (thisObj.value.indexOf(\"\\\\fakepath\\\\\") < 0) {\r\n");
      out.write("\t\t\t\timg_path = thisObj.value;\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tthisObj.select();\r\n");
      out.write("\t\t\t\tvar selectionRange = document.selection.createRange();\r\n");
      out.write("\t\t\t\timg_path = selectionRange.text.toString();\r\n");
      out.write("\t\t\t\tthisObj.blur();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(preViewer).css(\r\n");
      out.write("\t\t\t\t\t'filter',\r\n");
      out.write("\t\t\t\t\t\"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi\"\r\n");
      out.write("\t\t\t\t\t\t\t+ \"le://\" + img_path + \"', sizingMethod='scale')\")\r\n");
      out.write("\t\t\t\t\t.show();\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\tvar cloneHtml = $('.photo_list:last').clone();\r\n");
      out.write("\t\t\tcloneHtml.find('input').val('');\r\n");
      out.write("\t\t\tcloneHtml.find('img').removeAttr('src', 'style').hide();\r\n");
      out.write("\t\t\t$(thisObj).parents('.photoBox:first').append(cloneHtml);\r\n");
      out.write("\t\t} else { // 그외 브라우저\r\n");
      out.write("\t\t\tvar reader = new FileReader();\r\n");
      out.write("\t\t\treader.readAsDataURL(thisObj.files[0]);\r\n");
      out.write("\t\t\treader.onload = function(e) {\r\n");
      out.write("\t\t\t\t$('.preViewImg:last').attr('src', e.target.result).show();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar cloneHtml = $('.photo_list:last').clone();\r\n");
      out.write("\t\t\t\tcloneHtml.find('input').val('');\r\n");
      out.write("\t\t\t\tcloneHtml.find('img').attr('src', '').hide();\r\n");
      out.write("\t\t\t\t$(thisObj).parents('.photoBox:first').append(cloneHtml);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction tagCheck() {\r\n");
      out.write("\r\n");
      out.write("\t\turl = \"/INTERHASH/userpage/TagCheck.jsp?check=y\";\r\n");
      out.write("\t\tnewwindow=window.open(url,\"post\",\"toolbar=no ,width=650 ,height=700 ,directories=no ,status=yes ,scrollbars=no ,menubar=no\");\r\n");
      out.write("\t}\r\n");
      out.write("    </script>\r\n");
      out.write(" \r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"jb-container\">\r\n");
      out.write("      <div id=\"jb-header\">\r\n");
      out.write("      \t<div id=\"jb-logo\">\r\n");
      out.write("\t      \t<img alt=\"로고\" src=\"./userpage/logo/logo.jpg\" onclick=\"window.location.href='Board.hash'\">\r\n");
      out.write("      \t</div>\r\n");
      out.write("      \t<div id=\"jb_search\">\r\n");
      out.write("      \t\t<form method=\"post\" action=\"Board.hash\">\r\n");
      out.write("      \t\t\t<input type=\"text\" name=\"hash\"/>\r\n");
      out.write("      \t\t\t<input type=\"submit\" value=\"검색\"/>\r\n");
      out.write("      \t\t</form>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      \t<div id=\"jb-logon\">\r\n");
      out.write("      \t\t<form>\r\n");
      out.write("      \t\t\t<!-- <input type = \"text\"><br>\r\n");
      out.write("      \t\t\t<input type = \"password\"><br>\r\n");
      out.write("      \t\t\t<input type = \"button\" value=\"회원가입\"><input type=\"submit\" value=\"로그인\">\r\n");
      out.write("      \t\t\t<input type=\"button\" value=\"정보수정\" onclick=\"window.location.href='UserInfoModifyForm.hash';\"> -->\r\n");
      out.write("      \t\t\t\r\n");
      out.write("      \t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\">");
      out.print(session.getAttribute("nickName"));
      out.write("님</td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"right\"><input type=\"button\" value=\"로그아웃\" onclick=\"window.location.href='Logout.hash';\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td align=\"left\"><input type=\"button\" value=\"정보수정\"\tonclick=\"window.location.href='UserInfoModifyForm.hash';\"></td>\r\n");
      out.write("      \t\t\t</tr>\r\n");
      out.write("      \t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("      \t\t</form>\r\n");
      out.write("      \t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <div id=\"jb-content\">\r\n");
      out.write("  \r\n");
      out.write("      ");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"jb-sidebar\">\r\n");
      out.write("        <h2>해시태그</h2>\r\n");
      out.write("        <ul>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"jb-footer\">\r\n");
      out.write("        <p>Copyright</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_decorator_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:head
    com.opensymphony.module.sitemesh.taglib.decorator.HeadTag _jspx_th_decorator_005fhead_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.HeadTag) _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.HeadTag.class);
    _jspx_th_decorator_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fhead_005f0.setParent(null);
    int _jspx_eval_decorator_005fhead_005f0 = _jspx_th_decorator_005fhead_005f0.doStartTag();
    if (_jspx_th_decorator_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fhead_005fnobody.reuse(_jspx_th_decorator_005fhead_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /decorator/decorator.jsp(191,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.memId=='admin@admin.com' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("      \t\t\t<tr>\r\n");
        out.write("     \r\n");
        out.write("      \t\t\t\t<td colspan=3 align=\"right\"><input type=\"button\" value=\"관리자페이지\" onclick=\"window.location.href='ManagerPage.hash'\"></td>\r\n");
        out.write("      \t\t\t\t</tr>\r\n");
        out.write("      \t\t\t");
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

  private boolean _jspx_meth_decorator_005fbody_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fbody_005f0.setParent(null);
    int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
    if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /decorator/decorator.jsp(211,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("tagname");
    // /decorator/decorator.jsp(211,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/decorator/decorator.jsp(211,8) '${memberHash}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${memberHash}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <li><a href=\"Board.hash?hash=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write('#');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tagname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("          <!-- <li><a href='Board.hash?hash=사랑'>#사랑</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=돈\">#돈</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=컴퓨터\">#컴퓨터</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=커피\">#커피</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=책\">#책</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=반려동물\">#반려동물</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=독도\">#독도</a></li>\r\n");
          out.write("          <li><a href=\"Board.hash?hash=맥주\">#맥주</a></li> -->\r\n");
          out.write("          ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
