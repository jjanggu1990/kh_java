<%@ page contentType = "text/html; charset=euc-kr" %>
<html>
<head><title>로그인폼</title></head>
<body>

<form action="<%= request.getContextPath() %>/day0323/chap10/member/sessionLogin.jsp"
      method="post">
아이디 <input type="text" name="id" size="10">
암호 <input type="password" name="password" size="10">
<input type="submit" value="로그인">
</form>

</body>
</html>