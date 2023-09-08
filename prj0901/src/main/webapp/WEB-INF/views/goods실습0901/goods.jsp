<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="실습0901.Goods" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		Goods g = (Goods)request.getAttribute("g");
	%>
	<h2>해당 상품정보</h2>
	
	<%= g %>
	

</body>
</html>