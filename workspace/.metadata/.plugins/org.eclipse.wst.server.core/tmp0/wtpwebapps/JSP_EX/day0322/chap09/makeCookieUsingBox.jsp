<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "util.CookieBox" %>

<%
    response.addCookie(CookieBox.createCookie("name", "makeCookieUsingBox"));
    response.addCookie(
        CookieBox.createCookie("id", "madvirus", "/", -1));
%>
<html>
<head><title>CookieBox사용예</title></head>
<body>

CookieBox를 사용하여 쿠키 생성

</body>
</html>
