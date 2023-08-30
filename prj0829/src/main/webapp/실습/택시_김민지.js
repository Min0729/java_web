function check(){

	let frm = document.frm;	
	let num = frm.num;

	let time = frm.time;
	let date = frm.date;
	let id = frm.id;
	let starting_point = frm.starting_point;
	let destination = frm.destination;
	let taxi_num = frm.taxi_num;

	
	if(num.value == ""){
		alert("예약번호를 입력하세요");
		num.focus();
		return false;
	}

	if(time.value == ""){
		alert("예약시간을 입력하세요");
		time.focus();
		return false;
	}
	
	if(date.value == ""){
		alert("예약날짜를 입력하세요");
		date.focus();
		return false;
	}
	
	if(id.value == ""){
		alert("고객아이디를 입력하세요");
		id.focus();
		return false;
	}
	
	if(starting_point.value == ""){
		alert("출발지를 입력하세요");
		starting_point.focus();
		return false;
	}
	
	if(destination.value == ""){
		alert("목적지를 입력하세요");
		destination.focus();
		return false;
	}
		
	if(taxi_num.value == ""){
		alert("택시번호를 입력하세요");
		taxi_num.focus();
		return false;
	}
	
	return true;
	
}