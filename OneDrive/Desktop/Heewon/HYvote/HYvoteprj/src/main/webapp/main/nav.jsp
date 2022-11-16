<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String path = request.getContextPath(); %>
<link rel="stylesheet" href="<%=path%>/css/nav.css">
</head>
<body>
<div id="body-wrapper">
		<div id="body-content">
			<div class="dropmenu">
			    <ul class="aa">
			        <li class="bb">
			            <div class="item"><a href="/HYvoteprj/candi.do">후보자조회</a>
			            </div> 
			        </li>
			        <li class="bb">
			            <div class="item"><a href="/HYvoteprj/regvote.do">투표등록</a>
			            </div>
			        </li>
			    	<li class="bb">
			            <div class="item"><a href="/HYvoteprj/votech.do">투표자조회</a>
			            </div>
			        </li>
			       	<li class="bb">
			            <div class="item"><a href="/HYvoteprj/voterate.do">득표조회</a>
			            </div>
			        </li>
			       	<li class="bb">
			            <div class="item"><a href="index.jsp">홈으로</a>
			            </div>
			        </li>
			    </ul>
			</div>
		</div>
	</div>
</body>
</html>