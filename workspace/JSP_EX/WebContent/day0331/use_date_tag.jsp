<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>dateFormat�±� ���</title></head>
<body>
<c:set var="now" value="<%= new java.util.Date() %>" />
dateStyle="full" ::: <fmt:formatDate value="${now}" type="date" dateStyle="full" /> <br>
dateStyle="short" ::: <fmt:formatDate value="${now}" type="date" dateStyle="short" /> <br>
<fmt:formatDate value="${now}" type="time" /> <br>
<fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" /> <br>
<fmt:formatDate value="${now}" pattern="z a hh:mm:ss" /> <br>
</body>
</html>








