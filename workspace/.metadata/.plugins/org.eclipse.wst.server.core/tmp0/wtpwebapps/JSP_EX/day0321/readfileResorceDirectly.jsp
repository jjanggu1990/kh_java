<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import= "java.io.*" %>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>
<%
	FileReader fr = null;
	char[] buff = new char[512];
	int len = -1;
	
	try{
		fr = new FileReader("F:\\eclipse-jee-mars-1-win32-x86_64\\java_git\\workspace\\JSP_EX\\WebContent\\day0321\\notice\\notice.txt");
		while((len = fr.read(buff))!=-1){
			out.print(new String(buff,0,len));
			
		}
	}catch(Exception e){
		out.println("익셉션 발생: " + e.getMessage());
	}finally{
		if(fr != null) try{fr.close();}
		catch(IOException ioe){}
	}
%>

</body>
</html>