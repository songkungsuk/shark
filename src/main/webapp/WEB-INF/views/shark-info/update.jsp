<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>update Page</h1>
<form action="/shark-info/update" method="post">
	<input type="hidden" name="SHARK_NUM" value="${shark.SHARK_NUM}">
	<input type="text" name="SHARK_NAME" placeholder="상어이름" value="${shark.SHARK_NAME}">
	<input type="text" name="SHARK_AGE" placeholder="상어나이" value="${shark.SHARK_AGE}">
	<input type="text" name="SHARK_BIRTH" placeholder="상어생일" value="${shark.SHARK_BIRTH}">
	<input type="text" name="SHARK_LENGTH" placeholder="상어길이" value="${shark.SHARK_LENGTH}">
	<button>추가하기</button>
</form>
</body>
</html>