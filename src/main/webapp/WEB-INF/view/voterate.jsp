<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%@ page import="model.voterateDTO" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>득표조회</title>
<%
	String path = request.getContextPath();
	ArrayList<voterateDTO> arr = (ArrayList<voterateDTO>)request.getAttribute("arr");
%>
<link rel="stylesheet" href="<%=path%>/css/pageLook.css">
</head>
<body>

<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>

<section>
<table>
<caption>득표조회</caption>
	<thead>
		<tr>
			<td>후보자번호</td>
			<td>후보자이름</td>
			<td>후보자득표수</td>
		</tr>
	</thead>
	
	<tbody>
	<%for(int i=0; i<arr.size(); i++) { %>
		<tr>
			<td><%= arr.get(i).getNum()%></td>
			<td><%= arr.get(i).getName()%></td>
			<td><%= arr.get(i).getAddr()%></td>
		</tr>
	<%} %>
	</tbody>
</table>
</section>

<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>