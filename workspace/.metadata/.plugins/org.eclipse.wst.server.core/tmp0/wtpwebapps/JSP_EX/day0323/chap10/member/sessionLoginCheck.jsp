<%@ page contentType = "text/html; charset=euc-kr" %>
<%
    String memberId = (String)session.getAttribute("MEMBERID");
    boolean login = memberId == null ? false : true;
%>
<html>
<head><title>�α��ο��� �˻�</title></head>
<body>

<%
    if (login) {
%>
���̵� "<%= memberId %>"�� �α��� �� ����<br>
<form action="sessionLogout.jsp">
<input type="submit" value="Logout">
</form>
<%
    } else {
%>
�α������� ���� ����<br>
<form action="sessionLoginForm.jsp">
<input type="submit" value="form">
</form>
<%
    }
%>
</body>
</html>
