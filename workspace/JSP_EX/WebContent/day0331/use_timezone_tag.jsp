<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>timeZone �±� ���</title></head>
<body>

<c:set var="now" value="<%= new java.util.Date() %>" />

<fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" />

<br>
<fmt:timeZone value="America/Santiago">
America/Santiago<br><fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" />
</fmt:timeZone>
<br>
Asia/Tokyo<br><fmt:timeZone value="Asia/Tokyo">
<fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" />
</fmt:timeZone>
<br>
<fmt:timeZone value="Brazil/East">
Brazil/East<br><fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" />
</fmt:timeZone>
<br>
<fmt:timeZone value="Europe/Berlin">
Europe/Berlin<br><fmt:formatDate value="${now}" type="both" 
                dateStyle="full" timeStyle="full" />
</fmt:timeZone>

</body>
</html>

