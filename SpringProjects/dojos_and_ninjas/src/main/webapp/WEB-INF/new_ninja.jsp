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
    <title>Create A New Ninja</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<div>
		<h1>New Ninja</h1>
	</div>
	
	<div>
		<form:form action="/create_ninja" method="POST" modelAttribute="ninja">
			<div>
				<form:label path="dojo">Dojo: </form:label>
				<form:select path="dojo">
					<c:forEach var="dojo" items="${dojos}">
						<option value="${dojo.id}">${dojo.name}</option>
					</c:forEach>
				</form:select>
			</div>
			
			<div>
				<form:label path="firstName">First Name: </form:label>
				<form:input type="text" path="firstName"/>
			</div>
			
			<div>
				<form:label path="lastName">Last Name: </form:label>
				<form:input type="text" path="lastName"/>
			</div>
			
			<div>
				<form:label path="age">Age: </form:label>
				<form:input type="number" path="age"/>
			</div>
			
			<input type="submit" value="Create">
		</form:form>
	</div>
   
</body>
</html>