<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%
	request.setAttribute("name", "1111");
%>
<c:set var="pageNumberStr" value="#{param.page}" />
<c:set var="pageNumber" value="1" />


<!DOCTYPE html>
<html>
<head>
<title> NewTab </title>
</head>
<body>
	<p>${pageNumberStr}</p>
	${param.page - 1}
	
</body>
</html>