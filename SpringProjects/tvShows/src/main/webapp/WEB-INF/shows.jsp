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
    <title>Shows Database</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<div class="header">
	   <h1>Welcome, <c:out value="${user.userName}" /></h1>
	   <a href="/logout">logout</a>
	</div>
	
	<div class="mainPage">
		<h5>TV Shows</h5>
		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Show</th>
					<th>Network</th>			
				</tr>
			</thead>
			<c:forEach var="show" items="${allShows}">
				<tr>
					<td><a href="/shows/showdetails/${show.id}"><c:out value="${show.title}" /></a></td>
					<td><c:out value="${show.network}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<a href="/shows/new">Add a show</a>
	
</body>
</html>
