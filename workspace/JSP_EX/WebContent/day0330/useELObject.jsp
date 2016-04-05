<%@ page contentType = "text/html; charset=utf-8" %>
<%
	pageContext.setAttribute("name", "page");
	request.setAttribute("name", "request");
	session.setAttribute("name", "session Lee");
%>
<html>
<head><title>EL Object</title></head>
<body>
${name} <br>   <!-- 같은 이름으로 속성이 여러 영역에 저장 되어있을 시, 작은 영역에 있는 값이 출력. 가장 작은 영역은 page -->
요청 URI: ${pageContext.request.requestURI} <br>
request의 name 속성: ${requestScope.name} <br>
code 파라미터: ${param.code}

</body>
</html>