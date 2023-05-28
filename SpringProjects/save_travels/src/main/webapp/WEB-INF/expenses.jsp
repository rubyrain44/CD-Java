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
    <title>Expenses</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<div>
		<h1>Save Travels</h1>
		
		   <table class="table table-striped">
		   		<tr>
		   			<th>Expense</th>
		   			<th>Vendor</th>
		   			<th>Price</th>
		   		</tr>
		   		<c:forEach var="expense" items="${allExpenses}">
			   		<tr>
			   			<td><a href="/expensePage/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
			   			<td><c:out value="${expense.vendor}"></c:out></td>
			   			<td><c:out value="${expense.price}"></c:out></td>
			   			<td><a href="/edit/${expense.id}" class="btn btn-primary">Edit</a> <a href="/delete/${expense.id}" class="btn btn-danger">Delete</a></td>
			   		</tr>
		   		</c:forEach>
		   </table>
	</div>
	   
	   <div>
	   		<h4>Add An Expense</h4>
			   <form:form action="/create" method="POST" modelAttribute="newExpense">
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
	   </div>
</body>
</html>
