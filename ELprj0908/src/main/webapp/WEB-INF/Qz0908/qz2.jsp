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

	<h2>안녕하세요 5번 출력</h2>
	<c:set var="hi" value="안녕하세요"/>
	<c:forEach var="i" begin="1" end="5">
		${hi }
	</c:forEach>

</body>
</html>