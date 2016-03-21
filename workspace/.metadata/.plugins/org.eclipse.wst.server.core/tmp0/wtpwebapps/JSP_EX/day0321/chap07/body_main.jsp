<%@ page contentType = "text/html; charset=utf-8" %>
<%
	request.setCharacterEncoding("euc-kr");
%>
<html>
<head><title>INFO</title></head>
<body>

include 전 name 파라미터 값: <%= request.getParameter("name") %>

<% request.setAttribute("attr", "new attr"); %>

<hr>

<jsp:include page="body_sub.jsp" flush="false">
	<jsp:param name="name" value="kosmo" />
</jsp:include>

<hr/>

<%
	String[] names = request.getParameterValues("name");
	for(String a:names){
		out.println(a);
	}
%>
include 후 name 파라미터 값: <%= request.getParameter("name") %>

</body>
</html>
