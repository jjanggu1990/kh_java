<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "util.CookieBox" %>

<%
    response.addCookie(CookieBox.createCookie("name", "makeCookieUsingBox"));
    response.addCookie(
        CookieBox.createCookie("id", "madvirus", "/", -1));
%>
<html>
<head><title>CookieBox��뿹</title></head>
<body>

CookieBox�� ����Ͽ� ��Ű ����

</body>
</html>
