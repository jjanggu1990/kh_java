package action;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.LogonDBBean;
import board.ZipcodeBean;

public class ZipcheckAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		  request.setCharacterEncoding("UTF-8");

		   String check = request.getParameter("check");//n
		   String area4 = request.getParameter("area4");//���̸�
		   LogonDBBean manager = LogonDBBean.getInstance();  
		   Vector zipcodeList = manager.zipcodeRead(area4);
		   int totalList = zipcodeList.size();
		   ZipcodeBean zipcodebean = new ZipcodeBean();
		   
		   request.setAttribute("check", check);
		   request.setAttribute("area4", area4);
		   request.setAttribute("zipcodeList", zipcodeList);
		   request.setAttribute("totalList", totalList);
		   request.setAttribute("zipcodebean", zipcodebean);
		
		return "/logon/ZipCheck.jsp";
	}
	
}
