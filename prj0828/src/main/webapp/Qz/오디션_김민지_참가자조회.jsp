<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./오디션_김민지.css" rel="stylesheet"/>

</head>
<body>

<table>

	<p>참가자 조회</p>
		<tr>
			<td>참가자ID</td>
			<td>참가자이름</td>
			<td>생년월일</td>
			<td>성별</td>
			<td>실력무대</td>
			<td>매력무대</td>
		</tr>
<%
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		// 데이터베이스 연결정보
		String driver = "oracle.jdbc.driver.OracleDriver" ;
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		 //1. 오라클드라이버 로딩
		Class.forName(driver); 
		 //2. 데이터베이스 연결
		con= DriverManager.getConnection(url, user, password); 
		 //3. statement 얻어오기
		st = con.createStatement();
		 //4. 필요한 sql 작성
		String sql = " select join_id 참가자ID, join_nm 참가자이름, ";
		 sql +=" substr(birth,1,4)||'년'||substr(birth,5,6)||'월'||substr(birth,7,8)||'일' 생년월일, ";
		 sql +=" decode(gender,'M','남성','여성') 성별, ";
		 sql += " decode(specialty,'D','댄스','R','랩','V','보컬') 실력무대, ";
		 sql += " charm 매력무대";
		 sql +=" from tbl_join_200";
		      
		System.out.println(sql);
		rs=st.executeQuery(sql);
		       
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
%>
<tr>
	<td><%= rs.getString(1) %></td>
	<td><%= rs.getString(2) %></td>
	<td><%= rs.getString(3) %></td>
	<td><%= rs.getString(4) %></td>
	<td><%= rs.getString(5) %></td>
	<td><%= rs.getString(6) %></td>
</tr>
<%
		}
	
	
	}catch(Exception e){
		e.printStackTrace();
	}
	finally{ //자원의 반납
		if( rs!= null) rs.close();
		if( st != null) st.close();
		if( con != null) con.close();
	}
%>
</table>


</body>
</html>