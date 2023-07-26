<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>list Page</h1>
	<table border="1" style="text-align: center;">
		<tr>
			<td>번호</td>
			<td>상어이름</td>
			<td>상어나이</td>
			<td>상어생일</td>
			<td>상어길이</td>
		</tr>
		<c:forEach items="${sharkList}" var="shark">
			<tr>
				<td>${shark.SHARK_NUM}</td>
				<td><a href="/shark-info/view?SHARK_NUM=${shark.SHARK_NUM}">${shark.SHARK_NAME}</a></td>
				<td>${shark.SHARK_AGE}</td>
				<td>${shark.SHARK_BIRTH}</td>
				<td>${shark.SHARK_LENGTH}</td>
			</tr>

		</c:forEach>
		<tr>
			<td colspan="5"><button onclick="location.href='/shark-info/insert'">상어추가</button></td>
		</tr>

	</table>
</body>
</html>