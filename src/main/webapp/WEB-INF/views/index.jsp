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
<h1>여기는 shark index.jsp입니다.</h1>
<br>
<br>
<button type="button" class="btn btn-primary btn-lg btn-block" onclick="location.href='/shark-info/list'">상어보기</button>
<br>
<button type="button" class="btn btn-primary btn-lg btn-block" onclick="location.href='/shark-info/login'">물속으로 들어가기</button>
</div>
</body>
</html>