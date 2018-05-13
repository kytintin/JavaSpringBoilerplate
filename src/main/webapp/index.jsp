<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

	<link rel="stylesheet" href="<c:url value="/resources/css/frontend.css"/>">

</head>

<body>

	<div class="nav">
	
		<div class="row">
	
			<a href="/MavenBoilerplate">Maven Boilerplate</a>
			<a href="/MavenBoilerplate/register" class="align-right">Register</a>
	
		</div>
	
	</div>
	
	
	
	<div class="center-div">
	
		<h2>Welcome to Spring Maven Boiletplate</h2>
	
		<p>This project uses Spring MVC, Hibernate</p>
	
		<form method="post" action="" class="card form-container">
	
		<input class="form-element" name="username" placeholder="Username">
		
		<input class="form-element" name="password" placeholder="Password">
		
		<button class="btn-primary form-element form-btn">Log In</button>
	
	</form>
	
	</div>
	
</body>

</html>
