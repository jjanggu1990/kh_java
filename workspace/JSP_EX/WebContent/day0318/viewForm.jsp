<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.*"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>

<title>뷰</title>
</head>
<body>
	<b> request.getParameter() 메서드 사용</b> name 파라미터 =
	<%=request.getParameter("name")%><br> address 파라미터 =
	<%=request.getParameter("address")%><br>
	<p />
	<b> request.getParameterValues() 메서드 사용</b>
	<br>
	<%
		String[] values = request.getParameterValues("pet");
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
	%>
	<%=values[i]%>
	<%
		}
		}
	%>
	<p />
	<b>request.getParameterNames() 메서드 사용</b>
	<br>
	<%
		Enumeration paraEnum = request.getParameterNames();
		while (paraEnum.hasMoreElements()) {
			String name = (String) paraEnum.nextElement();
	%>
	<%=name%>
	<%
		}
	%>
	<p />
	<p>
		<b>request.getParameterMap() 메서드 사용</b><br>
		<%
			Map parameterMap = request.getParameterMap();
			String[] nameParam = (String[]) parameterMap.get("name");
			if (nameParam != null) {
		%>
		name =
		<%=nameParam[0]%>
		<%
			}
		%>


		<br>
</body>
</html>