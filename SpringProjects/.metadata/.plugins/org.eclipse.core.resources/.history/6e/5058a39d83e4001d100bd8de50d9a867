<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

	<meta charset="UTF-8">
	<title>musicfest</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> 
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<h1>Make Your Lineup!</h1>

	<a href="/home">Home</a>

	
		<div class="container">
		<form:form action="/submit" modelAttribute="lineup" class="form" method="post">
		
			<div class="form-row">
			 	<form:errors path="timeslot1" class="error"/>
				<form:label for="timeslot1" path="timeslot1">6-7:</form:label>
					<select class="form-select"  name ="timeslot1" aria-label="Default select example">
  						<option selected>Choose an artist!</option>
  						<option value="Hall and Oats">Hall and Oats</option>
						<option value="Bilyl Joel">Bilyl Joel</option>
						<option value="Motion City Soundtrack">Motion City Soundtrack</option>
					</select>
			</div>
			<div class="form-row">
			 	<form:errors path="timeslot2" class="error"/>
				<form:label for="timeslot2" path="timeslot2">7-8:</form:label>
					<select class="form-select" name ="timeslot2"  aria-label="Default select example">
  						<option selected>Choose an artist!</option>
						<option value="Thomas Rhett">Thomas Rhett</option>
						<option value="MOMOLAND ">MOMOLAND</option>
						<option value="ILLENIUM ">ILLENIUM</option>
					</select>
			</div>
			<div class="form-row">
			 	<form:errors path="timeslot3" class="error"/>
				<form:label for="timeslot3"  path="timeslot3">8-9:</form:label>
					<select class="form-select"  name ="timeslot3" aria-label="Default select example">
  						<option selected>Choose an artist!</option>
						<option value="Iann Dior">Iann Dior</option>
						<option value="The weekend">The weekend</option>
						<option value="Phil Colins">Phil Colins</option>
					</select>
			</div>
			<div class="form-row">
			 	<form:errors path="timeslot4" class="error"/>
				<form:label for="timeslot4" path="timeslot4">9-10:</form:label>
					<select class="form-select"  name ="timeslot4"  aria-label="Default select example">
  						<option selected>Choose an artist!</option>
						<option value="Mayday Parade">Mayday Parade</option>
						<option value="Blake Shelton">Blake Shelton</option>
						<option value="Death Cab For Cutie">Death Cab For Cutie</option>
					</select>
			</div>
			<div class="form-row">
			 	<form:errors path="timeslot5" class="error"/>
				<form:label for="timeslot5" path="timeslot5">10-11:</form:label>
					<select class="form-select"   name ="timeslot5" aria-label="Default select example">
  						<option selected>Choose an artist!</option>
						<option value="Two Door Cinema">Two Door Cinema</option>
						<option value="Incubus">Incubus</option>
						<option value="Blink-182">Blink-182</option>
					</select>
			</div>
			<div class="form-row">
			 	<form:errors path="timeslot6" class="error"/>
				<form:label for="timeslot6"  path="timeslot6">11-12:</form:label>
					<select class="form-select"  name ="timeslot6" aria-label="Default select example">
				  		<option selected>Choose an artist!</option>
						<option value="Taylor Swift">Taylor Swift</option>
						<option value="Elton John">Elton John</option>
						<option value="Cash Cash">Cash Cash</option>
					</select>
			</div>
			
			<div class="form-row">
				<form:errors path="user" class="error"/>
				<form:input type="hidden" path="user" value="${user.id}" class="form-control"/>
			</div>
			
			
		<input type="submit" value="Save Selection">
		

		
		
			
		</form:form>
		
		


	</div>
	
	

		<a   class="btn btn-outline-danger"href="/logout">logout</a>
		
		</div>
		
		

		


	

</body>
</html>















