/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2016-05-04 06:56:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.userpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TagCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Tag check</title>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkOnly(chk) {\r\n");
      out.write("\r\n");
      out.write("\t\tvar obj = document.getElementsByName(\"favorite\");\r\n");
      out.write("\r\n");
      out.write("\t\tfor (var i = 0; i < obj.length; i++) {\r\n");
      out.write("\t\t\tif (obj[i] != chk) {\r\n");
      out.write("\t\t\t\tobj[i].checked = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar checkflag = \"false\";\r\n");
      out.write("\r\n");
      out.write("\tfunction check(field) {\r\n");
      out.write("\t\tif (checkflag == \"false\") {\r\n");
      out.write("\t\t\tfor (i = 0; i < field.length; i++) {\r\n");
      out.write("\t\t\t\tfield[i].checked = true;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tcheckflag = \"true\";\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tfor (i = 0; i < field.length; i++) {\r\n");
      out.write("\t\t\t\tfield[i].checked = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tcheckflag = \"false\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction sendValue(){\r\n");
      out.write("\t\tvar a = \"asfasdf\";\r\n");
      out.write("\t\t//alert(document.tagcheck.val.value);\r\n");
      out.write("\t\t//opener.document.fo.aaaaa.value = document.tagcheck.favorite.value;\r\n");
      out.write("\t\tvar obj = document.getElementsByName(\"favorite\");\r\n");
      out.write("\r\n");
      out.write("\t\tfor (var i = 0; i < obj.length; i++) {\r\n");
      out.write("\t\t\tif (obj[i].checked == true) {\r\n");
      out.write("\t\t\t\topener.document.writeForm.tag.value = document.getElementsByName(\"favorite\")[i].value;\r\n");
      out.write("\t\t\t\tbreak;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//opener.document.fo.aaaaa.value = document.getElementsByName(\"favorite\")[0].value;\r\n");
      out.write("\t\t/* self.opener = self; */\r\n");
      out.write("\t\twindow.close();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"post\" name=\"tagcheck\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"사랑\" onClick=\"javascript:checkOnly(this);\">사랑</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"뉴스\" onClick=\"javascript:checkOnly(this);\">뉴스</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"유머\" onClick=\"javascript:checkOnly(this);\">유머</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"여행\" onClick=\"javascript:checkOnly(this);\">여행</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"영화\" onClick=\"javascript:checkOnly(this);\">영화</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"다이어트\" onClick=\"javascript:checkOnly(this);\">다이어트</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"커피\" onClick=\"javascript:checkOnly(this);\">커피</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"친구\" onClick=\"javascript:checkOnly(this);\">친구</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"악세서리\" onClick=\"javascript:checkOnly(this);\">악세서리</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"생활용품\" onClick=\"javascript:checkOnly(this);\">생활용품</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"인터넷\" onClick=\"javascript:checkOnly(this);\">인터넷</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"앱\" onClick=\"javascript:checkOnly(this);\">앱</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"IT\" onClick=\"javascript:checkOnly(this);\">IT</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"성형\" onClick=\"javascript:checkOnly(this);\">성형</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"데일리\" onClick=\"javascript:checkOnly(this);\">데일리</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"가족\" onClick=\"javascript:checkOnly(this);\">가족</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"동물\" onClick=\"javascript:checkOnly(this);\">동물</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"예술\" onClick=\"javascript:checkOnly(this);\">예술</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"패션\" onClick=\"javascript:checkOnly(this);\">패션</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"돈\" onClick=\"javascript:checkOnly(this);\">돈</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"운동\" onClick=\"javascript:checkOnly(this);\">운동</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"음악\" onClick=\"javascript:checkOnly(this);\">음악</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"카드\" onClick=\"javascript:checkOnly(this);\">카드</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"TV\" onClick=\"javascript:checkOnly(this);\">TV</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"결혼\" onClick=\"javascript:checkOnly(this);\">결혼</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"심리학\" onClick=\"javascript:checkOnly(this);\">심리학</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"요리\" onClick=\"javascript:checkOnly(this);\">요리</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"카메라\" onClick=\"javascript:checkOnly(this);\">카메라</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"맛집\" onClick=\"javascript:checkOnly(this);\">맛집</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"낮\" onClick=\"javascript:checkOnly(this);\">낮</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"자연\" onClick=\"javascript:checkOnly(this);\">자연</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"캠핑\" onClick=\"javascript:checkOnly(this);\">캠핑</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"금융\" onClick=\"javascript:checkOnly(this);\">금융</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"책\" onClick=\"javascript:checkOnly(this);\">책</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"영어\" onClick=\"javascript:checkOnly(this);\">영어</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"DIY\" onClick=\"javascript:checkOnly(this);\">DIY</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"남녀차이\" onClick=\"javascript:checkOnly(this);\">남녀차이</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"대학\" onClick=\"javascript:checkOnly(this);\">대학</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"학생\" onClick=\"javascript:checkOnly(this);\">학생</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"고등학교\" onClick=\"javascript:checkOnly(this);\">고등학교</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"피부\" onClick=\"javascript:checkOnly(this);\">피부</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"메이크업\" onClick=\"javascript:checkOnly(this);\">메이크업</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"자전거\" onClick=\"javascript:checkOnly(this);\">자전거</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"자동차\" onClick=\"javascript:checkOnly(this);\">자동차</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"웹툰\" onClick=\"javascript:checkOnly(this);\">웹툰</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"감성\" onClick=\"javascript:checkOnly(this);\">감성</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"일상\" onClick=\"javascript:checkOnly(this);\">일상</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"셀카\" onClick=\"javascript:checkOnly(this);\">셀카</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"포토샵\" onClick=\"javascript:checkOnly(this);\">포토샵</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"요가\" onClick=\"javascript:checkOnly(this);\">요가</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"가요\" onClick=\"javascript:checkOnly(this);\">가요</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"뷰티\" onClick=\"javascript:checkOnly(this);\">뷰티</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"정치\" onClick=\"javascript:checkOnly(this);\">정치</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"밤\" onClick=\"javascript:checkOnly(this);\">밤</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"창작\" onClick=\"javascript:checkOnly(this);\">창작</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"댄스\" onClick=\"javascript:checkOnly(this);\">댄스</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"해산물\" onClick=\"javascript:checkOnly(this);\">해산물</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"키즈\" onClick=\"javascript:checkOnly(this);\">키즈</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"부모\" onClick=\"javascript:checkOnly(this);\">부모</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"카페\" onClick=\"javascript:checkOnly(this);\">카페</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"모바일\" onClick=\"javascript:checkOnly(this);\">모바일</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"아이폰\" onClick=\"javascript:checkOnly(this);\">아이폰</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"안드로이드\" onClick=\"javascript:checkOnly(this);\">안드로이드</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"헤어스타일\" onClick=\"javascript:checkOnly(this);\">헤어스타일</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"미용\" onClick=\"javascript:checkOnly(this);\">미용</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"음식\" onClick=\"javascript:checkOnly(this);\">음식</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"신발\" onClick=\"javascript:checkOnly(this);\">신발</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"사진\" onClick=\"javascript:checkOnly(this);\">사진</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"술\" onClick=\"javascript:checkOnly(this);\">술</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"시계\" onClick=\"javascript:checkOnly(this);\">시계</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"가방\" onClick=\"javascript:checkOnly(this);\">가방</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"시\" onClick=\"javascript:checkOnly(this);\">시</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"미술\" onClick=\"javascript:checkOnly(this);\">미술</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"네일\" onClick=\"javascript:checkOnly(this);\">네일</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"타투\" onClick=\"javascript:checkOnly(this);\">타투</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"인터넷스타\" onClick=\"javascript:checkOnly(this);\">인터넷스타</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"축제\" onClick=\"javascript:checkOnly(this);\">축제</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"전시회\" onClick=\"javascript:checkOnly(this);\">전시회</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"클럽\" onClick=\"javascript:checkOnly(this);\">클럽</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"병원\" onClick=\"javascript:checkOnly(this);\">병원</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"건강\" onClick=\"javascript:checkOnly(this);\">건강</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"디자인\" onClick=\"javascript:checkOnly(this);\">디자인</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"과학\" onClick=\"javascript:checkOnly(this);\">과학</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"수학\" onClick=\"javascript:checkOnly(this);\">수학</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"언어\" onClick=\"javascript:checkOnly(this);\">언어</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"이름\" onClick=\"javascript:checkOnly(this);\">이름</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"문화\" onClick=\"javascript:checkOnly(this);\">문화</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"드라마\" onClick=\"javascript:checkOnly(this);\">드라마</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"인형\" onClick=\"javascript:checkOnly(this);\">인형</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"과제\" onClick=\"javascript:checkOnly(this);\">과제</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"만화\" onClick=\"javascript:checkOnly(this);\">만화</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"뮤지컬\" onClick=\"javascript:checkOnly(this);\">뮤지컬</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"해외\" onClick=\"javascript:checkOnly(this);\">해외</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"국내\" onClick=\"javascript:checkOnly(this);\">국내</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"브랜드\" onClick=\"javascript:checkOnly(this);\">브랜드</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"명품\" onClick=\"javascript:checkOnly(this);\">명품</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"음료\" onClick=\"javascript:checkOnly(this);\">음료</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"스포츠\" onClick=\"javascript:checkOnly(this);\">스포츠</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"게임\" onClick=\"javascript:checkOnly(this);\">게임</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"컴퓨터\" onClick=\"javascript:checkOnly(this);\">컴퓨터</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"베이커리\" onClick=\"javascript:checkOnly(this);\">베이커리</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"수업\" onClick=\"javascript:checkOnly(this);\">수업</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"사계절\" onClick=\"javascript:checkOnly(this);\">사계절</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"봄\" onClick=\"javascript:checkOnly(this);\">봄</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"여름\" onClick=\"javascript:checkOnly(this);\">여름</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"가을\" onClick=\"javascript:checkOnly(this);\">가을</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"겨울\" onClick=\"javascript:checkOnly(this);\">겨울</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"연예인\" onClick=\"javascript:checkOnly(this);\">연예인</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"무술\" onClick=\"javascript:checkOnly(this);\">무술</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"악기\" onClick=\"javascript:checkOnly(this);\">악기</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"감정\" onClick=\"javascript:checkOnly(this);\">감정</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"침대\" onClick=\"javascript:checkOnly(this);\">침대</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"인테리어\" onClick=\"javascript:checkOnly(this);\">인테리어</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"집\" onClick=\"javascript:checkOnly(this);\">집</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"모델\" onClick=\"javascript:checkOnly(this);\">모델</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"안경\" onClick=\"javascript:checkOnly(this);\">안경</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"가수\" onClick=\"javascript:checkOnly(this);\">가수</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"배우\" onClick=\"javascript:checkOnly(this);\">배우</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"연극\" onClick=\"javascript:checkOnly(this);\">연극</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"checkbox\" name=\"favorite\" id=\"favorite\"\r\n");
      out.write("\t\t\t\t\tvalue=\"새벽\" onClick=\"javascript:checkOnly(this);\">새벽</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t<input id=\"checkButton\" type=\"button\" name=\"Submit\" value=\"확인\" onClick=\"sendValue()\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
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
