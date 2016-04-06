package mvc.command;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		Date date = new Date();
		request.setAttribute("date", date.toString());
		return "/mvc/date.jsp";
	}
	
}
