<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="pds.service.GetPdsItemService"%>
<%@ page import="pds.service.RemovePdsItemService" %>
<%@ page import="pds.file.FileRemoveHelper" %>
<%@ page import="pds.model.PdsItem" %>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	PdsItem item = GetPdsItemService.getInstance().getPdsItem(id);
	RemovePdsItemService.getInstance().remove(item);
	FileRemoveHelper.removeFile(item.getRealPath());
%>
<jsp:forward page = "list.jsp"/>
<%-- <a><%=item.getFileName() %></a> --%>