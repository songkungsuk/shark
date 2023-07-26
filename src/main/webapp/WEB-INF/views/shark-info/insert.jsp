<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>insert_page</h1>
<form action="/shark-info/insert" method="post">
	<input type="text" name="SHARK_NAME" placeholder="상어이름">
	<input type="text" name="SHARK_AGE" placeholder="상어나이">
	<input type="text" name="SHARK_BIRTH" placeholder="상어생일">
	<input type="text" name="SHARK_LENGTH" placeholder="상어길이">
	<button>추가하기</button>
</form>
</body>
</html>
			