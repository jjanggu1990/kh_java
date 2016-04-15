<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "board.*" %>
<%@ include file="color.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title> 회원정보수정 </title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript">
	function checkIt(){
		var userinput=eval("documnet.userinput");
		if(!userinput.passwd.value){
			alert("비밀번호를 입력하세요.");
			return false;
		}
		if(userinput.passwd.value != userinput.passwd2.value){
			alert("비밀번호를 동일하게 입력하세요.");
			return false;
		}
		if(!userinput.username.value){
			alert("사용자 이름을 입력하세요.");
			return false;
		}
		if(!userinput.jumin1.value || !userinput.jummin2.value){
			alert("주민번호를 입력하세요.");
			return false;
		}
	}
	function zipCheck(){
		url="ZipCheck.go?check=y";
    	
    	window.open(url,"post","toolbar=no ,width=500 ,height=300,directories=no,status=yes,scrollbars=yes,menubar=no");
	}
</script>
</head>
<c:catch var="ex">
<body bgcolor="<%=bodyback_c%>">
<form method="post" action="modifyPro.go" name="userinput" onsubmit="return checkIt()">

	<table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
    	<tr>
      		<td  colspan="2" height="39" bgcolor="<%=title_c%>" align="center">
     			<font size="+1" ><b>회원 정보수정</b></font>
     		</td>
    	</tr>
    	<tr>
      		<td colspan="2" class="normal" align="center">회원의 정보를 수정합니다.</td>
    	</tr>
     	<tr>
      		<td width="200" bgcolor="<%=value_c%>"><b>아이디 입력</b></td>
      		<td width="400" bgcolor="<%=value_c%>"> </td>
    	<tr> 

    	<tr>
      		<td  width="200"> 사용자 ID</td>
      		<td  width="400">${ c.id}</td>
    	</tr>
   
     <tr>
      <td width="200"> 비밀번호</td>
      <td width="400">
        <input type="password" name="passwd" size="10" maxlength="10" value="${c.passwd }">
      </td>
    <tr> 
    <tr>
      <td  width="200" bgcolor="<%=value_c%>"><b>개인정보 입력</b></td>
      <td width="400" bgcolor="<%=value_c%>"> </td>
    <tr> 
    <tr>
      <td   width="200">사용자 이름</td>
      <td  width="400">
        <input type="text" name="name" size="15" maxlength="20" value="${c.name }">
      </td>
    </tr>
    <tr>
      <td width="200">주민등록번호</td>
      <td width="400">
        ${c.jumin1 }-${c.jumin2 }
      </td>
    </tr>
   <tr>
      <td width="200">E-Mail</td>
      <td width="400">
		<c:if test="${c.email==null }">
  		<input type="text" name="email" size="40" maxlength="30" >
		</c:if>
		<c:if test="${c.email!=null }">
        <input type="text" name="email" size="40" maxlength="30" value="${c.email }">
		</c:if>
      </td>
    </tr>
    <tr>
    	<td width="200">Blog</td>
    	<td width="400">
    	<c:if test="${c.blog ==null }">
    	
  			<input type="text" name="blog" size="60" maxlength="50" >
		</c:if>
		<c:if test="${c.blog != null }">
        	<input type="text" name="blog" size="60" maxlength="50" value="${c.blog }">
		</c:if>
      	</td>
    </tr>   
	<tr> 
       	<td width="200">우편번호</td>
       	<td>
       	<c:if test="${c.zipcode==null }"> 
			<input type="text" name="zipcode" size="7" readonly>
		</c:if>
		<c:if test="${c.zipcode !=null }">
          	<input type="text" name="zipcode" size="7" readonly value="${c.zipcode }">
		</c:if>
       		<input type="button" value="우편번호찾기" onClick="zipCheck()">우편번호를 검색하세요.
		</td>
    </tr>
    <tr> 
       <td>주소</td>
       <c:if test = "${c.address == null }">
      	<td>
      	<input type="text" name="address" size="70">      주소를 적어 주세요.
      	</td>
      	</c:if>
      	<c:if test="${c.address != null }">
      	<td>
      	<input type="text" name ="address" size="70" value="${c.address }"> 
      	</td>
      	</c:if>
    </tr>  
    <tr>
      	<td colspan="2" align="center" bgcolor="<%=value_c%>">
       		<input type="submit" name="modify" value="수   정" >
       		<input type="button" value="취  소" onclick="javascript:window.location='main.go'">     
      	</td>
    </tr>
  </table>
</form>
</body>
</c:catch>
</html>
