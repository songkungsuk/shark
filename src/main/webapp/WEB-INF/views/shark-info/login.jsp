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
		<form action="/shark-info/login" method="post">
			<div class="form-group">
				<label for="SHARK_NAME">SHARK_NAME</label> <input type="text"
					class="form-control" id="SHARK_NAME" name="SHARK_NAME"
					placeholder="SHARK_NAME">
			</div>
			<div class="form-group">
				<label for="SHARK_LENGTH">SHARK_LENGTH</label> <input type="text"
					class="form-control" id="SHARK_LENGTH" name="SHARK_LENGTH"
					placeholder="SHARK_LENGTH">
					
					<br>
				<button class="btn btn-primary btn-lg btn-block">물속으로 들어가기</button>
			</div>

		</form>
	</div>
</body>
</html>