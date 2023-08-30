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
String[] img= {
		"https://item.kakaocdn.net/do/5c0c5b2d25725421eacddb609d5f35c015b3f4e3c2033bfd702a321ec6eda72c",
		"https://item.kakaocdn.net/do/5c0c5b2d25725421eacddb609d5f35c0a88f7b2cbb72be0bdfff91ad65b168ab",
		"https://ugc.production.linktr.ee/l3Vdw9mUTImHcXbnlgma_K1zS1De1y1YmXZN0",
		"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGeoircBWC9N-RL29IoSDjG-GPdhvvUE08dg&usqp=CAU"
};

int index = (int)(Math.random()*4);
%>

<h2>랜덤 이미지</h2>

<img src="<%=img[index] %>">

</body>
</html>