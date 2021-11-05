<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/test.css">
</head>
<body>
	<h1>Index Page</h1>

	
	<c:choose>
		<c:when test="${not empty member}">
			<h3> ${member.name}님 환영합니다</h3>
		</c:when>
		<c:otherwise>
			<a href="./member/memberLogin">Login</a>
			<a href="./member/memberJoin">Join</a>
		</c:otherwise>
	</c:choose>
	<img alt="안보임" src="./images/sample3.png">
	<img alt="front" src="./front/One+Day+at+a+Time.png">
</body>
</html>