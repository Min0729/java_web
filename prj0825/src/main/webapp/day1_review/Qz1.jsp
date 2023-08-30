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
String su1_=request.getParameter("su1");
String su2_ = request.getParameter("su2");

int su1=Integer.parseInt(su1_);
int su2=Integer.parseInt(su2_);

int sum=su1+su2;
int sub=su1-su2;
int mul=su1*su2;
int div=su1/su2;
%>

<p>더하기= <%=sum %></p>
<p>빼기= <%=sub %></p>
<p>곱하기= <%=mul %></p>
<p>나누기= <%=div %></p>

</body>
</html>