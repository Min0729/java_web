<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>커피정보 출력하기</h2>

	<c:forEach var="coffee" items="${coffee }">
		코드: ${coffee.code } <br>
		이름: ${coffee.name }<br>
		가격: ${coffee.price }<br>
		<br>
	</c:forEach>

</body>
</html>