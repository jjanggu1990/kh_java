<%@page import="com.sun.xml.internal.txw2.Document"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "board.BoardDBBean"%>
<%@ page import = "board.BoardDataBean" %>
<%@ page import = "java.util.*" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file=  "color.jsp" %>
<%
	int pageSize=10;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<%
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum = "1";
	}
	int currentPage = Integer.parseInt(pageNum);
	//System.out.println(currentPage); 
	int startRow = (currentPage * pageSize) -(pageSize-1);
	int endRow = currentPage * pageSize;
	int count = 0;
	int number =0;
	String select = null;
	String search = null;
	try{
		select = request.getParameter("select");
		search = request.getParameter("search");
	}catch(Exception e){
	}
	ArrayList <BoardDataBean> articleList = null;
	BoardDBBean dbPro = BoardDBBean.getInstance();
	try{
	if(select == null || select.equals("")){
		count = dbPro.getArticleCount();
	}else{
		count=dbPro.getsearchArticleCount(select,search); 
		System.out.println("count:::"+count);
	}
	}catch(Exception e){
		e.printStackTrace();
	}
	if(count>0){
 		if(select == null || select.equals("")){
			articleList = dbPro.getArticles(startRow, endRow);
		}
		else{
			articleList = dbPro.getArticles(startRow, endRow, select, search); 
			System.out.println("articleList:::"+startRow+", "+endRow);
		}
		
		/* if(select != null){
			
			articleList = dbPro.getArticles(select, search);
		}
		else{
			articleList = dbPro.getArticles(startRow, endRow);
		} */
	}
	number = count - (currentPage - 1) * pageSize;
	
%>
<!DOCTYPE html>
<html>
<head>
<title> 게시판 </title>
<link href = "style.css" rel="stylesheet" type = "text/css">
</head>
<body bgcolor = "<%=bodyback_c%>">
<center><b>글목록(전체 글: <%=count %>)</b>

<table width="700">
	<tr>
		<td align="right" bgcolor="<%=value_c %>">
		<a href = "writeForm.jsp">글쓰기</a>
		</td>
	</tr>
</table>

<%
	if(count ==0){
%>
<table width = "700" border = "1" cellpadding="0" cellspacing="0">
	<tr>
		<td align="center">
			게시판에 저장 된 글이 없습니다.
		</td>
	</tr>
</table>
<% } else { %>
<table border = "1" width = "700" cellpadding="0" cellspacing="0" align="center">
	<tr height="30" bgcolor="<%=value_c%>">
		<td align="center" width = "50" > 번  호</td>
		<td align="center" width="250" > 제     목</td>
		<td align ="center" width = "100" > 작성자</td>
		<td align="center"  width="150" >작성일</td>
		<td align="center" width = "50"> 조   회</td>
		<td align="center" width="100">IP</td>
	</tr>
<%
	out.print(articleList.size());
	for(int i =0; i< articleList.size();i++){
		BoardDataBean article= (BoardDataBean)articleList.get(i);
%>
	<tr height="30">
		<td align="center" width = "50"> <%=number-- %>
		</td>
		<td width="250">
<%
	int wid=0;
	if(article.getRe_level()>0){ //답변 글인가?
		wid=5*(article.getRe_level());
%>
<img src = "../images/level.gif" width="<%=wid %>" height="16">
<img src = "../images/re.gif">
<%} else { %>
<img src = "../images/level.gif" width = "<%=wid %>" height="16">
<%} %>
<a href = "content.jsp?num=<%=article.getNum() %>&pageNum=<%=currentPage %>">
	<%=article.getSubject() %></a>
	<%if(article.getReadcount()>=20){ %>
<img src="../images/hot.gif" border="0"  height="16"><%}%> </td>
    	<td align="center"  width="100">
       		<a href="mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a></td>
    	<td align="center"  width="150"><%= sdf.format(article.getReg_date())%></td>
    	<td align="center"  width="50"><%=article.getReadcount()%></td>
    	<td align="center" width="100" ><%=article.getIp()%></td>
	</tr>
     <%}%>
</table>
<%}%>

<%
    if (count > 0) {
    //전체 페이지의 수를 연산
        int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);

		int pageBlock=10;
        int startPage = (int)(currentPage/pageBlock)*pageBlock+1;
        int endPage = startPage + pageBlock-1;
        if (endPage > pageCount) endPage = pageCount;

 if(search != null && select!=null){       
    if (startPage > 5) {    %>
    <a href="list.jsp?pageNum=<%= startPage - 5 %>&search=<%=search%>&select=<%=select%>">[이전]</a>
<%      }
    for (int i = startPage ; i <= endPage ; i++) {  %>
    <a href="list.jsp?pageNum=<%= i %>&search=<%=search%>&select=<%=select%>">[<%= i %>]</a>
<%
    }
    if (endPage < pageCount) {  %>
    <a href="list.jsp?pageNum=<%= startPage + 5 %>&search=<%=search%>&select=<%=select%>">[다음]</a>
<%
    }
}else{
        if (startPage > 5) {    %>
        <a href="list.jsp?pageNum=<%= startPage - 5 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="list.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?pageNum=<%= startPage + 5 %>">[다음]</a>
<%}
        }
    }
%>

<form>
	<select action="list.jsp" name = "select" >
		<option name = "select_1" value="subject">제목</option>
		<option name = "select_2"  value="writer">작성자</option>
	</select>
	<input type="text" name = "search">
	<input type="submit" value="검색" onclick="">
</form>
</center>
</body>
</html>