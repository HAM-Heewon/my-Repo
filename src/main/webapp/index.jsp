<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>HY 투표관리</title>
<style type="text/css">
 html,
      body {
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
</style>
</head>
<body>
<jsp:include page="/main/header.jsp"></jsp:include>
<jsp:include page="/main/nav.jsp"></jsp:include>

<section>
<h2>투표관리 프로그램</h2>
<P>투표관리하기 위한 프로그램이다.</P>

</section>
<jsp:include page="/main/mainfooter.jsp"></jsp:include>
</body>
</html>