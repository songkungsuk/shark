<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/header.jsp" />
</head>
<body>
	<div class="container">
		<h1>view page</h1>
		<table class="table" style="text-align: center;">
			<thead class="thead-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">상어이름</th>
					<th scope="col">상어나이</th>
					<th scope="col">상어생일</th>
					<th scope="col">상어길이</th>
					<th scope="col">상어삭제</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${shark.SHARK_NUM}</td>
					<td>${shark.SHARK_NAME}</td>
					<td>${shark.SHARK_AGE}</td>
					<td>${shark.SHARK_BIRTH}</td>
					<td>${shark.SHARK_LENGTH}</td>
					<td>
						<form action="/shark-info/delete" method="post">
							<input type="hidden" name="SHARK_NUM" value="${shark.SHARK_NUM}">
							<button class="btn btn-primary">상어삭제</button>
						</form>
					</td>
				</tr>
				<tr>
					<td colspan="7" align="center"><button class="btn btn-primary"
							onclick="location.href='/shark-info/update?sharkNum=${shark.SHARK_NUM}'">상어수정</button></td>
				</tr>
			</tbody>
		</table>
		<h2>${shark}</h2>
	</div>
</body>
</html>