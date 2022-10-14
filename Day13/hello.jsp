<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>hello</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	out.println(name);
%>

</body>
</html>