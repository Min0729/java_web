<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import="java.util.ArrayList"%>
<%@ page import="실습0831.Movies_김민지" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>영화 정보</h2>
	<%
		ArrayList<Movies_김민지> list =(ArrayList<Movies_김민지>) request.getAttribute("list");
		
		for(Movies_김민지 m : list){
			out.println(m+"<br>");
			out.println("영화제목: "+m.getName()+"<br>");
			out.println("영화장르: "+m.getGenre()+"<br>");
			out.println("상영시간: "+m.getRunning_time()+"분<br>");
			out.println("영화감독: "+m.getDirector()+"<br>");
		}
	
	%>

</body>
</html>