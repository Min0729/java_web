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
String dan_=request.getParameter("dan");
int dan=Integer.parseInt(dan_);
%>

<h2><%=dan %>단</h2>
<%
for(int i=1; i<=9; i++){
	out.println(dan+"*"+i+"="+dan*i+"<br>");
}
%>

</body>
</html>