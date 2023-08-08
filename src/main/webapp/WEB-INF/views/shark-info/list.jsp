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
			<tbody id="content">
			</tbody>
			<tr>
				<td colspan="5"><button
						onclick="location.href='/shark-info/insert'"
						class="btn btn-primary">상어추가</button></td>
			</tr>
		</table>
	</div>
</body>
<script>
	function loaded() {
		
		const xhr = new XMLHttpRequest();
		xhr.open('GET', '/shark-info/list');
		xhr.onreadystatechange = function() {
			if(xhr.readyState == 4){
				if(xhr.status == 200){
					const obj = JSON.parse(xhr.responseText);
					let html = '';
					for(let shark of obj){ //in 은 인덱스 ///of는 객체 자체[향상된 포문이랑비슷]
						html += '<tr>';
						html += '<td>' + shark.sharkNum + '</td>';
						html += '<td>' + shark.sharkName + '</td>';
						html += '<td>' + shark.sharkAge + '</td>';
						html += '<td>' + shark.sharkBirth + '</td>';
						html += '<td>' + shark.sharkLength + '</td>';
						html += '</tr>';
						console.log(shark);
					}
					document.querySelector('#content').innerHTML = html;
				}
			}
			
		}
		xhr.send();
		
	}
	
	window.addEventListener('load', loaded);
</script>
</html>