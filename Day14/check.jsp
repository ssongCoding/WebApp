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
	int inum = Integer.parseInt(num); // �ڹ�
	
	if(inum >= 10) {
		out.println("<script>alert('10���� ũ�ų� �����ϴ�.')</script>");
	} else {
		out.println("<script>alert('10���� �۽��ϴ�.')</script>");
	}
%>
</body>
</html>