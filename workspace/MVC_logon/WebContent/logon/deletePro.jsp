<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="board.LogonDBBean" %>
<%@ include file="color.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title> 회원탈퇴 </title>
<link href="style.css" rel="styelsheet" type="text/css">
</head>
<%-- <%
	String id = (String)session.getAttribute("memId");
	String passwd = request.getParameter("passwd");
	LogonDBBean manager = LogonDBBean.getInstance();
	int check = manager.deleteMember(id, passwd);
	if(check==1){
		session.invalidate();
	%> --%>
	<c:if test="${check==1 }">
<body bgcolor="<%=bodyback_c%>">
<form method="post" action="main.go" name="userinput" >
<table width="270" border="0" cellspacing="0" cellpadding="5" align="center">
	<tr bgcolor="<%=title_c%>">
		<td height="39" align="center">
		<font size="+1" ><b>회원정보가 삭제되었습니다.</b></font>
		</td>
	</tr>
	<tr bgcolor="<%=value_c%>">
    	<td align="center">
      	<p>안녕히 가세요.</p>
      	<meta http-equiv="Refresh" content="5; url=main.go" >
    	</td>
  	</tr>
  	<tr bgcolor="<%=value_c%>">
    	<td align="center">
      	<input type="submit" value="확인">
   		</td>
  	</tr>
</table>
</form>
</c:if>
<c:if test="${check!=1 }">
<script>
  alert("비밀번호가 맞지 않습니다.");
      history.go(-1);
</script>
</c:if>
</body>
</html>