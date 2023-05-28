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
	<title>Music fest!</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> 
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="text-center">HOME PAGE</h1>
	<h1 class="text-center">Welcome, <c:out value="${user.userName}"/></h1>

	<div class="mainTop">
        <h2>7-FEST</h2>
            <table>
                <tr>
                    <th> </th>
                    <th>6-7</th>
                    <th>7-8</th>
                    <th>8-9</th>
                    <th>9-10</th>
                    <th>10-11</th>
                    <th>11-12</th>
                </tr>
                <tr>
                    <th>Stage 1</th>
                    <th>Hall & Oates</th>
                    <th>Thomas Rhett</th>
                    <th>iann dior</th>
                    <th>Mayday Parade</th>
                    <th>Two Door Cinema</th>
                    <th>Taylor Swift</th>
                </tr>
                <tr>
                    <th>Stage 2</th>
                    <th>Billy Joel</th>
                    <th>MOMOLAND</th>
                    <th>The Weeknd</th>
                    <th>Blake Shelton</th>
                    <th>Incubus</th>
                    <th>Elton John</th>
                </tr>
                <tr>
                    <th>Stage 3</th>
                    <th>Motion City Soundtrack</th>
                    <th>ILLENIUM</th>
                    <th>Phil Collins</th>
                    <th>Death Cab For Cutie</th>
                    <th>blink-182</th>
                    <th>Cash Cash</th>
                </tr>
            </table>
	</div>
		
	<div class="mainBottom">

        <div class="bottLeftDiv">
            <a href="/addLineup">Make Your Lineup</a>
            <a href="/lineup/{id}">View Your Lineup</a>
            <a href="/logout">Logout</a>
        </div>

        <div class="bottRightDiv">
            <h5>Check Out Others Lineups</h5>
            <c:forEach var="user" items="$userLineups">
            </c:forEach>
        </div>

	</div>


</body>
</html>