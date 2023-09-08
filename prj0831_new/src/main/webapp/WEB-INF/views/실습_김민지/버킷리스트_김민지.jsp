<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background-color: #ffe9f4;
	}

	.wrap{
		width: 400px;
		height: 500px;
		line-height: 40px;
		border: 3px solid #d598a3;
		border-radius: 10px;
		margin: 200px auto;
		text-align: center;
		background-color: white;
	}
	h2{
		background-color: #d9e8e6;
	}
	
	.cnblue{
		width: 350px;
		height:200px;
		position: absolute;
		bottom: 100px;
		left: 100px;
	}
	
	.lucy{
		width: 350px;
		height: 200px;
		position: absolute;
		bottom:300px;
		left:300px;
	}
	
	.omg{
		width: 350px;
		height: 200px;
		position: absolute;
		bottom:70px;
		left:500px;
	}
	
</style>
</head>
<body>

	<div class="wrap">
		<h2>김민지 버킷리스트</h2>
		<%
			ArrayList<String> list = (ArrayList<String>) request.getAttribute("list");
			
			for(String item : list){
				out.println(item + "<br>");
			}
		%>

		<img class="cnblue" src="https://entertainimg.kbsmedia.co.kr/cms/uploads/BBSIMAGE_20211023065414_958194e30c81b317578ed141abd6bd11.png">
	
		<img class="lucy" src="https://img.sportsworldi.com/content/image/2021/06/21/20210621513782.jpg">
	
		<img class="omg" src="https://image.news1.kr/system/photos/2023/7/24/6120509/article.jpg/dims/quality/80/optimize">
	</div>

</body>
</html>