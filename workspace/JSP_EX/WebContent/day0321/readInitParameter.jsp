<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
	�ʱ�ȭ �Ķ���� ���:
	<ul>
		<%
			Enumeration initParamEnum = application.getInitParameterNames();
			while (initParamEnum.hasMoreElements()) {
				String initParamName = (String) initParamEnum.nextElement();
		%>
		<li><%=initParamName%> = <%=application.getInitParameter(initParamName)%>
			<%
				}
			%>
	</ul>
</body>
</html>