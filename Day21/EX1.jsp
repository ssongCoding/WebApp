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

<% // ��ũ��Ʈ��
	// Computer c = new Computer(); // jsp �׼� �±� ��ü ����
	out.println(c.turnOn());
%>

</body>
</html>