<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	
	<form action="./memberJoin" method="post" enctype="multipart">
		ID : <input type="text" name="id"><br>
		PW : <input type="password" name="pw"><br>
		Name : <input type="text" name="name"><br>
		Email : <input type="email" name="email"><br>
		Photo : <input type="file" name="files"><br>
		<button type="submit">Join</button>
	</form>
</body>
</html>