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
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <form:form action="/edit/${expense.id}" method="POST" modelAttribute="expense">
	<input type="hidden" name="_method" value="PUT"/>
	<div>
			<form:label path="name">Expense Name: </form:label>
			<form:input path="name" type="text"/>
			<form:errors path="name" class="text-danger"/>
		</div> 
		
		<div>
			<form:label path="vendor">Vendor: </form:label>
			<form:input path="vendor" type="text"/>
			<form:errors path="vendor" class="text-danger"/>
		</div>  		
		
		<div>
			<form:label path="price">Price: </form:label>
			<form:input path="price" type="number" step="0.01"/>
			<form:errors path="price" class="text-danger"/>
		</div>
		
		<div>
			<form:label path="description">Description: </form:label>
			<form:input path="description" type="text"/>
			<form:errors path="description"/>
		</div>
		
		<button>Submit</button>
   </form:form>
</body>
</html>