package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.LogonDBBean;
import board.LogonDataBean;

public class ModifyFormAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		String id = (String)request.getSession().getAttribute("memId");
		LogonDBBean manager = LogonDBBean.getInstance();
		LogonDataBean c = manager.getMember(id);
		
		request.setAttribute("c", c);
		
		return "/logon/modifyForm.jsp";
	}
	
}
