<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>view page</h1>
	<table border="1" style="text-align: center;">
		<tr>
			<td>번호</td>
			<td>상어이름</td>
			<td>상어나이</td>
			<td>상어생일</td>
			<td>상어길이</td>
			<td>상어삭제</td>
		</tr>

			<tr>
				<td>${shark.SHARK_NUM}</td>
				<td>${shark.SHARK_NAME}</td>
				<td>${shark.SHARK_AGE}</td>
				<td>${shark.SHARK_BIRTH}</td>
				<td>${shark.SHARK_LENGTH}</td>
				
				<td><form action="/shark-info/delete" method="post"><input type="hidden" name="SHARK_NUM" value="${shark.SHARK_NUM}">
				<button>상어삭제</button></form></td>
			</tr>
		<tr>
			<td colspan="6"><button onclick="location.href='/shark-info/update?sharkNum=${shark.SHARK_NUM}'">상어수정</button></td>
		</tr>
 	  	
	</table>
</body>
</html>