<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>See the Country</title>
</head>
<body>
	<h1>Qui visualizzi le nazioni${sessionName}</h1>
	<form action="/EsercizioCityCountry/ViewCountry" method="GET">
	
		<c:forEach items="${countryView}" var="items">
			<a href="/EsercizioCityCountry/ViewCityServlet?value=${items.code}">codice nazione : ${items.code}</a>&nbsp;&nbsp;&nbsp;&nbsp;population: ${items.population}
			<br><br>
		</c:forEach>



	</form>
</body>
</html>