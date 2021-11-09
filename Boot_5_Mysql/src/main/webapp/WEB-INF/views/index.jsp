<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/test.css">
</head>
<body>
	<h1>Index Page <spring:message code="hello.hi"></spring:message></h1>

	
	<c:choose>
		<c:when test="${not empty member}">
			<h3> ${member.name}님 
				<h3><spring:message code="member.info" arguments="${member.id},${member.email}" argumentSeparator=","></spring:message></h3><spring:message code="hello" var="m" text="Default Message"></spring:message>
			</h3>
		</c:when>
		<c:otherwise>
			<a href="./member/memberLogin">Login</a>
			<a href="./member/memberJoin">Join</a>
		</c:otherwise>
	</c:choose>
	<h1>${m}</h1>
	<img alt="안보임" src="./images/sample3.png">
	<img alt="front" src="./front/One+Day+at+a+Time.png">
</body>
</html>