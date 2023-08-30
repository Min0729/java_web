<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String[] message = {"화이팅", "파이팅", "힘내", "Fighting"};
int index = (int)(Math.random()*4);
%>

<p>랜덤 응원문구: <%=message[index] %></p>

</body>
</html>