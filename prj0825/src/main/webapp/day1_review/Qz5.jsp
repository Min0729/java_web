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
String su_=request.getParameter("su");
int su = Integer.parseInt(su_);
%>

<h2>별의개수 = <%=su %>개</h2>

<%
for(int i=0; i<su; i++){
	out.print("*");
}
%>

</body>
</html>