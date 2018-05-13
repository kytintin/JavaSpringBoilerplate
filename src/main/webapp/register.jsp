<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="<c:url value="/resources/css/frontend.css"/>">
	<title>Register</title>

</head>

<body>

	<div class="nav">
	
		<div class="row">
	
			<a href="/MavenBoilerplate">Maven Boilerplate</a>
			<a href="/MavenBoilerplate/register" class="align-right">Register</a>
	
		</div>
	
	</div>

		<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
	            
	            <input class="" placeholder="First Name">
	            <input class="" placeholder="Last Name">
	            <input class="" placeholder="E-Mail">
	            <input class="" placeholder="Password">
	            <input class="" placeholder="Confirm Password">
	            
	            <button class="btn-primary form-btn">Register</button>
	              
        </form:form>

</body>

</html>