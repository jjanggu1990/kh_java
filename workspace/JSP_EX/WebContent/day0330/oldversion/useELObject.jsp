<%@ page contentType = "text/html; charset=euc-kr" %>
<%-- <%@ page isELIgnored="true" %> --%>
<%@ page deferredSyntaxAllowedAsLiteral="true" %>
<!-- deferredSyntaxAllowedAsLiteral="true" �� �Ӽ��� true�� �ָ� # el�� �������� ���� -->
  
<%
	request.setAttribute("name", "�ֹ���");
%> 
<html>
<head><title>EL Object</title></head>
<body>
��û URI: ${pageContext.request.requestURI} <br>
request�� name �Ӽ�: ${requestScope.name} <br>
code �Ķ����: ${param.code} 
#{10 }
</body>
</html>
