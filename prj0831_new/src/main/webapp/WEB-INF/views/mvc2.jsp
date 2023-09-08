<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	mvc2 view
	
	<%
		String result = (String)request.getAttribute("r");	// String오로 다운캐스팅
		out.println(result);
	%>

</body>
</html>