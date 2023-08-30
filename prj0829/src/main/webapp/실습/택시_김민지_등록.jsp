<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

	<form name="frm" action="taxi_action.jsp" method="post" onsubmit="return check()">
	
		<p>택시 예약 등록</p>
		<table>
			<tr>
				<td>예약번호</td>
				<td><input type="text" name="num"></td>
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
				<td><input type="text" name="id"></td>
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
				<td><input type="text" name="taxi_num"></td>
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
					<button>등록</button>
					<input type="reset">
				</td>
			</tr>

		</table>
	
	</form>

</body>
</html>