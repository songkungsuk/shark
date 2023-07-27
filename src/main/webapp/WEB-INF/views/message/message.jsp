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
	<div class="container" align="center">
		<h2 class="display-3">${msg}</h2>
		<br>
		<br>
		<button type="button" class="btn btn-success"
			onclick="location.href='${url}'">이동하기</button>
	</div>
</body>

</html>