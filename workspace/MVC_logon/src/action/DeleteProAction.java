package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.LogonDBBean;

public class DeleteProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String id = (String)request.getSession().getAttribute("memId");
		String passwd = request.getParameter("passwd");
		LogonDBBean manager = LogonDBBean.getInstance();
		int check = manager.deleteMember(id, passwd);
		
		if(check==1){
			request.setAttribute("check", check);
			request.getSession().invalidate();
		}else{
			request.setAttribute("check", 0);
		}
		return "/logon/deletePro.jsp";
	}
	
}
