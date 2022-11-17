function reg_info(){
	
	let frm = document.frm;
	let v_jumin = frm.v_jumin;
	let v_name = frm.v_name;
	let slt_name = frm.slt_name;
	let v_area = frm.v_area;
	let v_time = frm.v_time;
	let v_confirm = frm.v_confirm;
	
	if(v_jumin.value == ""){
		alert("주민번호를 입력해주세요");
		v_jumin.focus();
	}
	
	else if(v_name.value == ""){
		alert("이름을 입력하세요");
		v_name.focus();
	}
	
	else if(slt_name.value == ""){
		alert("후보자이름을 선택하세요");
		slt_name.focus();
	}
	
	else if(v_area.value == ""){
		alert("투표장을 입력하세요");
		v_area.focus();
	}
	
	else if(v_time.value == ""){
		alert("투표시간을 입력하세요");
		v_time.focus();
	}
	else if(v_confirm.value == ""){
		alert("유권자확인란을 확인하세요");
		v_confirm.focus();
	}
	
	else{
		frm.submit();
		alert("등록 완료");
	}
}