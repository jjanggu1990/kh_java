<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<%
	HttpServletRequest httpRequest= (HttpServletRequest)pageContext.getRequest();
%>
request 기본 객체와 pageContext.getRequest()의 동일여부:
<%= request == httpRequest %>
<br>

pageContext.getOut() 메서드를 이용한 데이터 출력:

<% pageContext.getOut().println("안녕하세요"); %><br>

</body>
</html>