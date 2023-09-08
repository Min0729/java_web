<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="실습0905.TicketInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>티켓 종류</h2>
	<%
		ArrayList<TicketInfo> list = (ArrayList<TicketInfo>)request.getAttribute("list");
		out.println(list);
	%> 
	
	


</body>
</html>