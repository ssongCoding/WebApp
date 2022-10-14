<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String num = request.getParameter("num");
	int inum = Integer.parseInt(num); // 자바
	
	if(inum >= 10) {
		out.println("<script>alert('10보다 크거나 같습니다.')</script>");
	} else {
		out.println("<script>alert('10보다 작습니다.')</script>");
	}
%>
</body>
</html>