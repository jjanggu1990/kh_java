package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDBBean;

public class SearchProAction implements CommandAction {//�� �Է� �� ó��

    public String requestPro(HttpServletRequest request, HttpServletResponse response)throws Throwable {
    	String select = request.getParameter("select");
    	String search_val=request.getParameter("search_val");
    	int record_cnt = -1;
    	BoardDBBean dbbean = null;
    	ArrayList arrlist = null;
    	System.out.println("select : "+select);
    	System.out.println("search_val : "+search_val);
/*
    	BoardDataBean data= new BoardDataBean();
    	if(select.equals("subject")){
    		data.setSubject(select);
    		data.setSearch_val(search_val);
    	}else if(select.equals("writer")){
    		data.setSubject(select);
    		data.setSearch_val(search_val);
    	}else if(select.equals("content")){
    		data.setSubject(select);
    		data.setSearch_val(search_val);
    	}
    	
*/    	
    	try{
    		dbbean = BoardDBBean.getInstance();
    		record_cnt = dbbean.getsearchArticleCount(select, search_val);
    		arrlist = dbbean.getArticles(0, 1, select, search_val);
    	}catch(Exception e){e.printStackTrace();}

    	return "/MVC/list.jsp";//
    }
}