<%@ page contentType = "text/html; charset=utf-8" %>

<jsp:useBean id="member" scope="request"
        class="member.MemberInfo" />
<%
	member.setId("되나");
	member.setName("한글");
%>
<%-- <jsp:forward page="useObject.jsp" /> --%>
