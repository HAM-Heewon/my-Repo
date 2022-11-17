<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
html,body {
       height: 100%;
     }
     body {
       display: flex;
       flex-direction: column;
       margin: 0;
     }
     section {
       flex: 1;
       margin: 30px 0 0 20px;
     }
     section ul li{
     list-style: none;
     list-style-position: inside;
     }
</style>

</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>


<section>
<ul><h2>판매점 관리</h2>
	<li>1.프로그램의 작성방법의 순서를 정한다.</li>
	<li>2.프로그램의 작성방법의 순서를 정한다.</li>
	<li>3.프로그램의 작성방법의 순서를 정한다.</li>
	<li>4.프로그램의 작성방법의 순서를 정한다.</li>	
</ul>
</section>

<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>