<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page errorPage="error/" %>
<!DOCTYPE html>
<html>
<head>
<title> 파라미터 읽기 </title>
</head>
<body>

파라미터 값은 : <%= request.getParameter("name").toUpperCase() %>

</body>
</html>