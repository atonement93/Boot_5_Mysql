<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>
	
	<form:form modelAttribute="memberVO" enctype="multipart/form-data">
		<div>
		id <form:input path="id"/>
		<form:errors path="id"></form:errors>
		</div>
		
		<div>
		pw <form:password path="pw"/>
		<form:errors path="pw"></form:errors>
		</div>
		
		<div>
		pwCheck <form:password path="pwCheck"/>
		<form:errors path="pwCheck"></form:errors>
		</div>
		
		<div>
		name <form:input path="name"/>
		<form:errors path="name"></form:errors>
		</div>
		
		<div>
		email <form:input path="email"/>
		<form:errors path="email"></form:errors>
		</div>
		
		<div>
		age <form:input path="age"/>
		<form:errors path="age"></form:errors>
		</div>
		
		<div>
		birth <form:input path="birth"/>
		<form:errors path="birth"></form:errors>
		</div>
		
		<div>
			<button>Join</button>
		</div>
	</form:form>

</body>
</html>