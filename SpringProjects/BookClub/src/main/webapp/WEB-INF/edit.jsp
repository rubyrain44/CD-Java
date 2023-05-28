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
    <title>Edit <c:out value="${book.title}" /></title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
      	<div class="dashboard">
		<div class="dashLeft">
		   <h1>Change Your Entry</h1>
		</div>
		
		<div class="dashRight">
		   <a href="/books">Back To The Shelves</a>		
		</div>
	</div>
	
	<div class="mainPage">
   		<form:form action="/books/edit/${book.id}" method="POST" modelAttribute="book">
   		<input type="hidden" name="_method" value="PUT">
	   		<div>
	   			<form:label path="title">Title: </form:label>
	   			<form:input type="text" path="title" class="form-control"/>
	   			<form:errors path="title" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="author">Author: </form:label>
	   			<form:input type="text" path="author" class="form-control"/>
	   			<form:errors path="author" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="thoughts">My Thoughts: </form:label>
	   			<form:input type="text" path="thoughts" class="form-control"/>
	   			<form:errors path="thoughts" style="color: red"/>
	   		</div>   		
	   		<input type=submit value="Submit" class="submit">
   		</form:form>		
	</div>
</body>
</html>
