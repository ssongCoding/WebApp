<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="c" class="section4.Computer"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<% // 스크립트릿
	// Computer c = new Computer(); // jsp 액션 태그 객체 생성
	out.println(c.turnOn());
%>

</body>
</html>