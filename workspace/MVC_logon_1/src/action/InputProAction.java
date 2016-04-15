package action;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.LogonDBBean;
import board.LogonDataBean;

public class InputProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
	
		request.setCharacterEncoding("utf-8");
		
		LogonDataBean member = new LogonDataBean();
		
		
		member.setId(request.getParameter("id"));
		member.setPasswd(request.getParameter("passwd"));
		member.setName(request.getParameter("name"));
		member.setJumin1(request.getParameter("jumin1"));
		member.setJumin2(request.getParameter("jumin2"));
		member.setEmail(request.getParameter("email"));
		member.setBlog(request.getParameter("blog"));
		member.setZipcode(request.getParameter("zipcode"));
		member.setAddress(request.getParameter("address"));
		member.setReg_date(new Timestamp(System.currentTimeMillis()));
		
	    LogonDBBean manager = LogonDBBean.getInstance();
	    manager.insertMember(member);
	    request.setAttribute("member", member);
		
		
		return "/logon/loginForm.jsp";
	}

}
