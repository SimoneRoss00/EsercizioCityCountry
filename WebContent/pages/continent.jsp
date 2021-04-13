<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>See Continent</title>
</head>
<body>
	<h1>Benvenuto qui visualizzi i continenti ${sessionName}</h1>
	<form action="/EsercizioCityCountry/ContinentServlet" method="GET">

		

		<c:forEach items="${allContinent}" var="item">
			<a href="/EsercizioCityCountry/ViewCountry?value=${item}">${item}</a>
			<br>
			<br>
		</c:forEach>
		<input type="submit" value="view the continent"/><br> <br>
	</form>


</body>
</html>
