/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-05-03 07:26:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContentInputForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<title>글쓰기</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction fileUploadPreview(thisObj, preViewer) {\r\n");
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
      out.write("\t\tnewwindow=window.open(url,\"post\",\"toolbar=no ,width=800 ,height=550 ,directories=no ,status=yes ,scrollbars=no ,menubar=no\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<!-- <script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar availableTags = [ \"가족\", \"연인\", \"동물\", \"BASIC\",\r\n");
      out.write("\t\t\t\t\"C\", \"C++\", \"Clojure\", \"COBOL\", \"ColdFusion\", \"Erlang\",\r\n");
      out.write("\t\t\t\t\"Fortran\", \"Groovy\", \"Haskell\", \"Java\", \"JavaScript\", \"Lisp\",\r\n");
      out.write("\t\t\t\t\"Perl\", \"PHP\", \"Python\", \"Ruby\", \"Scala\", \"Scheme\" ];\r\n");
      out.write("\t\t$(\"#tags\").autocomplete({\r\n");
      out.write("\t\t\tsource : availableTags\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script> -->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* CSS */\r\n");
      out.write("#textfield {\r\n");
      out.write("\twidth: 500px;\r\n");
      out.write("\theight: 80px;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#preview {\r\n");
      out.write("\theight: 80px;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#imageon {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#taglist {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit {\r\n");
      out.write("\theight: 30px;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#button {\r\n");
      out.write("\tdisplay: inline-block;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tfont: 14px/100% Arial, Helvetica, sans-serif;\r\n");
      out.write("\tpadding: .4em 2em .50em;\r\n");
      out.write("\ttext-shadow: 0 1px 1px rgba(0, 0, 0, .3);\r\n");
      out.write("\t-webkit-border-radius: .4em;\r\n");
      out.write("\t-moz-border-radius: .4em;\r\n");
      out.write("\tborder-radius: .4em;\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, .2);\r\n");
      out.write("\t-moz-box-shadow: 0 1px 1px rgba(0, 0, 0, .2);\r\n");
      out.write("\tbox-shadow: 0 1px 1px rgba(0, 0, 0, .2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".photoBox .fileData {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".photoBox .preViewImg {\r\n");
      out.write("\twidth: 80px;\r\n");
      out.write("\theight: 80px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tborder: 1px solid silver;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom_checkbox {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tmargin: 45px 0 0 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom_checkbox label {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\theight: 20px;\r\n");
      out.write("\tpadding: 4px 0 0 25px;\r\n");
      out.write("\tbackground: url('images/custom_checkbox2.png') no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom_checkbox input {\r\n");
      out.write("\ttype =\"checkbox\": checked+ label{background-position:0 -25px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"ContentInputPro.hash\" name=\"writeForm\" method=\"post\" enctype=\"multipart/form-data\"> <!-- enctype=\"multipart/form-data\" -->\r\n");
      out.write("\t\t<div id=\"wrap\" style=\"width: 500px; margin: auto;\">\r\n");
      out.write("\t\t\t<textarea id=\"textfield\" name=\"content\" placeholder=\"안녕하세요\"></textarea>\r\n");
      out.write("\t\t\t<div class=\"photoBox\">\r\n");
      out.write("\t\t\t\t<span class='photo_list'> \r\n");
      out.write("\t\t\t\t<input class='fileData' name=\"conphoto\" type=\"file\"/>  <!-- onchange=\"fileUploadPreview(this, 'preView')\" --> \r\n");
      out.write("\t\t\t\t\t<img class=\"preViewImg\" />\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"clear: both;\"></div>\r\n");
      out.write("\t\t\t<div id=\"sub\">\r\n");
      out.write("\t\t\t\t<span id=\"imageon\" style=\"width: 100px; float: left;\"> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"image.JPG\" onclick=\"$('.fileData:last').click();\" />\r\n");
      out.write("\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t<span id=\"taglist\" style=\"width: 300px; float: left;\">\r\n");
      out.write("\t\t\t\t\t<!-- <div class=\"ui-widget\">\r\n");
      out.write("  \t\t\t\t\t\t<label for=\"tags\">Tags: </label>\r\n");
      out.write("  \t\t\t\t\t\t<input id=\"tags\">\r\n");
      out.write("\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"tag\" size=\"7\" readonly>\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"Tag\" onClick=\"tagCheck()\">\r\n");
      out.write("\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t<span id=\"submit\" style=\"width: 100px; float: left;\"> \r\n");
      out.write("\t\t\t\t<input type=\"submit\" id=\"button\" value=\"submit\"/>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
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