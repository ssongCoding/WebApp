<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! // ���� ����(�ʵ�, Ŭ���� ����)
	int[] arr = { 10, 18, 7 };
	int result = arr[0];
	%>

	<% // �޼ҵ� �ȿ��� ���� ����, ���� ���� ����
	for (int i = 1; i < arr.length; i++) {
		if (result < arr[i]) {
			result = arr[i];
		}
	}
	
	System.out.println(result); // == <%= result
	out.println("<h2>"+ result + "</h2>");	%>

</body>
</html>



