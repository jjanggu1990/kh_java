<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
function empty(){
	if (document.form.file.value == ""  ) {
		alert("파일을 선택하시오");
		return false;
	}
}
</script>
<title> 파일 등록 </title>
</head>
<body>
<form name ="form" action="upload.jsp" method="post" enctype="multipart/form-data" onsubmit="return empty()">
파일 : <input type="file" name="file" /><br>
설명 : <input type="text" name="description"/><br>
<input type="submit" value="업로드" />
</form>
</body>
</html>