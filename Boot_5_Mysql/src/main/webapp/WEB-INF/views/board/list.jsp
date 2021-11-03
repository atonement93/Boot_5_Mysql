<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board} List page</h1>
	
	<!-- 검색 -->
	<form action="./selectList">
		<select name="kind">
			<option value="title">Title</option>
			<option value="contents">Contents</option>
			<option value="writer">Writer</option>
		</select>
		<input type="text" name="search">
		<button type="submit">Search</button>
	</form>
	
	<table>
		<tr>
			<td>Num</td><td>Title</td><td>Writer</td><td>Date</td><td>Hit</td>
			
		</tr>
		
		<c:forEach items="${boardList}" var="boardVO">
			<tr>
				<td>${boardVO.num}</td>
				<td><a href="./selectOne?num=${boardVO.num}">${boardVO.title}</a></td>
				<td>${boardVO.writer}</td>
				<td>${boardVO.regDate}</td>
				<td>${boardVO.hit}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="./insert">Write</a>
</body>
</html>