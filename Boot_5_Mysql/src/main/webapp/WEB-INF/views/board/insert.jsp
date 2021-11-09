<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootStrapCDN.jsp"></c:import>
</head>
<body>
	<h1>${board} Insert Page</h1>
	<div class="container mt-3">
		<form:form modelAttribute="boardVO" enctype="multipart/form-data">
			<div class="mb-3 mt-3 input-group-sm">
				<label for="title">Title:</label>
				<form:input path="title" id="title" cssClass="form-control"/>
				<form:errors path="title" cssStyle="color:red;"></form:errors>
			</div>
			<div class="mb-3 input-group-sm">
				<label for="writer">Writer:</label>
				<form:input path="writer" id="writer" cssClass="form-control"/>
			</div>
			<div class="mb-3 input-group-sm">
				<label for="contents">Contents:</label>
				<form:input path="contents" id="contents" cssClass="form-control"/>
			</div>
			<div>
				<input type="file" name="files"><br>
				<input type="file" name="files">
			</div>
			<div>
				Button : <button type="submit">Write</button>
			</div>
		</form:form>
	</div>
</body>
</html>