<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%@ page import="model.votecheckDTO" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표자 조회</title>
<%
	String path = request.getContextPath();
	ArrayList<votecheckDTO> arr = (ArrayList<votecheckDTO>)request.getAttribute("arr");
%>
<link rel="stylesheet" href="<%=path%>/css/pageLook.css">
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>
<table>
<caption>투표자 조회</caption>
	<thead>
		<tr>
			<td>투표자이름</td>
			<td>투표자생년월일</td>
			<td>투표자나이</td>
			<td>투표자성별</td>
			<td>투표장</td>
			<td>유권자확인</td>
		</tr>
	</thead>
	
	<tbody>
		<%for(int i=0; i<arr.size(); i++)  {%>
		<tr>
			<td><%=arr.get(i).getName() %></td>
			<td><%=arr.get(i).getBirth()%></td>
			<td><%=arr.get(i).getAge() %></td>
			<td><%=arr.get(i).getGender() %></td>
			<td><%=arr.get(i).getArea() %></td>
			<td><%=arr.get(i).getCheck() %></td>
		</tr>
		<%} %>
	</tbody>
</table>
</section>



<jsp:include page="/main/mainfooter.jsp"></jsp:include>

</body>
</html>