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
    <title>Login Page</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <div class="indexHeader">
   		<div>
   			<h1 class="loginHeader">Book Club</h1>
   			<h4>A place for friends to share thoughts on books.</h4>
   		</div>
   </div>
   
   <div class="mainPage">
   
   <div class="registerForm">
   		<div>
   			<h2>Register</h2>
   		</div>
   		<form:form action="/register" method="POST" modelAttribute="user">
	   		<div>
	   			<form:label path="userName">User Name: </form:label>
	   			<form:input type="text" path="userName" class="form-control"/>
	   			<form:errors path="userName" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="email">Email: </form:label>
	   			<form:input type="email" path="email" class="form-control"/>
	   			<form:errors path="email" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="password">Password: </form:label>
	   			<form:input type="password" path="password" class="form-control"/>
	   			<form:errors path="password" style="color: red"/>
	   		</div>
	   		<div>
	   			<form:label path="confirm">Confirm: </form:label>
	   			<form:input type="password" path="confirm" class="form-control"/>
	   			<form:errors path="confirm" style="color: red"/>
	   		</div>	   		
	   		<input type=submit value="Submit" class="submit">
   		</form:form>
   </div>
   
      <div class="loginForm">
   		<div>
   			<h2>Login</h2>
   		</div>
   		<form:form action="/login" method="POST" modelAttribute="loginUser">
	   		<div>
	   			<form:label path="email">Email: </form:label>
	   			<form:input type="email" path="email" class="form-control"/>
	   			<form:errors path="email" style="color: red"/>
	   		</div>
			<div>
	   			<form:label path="password">Password: </form:label>
	   			<form:input type="password" path="password" class="form-control"/>
	   			<form:errors path="password" style="color: red"/>
	   		</div>	   			   		
	   		<input type=submit value="Submit" class="submit">
   		</form:form>
   </div>
   
   </div>
</body>
</html>