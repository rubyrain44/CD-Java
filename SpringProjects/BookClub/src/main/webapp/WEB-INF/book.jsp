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
    <title><c:out value="${book.title}" /></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
      <div class="dashboard">
		<div class="dashLeft">
		   <h1><c:out value="${book.title}" /></h1>
		</div>
		
		<div class="dashRight">
		   <a href="/books">Back To The Shelves</a>		
		</div>
	</div>
	
	<div class="bookPage">
		<div>
			<h5><span class="userColor"><c:out value="${book.user.userName}" /></span> read <span class="bookColor"><c:out value="${book.title}" /></span> by <span class="authorColor"><c:out value="${book.author}" /></span>.</h5>
			<h5>Here are <c:out value="${book.user.userName}" />'s thoughts: </h5>
		</div>
		
		<div class="thoughts">
			<p><c:out value="${book.thoughts}" /></p>
		</div>	
	</div>
</body>
</html>
