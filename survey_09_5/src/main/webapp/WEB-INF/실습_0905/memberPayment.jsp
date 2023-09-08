<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ page import="실습0905.Member_payment" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>특정 고객 주문정보</h2>
	<%
	ArrayList<Member_payment> list = (ArrayList<Member_payment>) request.getAttribute("m");
	out.println(list);
	%>
	
	

</body>
</html>