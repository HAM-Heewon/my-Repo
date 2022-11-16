<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%@ page import="model.candidateDTO" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후보자 조회</title>
<%
	String path = request.getContextPath();
	ArrayList<candidateDTO> arr = (ArrayList<candidateDTO>)request.getAttribute("arr");
%>
<link rel="stylesheet" href="<%=path%>/css/pageLook.css">
</head>
<body>

<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>
<table>
<caption>후보자 조회</caption>
	<thead>
		<tr>
			<td>후보자번호</td>
			<td>후보이름</td>
			<td>후보자주민번호</td>
			<td>후보자학위</td>
			<td>당번호</td>
			<td>당전화번호</td>
		</tr>
	</thead>
	
	<tbody>
		<%for(int i=0; i<arr.size(); i++)  {%>
		<tr>
			<td><%=arr.get(i).getNum()%></td>
			<td><%=arr.get(i).getName()%></td>
			<td><%=arr.get(i).getJm()%></td>
			<td><%=arr.get(i).getGrade() %></td>
			<td><%=arr.get(i).getP_num() %></td>
			<td><%=arr.get(i).getP_call() %></td>
		</tr>
		<%} %>
	</tbody>
</table>
</section>
<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>