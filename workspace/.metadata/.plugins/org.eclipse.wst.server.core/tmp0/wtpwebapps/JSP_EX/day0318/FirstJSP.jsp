<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import = "java.util.Date" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>

<title>현재 시간</title>
</head>
<body>
<!-- 현재시간 표시 - html 주석 -->
<%-- jsp 주석 --%>
현재시간 표시 :
<% Date d = new Date(); %>
<%= d %>
</body>
</html>