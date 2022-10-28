<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>view</title>
</head>
<body>
<%
	String program = request.getParameter("program");
	String nextPage = null;
	
	if (program.equals("A")){
		nextPage = "a.jsp";
	} else if (program.equals("B")) {
		nextPage = "b.jsp";
	} else if (program.equals("C")) {
		nextPage = "c.jsp";
	} else if (program.equals("D")) {
		nextPage = "d.jsp";
	}
%>
<jsp:forward page="<%= nextPage %>"/>

</body>
</html>