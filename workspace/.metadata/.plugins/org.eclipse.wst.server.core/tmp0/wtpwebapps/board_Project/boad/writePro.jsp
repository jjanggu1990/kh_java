<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "board.BoardDBBean"%>
<%@ page import = "java.sql.*" %>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id = "article" scope="request" class="board.BoardDataBean">
	<jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
	article.setReg_date(new Timestamp(System.currentTimeMillis()));
	article.setIp(request.getRemoteAddr());
	
	BoardDBBean dbPro = BoardDBBean.getInstance();
	dbPro.insertArticle(article);
	
	response.sendRedirect("list.jsp");
%>
<!DOCTYPE html>
<html>
<head>
<title> NewTab </title>
</head>
<body>

</body>
</html>