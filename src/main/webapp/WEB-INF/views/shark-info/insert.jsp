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
<h1>insert_page</h1>
<form action="/shark-info/insert" method="post">
	<input type="hidden" name="SHARK_NUM" value="${shark.SHARK_NUM}">
  <div class="form-group">
    <label for="SHARK_NAME">SHARK_NAME</label>
    <input type="text" class="form-control" id="SHARK_NAME" name="SHARK_NAME" placeholder="SHARK_NAME" value="${shark.SHARK_NAME}">
  </div>
  <div class="form-group">
    <label for="SHARK_AGE">SHARK_AGE</label>
    <input type="text" class="form-control" id="SHARK_AGE" name="SHARK_AGE" placeholder="SHARK_AGE" value="${shark.SHARK_AGE}">
  </div>
  <div class="form-group">
    <label for="SHARK_BIRTH">SHARK_BIRTH</label>
    <input type="text" class="form-control" id="SHARK_BIRTH" name="SHARK_BIRTH" placeholder="SHARK_BIRTH" value="${shark.SHARK_BIRTH}">
  </div>
  <div class="form-group">
    <label for="SHARK_LENGTH">SHARK_LENGTH</label>
    <input type="text" class="form-control" id="SHARK_LENGTH" name="SHARK_LENGTH" placeholder="SHARK_LENGTH" value="${shark.SHARK_LENGTH}">
  </div>
  	<button class="btn btn-primary">상어를 수조에 넣기</button>
</form>
<h2>${shark}</h2>
</div>
</body>
</html>
			