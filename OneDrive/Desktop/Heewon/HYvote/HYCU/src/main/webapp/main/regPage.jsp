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
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>
<form action="" method="post" name="frm">
<table>
	<caption>상품 정보 등록</caption>
	<tr>
		<td>상품코드(자동순번)</td>
		<td><input type="text" name=""></td>
	</tr>
	<tr>
		<td>상품명</td>
		<td><input type="text" name=""></td>
	</tr>
	<tr>
		<td>단가</td>
		<td><input type="text" name=""></td>
	</tr>
	<tr>
		<td>원가</td>
		<td><input type="text" name=""></td>
	</tr>
	<tr>
		<td>입고일자(자동세팅)</td>
		<td><input type="text" name=""></td>
	</tr>
	<tr>
		<td colspan="2">
			<button type="button" >저장</button>
			<button type="button" >상품목록</button>
		</td>
	</tr>
</table>
</form>
</section>
<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>