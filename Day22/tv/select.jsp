<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>select</title>
</head>
<body>
	<form action="view.jsp" method="post">
		좋아하는 프로그램을 선택하세요. <select name="program">
		<option value="A">무한도전</option>
		<option value="B">나는솔로</option>
		<option value="C">런닝맨</option>
		<option value="D">그것이알고싶다</option>
		</select> 
		<input type="submit" value="이동">
	</form>
</body>
</html>