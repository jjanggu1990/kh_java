<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
버퍼 크기 : <%= out.getBufferSize() %><br>
남은 크기 : <%= out.getRemaining() %><br>
auto flush : <%= out.isAutoFlush() %><br>
</body>
</html>