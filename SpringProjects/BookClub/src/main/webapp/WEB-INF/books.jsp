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
    <title>Books Dashboard</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>

<body>
	<div class="dashboard">
		<div class="dashLeft">
		   <h1>Welcome, <c:out value="${user.userName}" /></h1>
		   <h4>Books from everyone's shelves: </h4>
		</div>
		
		<div class="dashRight">
		   <a href="/logout">Logout</a>
		   <a href="/books/new">Add To My Shelf</a>		
		</div>
	</div>
	
	<div class="mainPage">
		<table class="table table-striped">
			<thead class="thead-dark">		
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author Name</th>
					<th>Posted By</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${allBooks}">
					<tr>
						<th><c:out value="${book.id}" /></th>
						<th><a href="/books/${book.id}"><c:out value="${book.title}" /></a></th>
						<th><c:out value="${book.author}" /></th>
						<th><c:out value="${book.user.userName}" /></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
