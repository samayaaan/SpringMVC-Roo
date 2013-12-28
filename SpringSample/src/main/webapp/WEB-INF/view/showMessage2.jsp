<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>${title}</title>
	</head> 
	<body>
		<h1>${title}</h1>
		<p>${message}</p>
		<form:form modelAttribute="sampleFormModel">
			<form:input path="input1" />
			<input type="submit" >
		</form:form>
	</body>
</html>
