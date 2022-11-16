<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표자 등록</title>
<% String path = request.getContextPath(); %>
<link rel="stylesheet" href="<%=path%>/css/regPagecss.css">
<script src="<%=path%>/js/regpage.js"></script>
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>
<form action="regvote.do" method="post" name="frm">
<table>
	<caption>투표자 등록</caption>
	<tr>
		<td>투표자 주민번호</td>
		<td><input type="text" name="v_jumin"></td>
	</tr>
	<tr>
		<td>투표자 이름</td>
		<td><input type="text" name="v_name"></td>
	</tr>
	<tr>
		<td>후보자이름</td>
		<td>
			<select name="slt_name">
				<option value="">선택</option>
				<option value="1001">김후보</option>
				<option value="1002">이후보</option>
				<option value="1003">최후보</option>
				<option value="1004">박후보</option>
				<option value="1005">우후보</option>
				<option value="1006">정후보</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>투표장</td>
		<td><input type="text" name="v_area"></td>
	</tr>
	<tr>
		<td>투표시간</td>
		<td><input type="text" name="v_time"></td>
	</tr>
		<tr>
		<td>유권자 확인</td>
		<td>
		<input type="radio" name="v_confirm" value="y">확인
		<input type="radio" name="v_confirm" value="n">미확인
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<button type="button" onclick="reg_info()">저장</button>
			<button type="button" onclick="window.location.href='/HYvoteprj/regvote.do'">취소</button>
		</td>
	</tr>
</table>
</form>
</section>
<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>