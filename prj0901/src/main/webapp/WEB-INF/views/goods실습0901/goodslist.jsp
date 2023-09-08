<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="실습0901.Goods" %>

<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		
	ArrayList<Goods>  list = (ArrayList<Goods> ) request.getAttribute("list");
		
	%>

	<h2>상품 목록 조회</h2>
	
	<%
	for( Goods g: list){
		out.println(g.getId());
		out.println(g.getName());
		out.println(g.getPrice() + "<br>");
	}
	
	%>
	 

</body>
</html>