<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*, board.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>우편번호검색</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script>
	function dongCheck(){
		if (document.zipForm.area4.value == ""){
			alert("동이름을 입력하세요");
			document.zipForm.area4.focus();
			return;
		}
		document.zipForm.submit();
	}
	
	function sendAddress(zipcode,area1,area2,area3,area4){
		var address = area1 + " " + area2 + " " + area3 + " " + area4;
		opener.document.userinput.zipcode.value = zipcode;
		opener.document.userinput.address.value = address;
		self.close();
	}
</script>
</head>
<body bgcolor="#FFFFCC">
<center>
<b>우편번호 찾기</b>
<table>
<form name="zipForm" method="post" action="zipcheck.go">
	<tr>
		<td><br>
          	도로명 주소 입력 : <input name="area4" type="text">
			<input type="button" value="검색" onclick= "dongCheck();">
        </td>
	</tr>
		<input type="hidden" name="check" value="n">
</form>



<c:if test='${check=="n"}'>
	<c:if test='${totalList==0}'>
		<tr><td align="center"><br>검색된 결과가 없습니다.</td></tr>
	</c:if>
	<c:if test='${totalList!= 0 }'>
	
	<tr><td align="center"><br>
	※검색 후, 아래 우편번호를 클릭하면 자동으로 입력됩니다.</td></tr>
	<c:forEach var="i" items ="${zipcodeList}">
		
<%-- <%
	for (int i=0; i<totalList ;i++) {
		ZipcodeBean zipBean = 
				(ZipcodeBean)zipcodeList.elementAt(i);
		String tempZipcode =zipBean.getZipcode();
		String temptArea1 =zipBean.getArea1();
		String temptArea2 =zipBean.getArea2();
		String temptArea3 =zipBean.getArea3()==null ? "":zipBean.getArea3();
		String temptArea4 =zipBean.getArea4();
%> --%>
<tr><td>
<a href="javascript:sendAddress(
'${i.zipcode}','${i.area1}','${i.area2}',
'${i.area3}','${i.area4}')">
         ${i.zipcode}&nbsp;${i.area1}&nbsp;${i.area2}&nbsp;
${i.area3}&nbsp;${i.area4}</a><br>
</c:forEach>
</c:if>
</c:if>
</td></tr>
<tr><td align="center"><br><a href="javascript:this.close();">닫기</a><tr></td>
</table>
</center>
</body>
</html>