<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
	width: 800px;
	border: 1px solid black;
	border-collapse: collapse;
	margin: 0 auto;
}

	td{
		border: 1px solid black;
	}
	
	button{
		width: 800px;
		display:block;
		margin: 0 auto;
	}

</style>
</head>
<body>

<table>
	<tr>
		<td>예약번호</td>
		<td>예약시간</td>
		<td>예약날짜</td>
		<td>고객아이디</td>
		<td>출발지</td>
		<td>목적지</td>
		<td>택시번호</td>
		<td>배차상태</td>
		<td>관리</td>
		
	</tr>
<%
	Connection con=null;
	Statement st = null;
	ResultSet rs = null;
	try{ 
		//데이터베이스 연결정보
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
		String sql ="select regno, regtime, to_char(regdate,'yy/mm/dd'),cusno,startpoint,destination,taxino,state";
			sql+= "	from tblcall_list"; //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		while( rs.next() ) {
%>

	<tr>
		<td> <%=rs.getString(1) %></td>
		<td> <%=rs.getString(2) %></td>
		<td> <%=rs.getString(3)%></td>
		<td> <%=rs.getString(4)%></td>
		<td> <%=rs.getString(5)%></td>
		<td> <%=rs.getString(6)%></td>
		<td> <%=rs.getString(7)%></td>
		<td> <%=rs.getString(8)%></td>
		<td> <a href="택시_김민지_수정.jsp?num=<%=rs.getString(1) %>">수정</a>/
			<a href="delete_action.jsp?num=<%=rs.getString(1) %>">삭제</a></td>
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

<form  name="frm"  action="택시_김민지_등록.jsp" method="post" >
	<button>등록</button>
</form>


</body>
</html>