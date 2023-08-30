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
String su_ = request.getParameter("su");
int su = Integer.parseInt(su_);
%>

<span><%=su %>의 약수는 </span>

<strong>
	<% 
	for(int i=1; i<=su; i++){
		if(su%i==0){
			out.println(i);
		}
	}
	%>
</strong>
<span>입니다</span>


</body>
</html>