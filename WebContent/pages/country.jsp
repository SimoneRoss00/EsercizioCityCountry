<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InfoCity</title>
</head>
<body>
	<h1>Benvenuto</h1>
	<form action="/EsercizioCityCountry/CountryServlet" method="GET">
		<div>
			<label>Inserisci il nome della nazione </label> <input type="text"
				name="countryName" />
		</div>
		<div>
			<label>Inserisci il nome del continente </label> <input type="text"
				name="continentName" />
		</div>
		<div>
			<input type="submit" value="Cerca" /> 
		</div>

		<p>${countryInfo}</p>


	</form>
</body>
</html>