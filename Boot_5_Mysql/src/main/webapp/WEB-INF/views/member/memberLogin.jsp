<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Login Page</h1>
	<form action="./memberLogin" method="post">
		Id : <input type="text" name="id"><br>
		Pw : <input type="password" name="pw"><br>
		Pwcheck : <input type="password" name="pwCheck"><br>
		<button type="submit">로그인</button>
	</form>
</body>
</html>