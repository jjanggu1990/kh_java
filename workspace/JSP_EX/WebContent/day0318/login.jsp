<%@ page contentType="text/html; charset=utf-8"%>

<%

	String id = request.getParameter("memberId");
	if(id.equals("test")){
		response.sendRedirect("index.jsp");
	}else{
%>

<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
잘못된 아이디입니다.
</body>
</html>
<%
	}
%>