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

	첫 페이지 <br>
	
	<c:set var="id" value="${id }"/>
	<c:if test="${empty id }"><a href="/ELprj0908/Qz9_login">로그인 하러가기</a></c:if>
	<c:if test="${not empty id }"><a href="/ELprj0908/Qz9_logout">로그아웃</a>	</c:if>
	

</body>
</html>