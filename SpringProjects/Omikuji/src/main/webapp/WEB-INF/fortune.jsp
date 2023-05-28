<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fortune</title>
</head>
<body>
	<h1>Here's Your Omikuji!</h1>
	
	<div>
		<h5>In <c:out value ="${number}"/> years, you will live in <c:out value ="${city}"/> with <c:out value ="${person}"/> as your roommate, <c:out value ="${profession}"/> for a living. The next time you see a <c:out value ="${livingThing}"/>, you will have good luck. Also, <c:out value ="${memo}"/>. </h5>
	</div>
	
	<div>
		<a href="">Go Back</a>
	</div>
</body>
</html>