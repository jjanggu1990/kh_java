<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<b>application/x-www-form-urlencoded</b>
<form action="uploadData.jsp" method="post">
이름 : <input type="text" name="name"><br>
나이 : <input type="text" name="age"><br>
파일 : <input type="file" name="report"><br>
<br>
<input type="submit" value="확인">
</form>
<p><b>multipart/form 데이터 방식</b>
<form action="uploadData.jsp" method="post" enctype="multipart/form-data">
이름 : <input type="text" name="name"><br>
나이 : <input type="text" name="age"><br>
파일 : <input type="file" name="report"><br>
<input type="submit" value="확인">
</form>
</body>
</html>




