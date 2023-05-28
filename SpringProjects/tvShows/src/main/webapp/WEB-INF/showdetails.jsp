<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show Details</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   	<div class="header">
	   <h1><c:out value="${show.title}" /></h1>
	   <a href="/shows">Back To Dashboard</a>
	</div>
	
	<div class="detailsPage">
		<h4>Posted By: <c:out value="${show.user.userName}" /> </h4>
		<p>Network: <c:out value="${show.network}" /> </p>
		<p>Description: <c:out value="${show.description}" /></p> 
	</div>
	
	<a href="/shows/edit/${show.id}">Edit</a>
	
</body>
</html>
