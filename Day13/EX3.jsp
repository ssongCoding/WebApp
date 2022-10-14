<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! // 전역 변수(필드, 클래스 변수)
	int[] arr = { 10, 18, 7 };
	int result = arr[0];
	%>

	<% // 메소드 안에서 쓰던 로직, 지역 변수 선언
	for (int i = 1; i < arr.length; i++) {
		if (result < arr[i]) {
			result = arr[i];
		}
	}
	
	System.out.println(result); // == <%= result
	out.println("<h2>"+ result + "</h2>");	%>

</body>
</html>



