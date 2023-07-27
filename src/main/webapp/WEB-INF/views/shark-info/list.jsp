<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/WEB-INF/views/common/header.jsp" />
</head>
<body>
	
	<div class="container">
	<h1>list Page</h1>
	<table class="table" style="text-align: center;">
		<thead class="thead-dark">
			<tr>
				<th scope="col">#</th>
				<th scope="col">상어이름</th>
				<th scope="col">상어나이</th>
				<th scope="col">상어생일</th>
				<th scope="col">상어길이</th>
			</tr>
		</thead>
		<tbody>
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
				<td colspan="5"><button
						onclick="location.href='/shark-info/insert'"
						class="btn btn-primary">상어추가</button></td>
			</tr>
		</tbody>
	</table>
	<h2>${shark}</h2>
	</div>
</body>
</html>