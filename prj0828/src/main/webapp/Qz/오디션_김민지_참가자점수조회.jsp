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
	
		<p>참가자 점수 조회</p>
		<tr>
			<td>계좌번호</td>
			<td>참가자ID</td>
			<td>참가자이름</td>
			<td>생년월일</td>
			<td>점수</td>
			<td>등급</td>
			<td>멘토이름</td>
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
		String sql = " select s.score_no 계좌번호, j.join_id 참가자ID,j.join_nm 참가자이름, ";
		sql +=  " substr(j.birth,1,4)||'년'||substr(j.birth,5,6)||'월'||substr(j.birth,7,8)||'일' 생년월일,"; 
		sql +=   " s.score 점수,";
		sql +=  " case ";
		sql +=  "     when s.score>=90 then 'A'";
		sql +=     "  when s.score>=80 then 'B'";
		sql +=      " when s.score>=70 then 'C'";
		sql +=     " else 'D'";
		sql +=     " end as 등급,";
		sql +=  " m.mentor_nm 멘토이름";
		sql +=" from tbl_join_200 j";
		sql +=" join tbl_score_200 s";
		sql +=" on j.JOIN_ID=s.ARTISTID";
		sql +=" join tbl_mentor_200 m";
		sql +=" on s.mentorid=m.mentor_id";
		sql +=" order by s.score_no";
			   
		      
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
	<td><%= rs.getString(7) %></td>
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