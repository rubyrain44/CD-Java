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
    <title>Edit Show</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
      	<div class="dashboard">
		   <h1><c:out value="${show.title}" /></h1>
		</div>
	
	<div class="editShowForm">
   		<form:form action="/shows/edit/${show.id}" method="POST" modelAttribute="show">
   		<input type="hidden" name="_method" value="put">
	   		<div>
	   			<form:label path="title">Title: </form:label>
	   			<form:input type="text" path="title" class="form-control"/>
	   			<form:errors path="title" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="network">Network: </form:label>
	   			<form:input type="text" path="network" class="form-control"/>
	   			<form:errors path="network" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="description">Description: </form:label>
	   			<form:input type="textarea" path="description" class="form-control"/>
	   			<form:errors path="description" style="color: red"/>
	   		</div>
	   		<div>
	   			<a href="/shows">Cancel</a>
	   			<input type=submit value="Submit" class="submit">
	   		</div> 
	   		<a href="/shows/delete/${show.id}">Delete Show</a>  		
   		</form:form>		
	</div>
</body>
</html>
