<%@ page contentType = "text/html; charset=euc-kr" %>
<%-- <%@ page isELIgnored="true" %> --%>
<%@ page deferredSyntaxAllowedAsLiteral="true" %>
<!-- deferredSyntaxAllowedAsLiteral="true" 이 속성을 true로 주면 # el은 실행하지 않음 -->
  
<%
	request.setAttribute("name", "최범균");
%> 
<html>
<head><title>EL Object</title></head>
<body>
요청 URI: ${pageContext.request.requestURI} <br>
request의 name 속성: ${requestScope.name} <br>
code 파라미터: ${param.code} 
#{10 }
</body>
</html>
