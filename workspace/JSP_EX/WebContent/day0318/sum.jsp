<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="EX.*" %>
<%-- <%!
public int multiply(int a, int b) {
	int c = a * b;
	return c;
}
%> --%>
<!DOCTYPE html>
<html>
<head>

<title> 합 구하기 </title>
</head>
<body>
<%
	int sum = 0;
	for(int i = 1; i<=10; i++){
		sum += i;
	}
%>
1 부터 10까지의 합은 <%= sum %> 입니다.
<br>
<%
	int sum2= 0;
	for (int i = 11; i<=20; i++){
		sum2 += i;
	}
%>
11부터 20까지의 합은 <%= sum2 %> 입니다.

<br>
<%= 1+2+3+4+5+6+7+8+9+10%>
<br>
<%= "1"+2+3+4+5+6+7+8+9+10%>



<br>
<% MultiplyEx m = new MultiplyEx(); %>
10 * 25 =<%=m.multiply(10,25)%>
<br>


</body>
</html>