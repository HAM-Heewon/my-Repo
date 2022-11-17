<%@page import="model.goodsmanageDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록 조회</title>
<%
	String path = request.getContextPath();
	ArrayList<goodsmanageDTO> arr = (ArrayList<goodsmanageDTO>)request.getAttribute("arr");
%>
<link rel="stylesheet" href="<%=path%>/css/pageLook.css">
</head>
<body>

<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>
<section>
<table>
<caption>상품 목록</caption>
	<thead>
		<tr>
			<td>상품코드</td>
			<td>상품명</td>
			<td>판매단가</td>
			<td>원가</td>
			<td>입고일자</td>
		</tr>
	</thead>
	
	<tbody>
		<%for(int i=0; i<arr.size(); i++)  {%>
		<tr>
			<td><a><%=arr.get(i).getG_cd()%></a></td>
			<td><%=arr.get(i).getG_nm()%></td>
			<td><%=arr.get(i).getG_price()%></td>
			<td><%=arr.get(i).getCost() %></td>
			<td><%=arr.get(i).getDate() %></td>
		</tr>
		<%} %>
		<tr><td colspan="5"><button>등록</button></td></tr>
	</tbody>
</table>
</section>
<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>