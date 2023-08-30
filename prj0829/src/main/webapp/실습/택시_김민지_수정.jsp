<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page import="java.sql.*" %>  

<%
	String num = request.getParameter("num");	
	String time  ="";
	String date ="";
	String id =""; 
	String starting_point  ="";
	String destination  ="";
	String taxi_num  ="";

	
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
		String sql ="select regno, regtime,  to_char(regdate , 'yyyy-mm-dd'), cusno, startpoint ,  destination, taxino  from tblcall_list where regno='"+num+"'"; //5. 최종적으로 실행
		rs = st.executeQuery( sql) ;
		 //6. 가져온 쿼리 결과를 화면에 출력하기
		if( rs.next() ) {
			// out.print(rs.getString(1)); // out은 브라우저에 출력을 의미함
			//  out.print(rs.getString(2));
			// out.print(rs.getString(3)+"<br>");
			
			num=rs.getString(1);
			time=rs.getString(2);
			date=rs.getString(3);
			id=rs.getString(4);
			starting_point=rs.getString(5);
			destination=rs.getString(6);
			taxi_num=rs.getString(7);
			
			
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

  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<style>
	table{
		width: 500px;
		border: 1px solid black;
		
		margin: 0 auto;
	}
	
	td{
	border: 1px solid black;
}
 	td:nth-child(1){
        text-align: center;
    }
	form{
	width: 800px;
	height: 350px;
	background-color: lightgray;
	}
	
	p{
	 text-align: center;
	 font-size:18px;
	}

</style>

<script src="./택시_김민지.js"></script>

</head>
<body>

	<form name="frm" action="택시_김민지_수정_action.jsp" method="post">
	
		<p>택시 예약 수정</p>
		<table>
			<tr>
				<td>예약번호</td>
				<td><input type="text" name="num"  readonly="readonly"></td>
			</tr>
			<tr>
				<td>예약시간</td>
				<td><input type="text" name="time"></td>
			</tr>
			<tr>
				<td>예약날짜</td>
				<td><input type="text" name="date"></td>
			</tr>
			<tr>
				<td>고객아이디</td>
				<td><input type="text" name="id"  readonly="readonly"></td>
			</tr>
			<tr>
				<td>출발지</td>
				<td><input type="text" name="starting_point"></td>
			</tr>
			<tr>
				<td>목적지</td>
				<td><input type="text" name="destination"></td>
			</tr>
			<tr>
				<td>택시번호</td>
				<td><input type="text" name="taxi_num"  readonly="readonly"></td>
			</tr>
			<tr>
				<td>배차상태</td>
				<td>
					<select>
						<option>선택하기</option>
						<option>배차준비</option>
						<option>배차완료</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button>수정</button>
					<input type="reset">
				</td>
			</tr>

		</table>
	
	</form>
<script>
	let frm = document.frm;
	
	frm.num.value="<%= num%>";
	frm.time.value="<%= time%>";
	frm.date.value="<%= date%>";
	frm.id.value="<%= id%>";
	frm.starting_point.value="<%= starting_point%>";
	frm.destination.value="<%= destination%>";
	frm.taxi_num.value="<%= taxi_num%>";
	
</script>
</body>
</html>