package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.Messaging.SyncScopeHelper;

import board.LogonDBBean;
import board.LogonDataBean;

public class ConfirmIdAction implements CommandAction{
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		
		LogonDBBean dbbean = LogonDBBean.getInstance();
		
		int confirm = dbbean.confirmId(id);
			
		request.setAttribute("check", confirm);
		
		return "/logon/confirmId.jsp";
		
	}
}