<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="board.LogonDBBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <% request.setCharacterEncoding("UTF-8"); %>
<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	LogonDBBean manager = LogonDBBean.getInstance();
	int check = manager.userCheck(id, passwd);
	
	if(check==1){
		session.setAttribute("memId", id);
		response.sendRedirect("main.go");
	}else if(check==0){ %>
<script>
	alert("비밀번호가 맞지 않습니다.");
	history.go(-1);
</script>
	<% } else {%>
<script>
	alert("아이디가 맞지 않습니다.");
	history.go(-1);
</script>
	<%} %>
	 --%>
	 
<c:if test="${memId !=null}">
<% response.sendRedirect("main.go"); %>
</c:if>
<c:if test="${check==0}">
<script>
	alert("비밀번호가 맞지 않습니다.");
	history.go(-1);
</script>

</c:if>
<c:if test="${(check !=0)&&(memId==null)}">
<script>
	alert("아이디가 맞지 않습니다.");
	history.go(-1);
</script>

</c:if>

<!DOCTYPE html>
<html>
<head>
<title> NewTab </title>
</head>
<body>

</body>
</html>