<%@ page contentType = "text/html; charset=euc-kr" %>
<%
    String memberId = (String)session.getAttribute("MEMBERID");
    boolean login = memberId == null ? false : true;
%>
<html>
<head><title>로그인여부 검사</title></head>
<body>

<%
    if (login) {
%>
아이디 "<%= memberId %>"로 로그인 한 상태<br>
<form action="sessionLogout.jsp">
<input type="submit" value="Logout">
</form>
<%
    } else {
%>
로그인하지 않은 상태<br>
<form action="sessionLoginForm.jsp">
<input type="submit" value="form">
</form>
<%
    }
%>
</body>
</html>
