<%@ page contentType="text/html; charset=EUC-KR" %>
<html>
<head>
<title>session</title>
</head>
<body>
<% String id = (String)session.getAttribute("MEMBERID"); %>
<% String name = (String)session.getAttribute("NAME"); %>
<p>技记俊 历厘等 蔼</p>
id ::: <%= id %><br>
name ::: <%= name %>
</body>
</html>