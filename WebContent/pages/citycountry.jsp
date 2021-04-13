<%@ page language="java" contentType="text/html; charset=ISO-8859-15"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>See the City</title>
</head>
<body>
	<h1>
		Benvenuto qui visualizzi le citta ${sessionName}
	</h1>
	<form action="/EsercizioCityCountry/ViewCityServlet" method="GET">
		<c:forEach items="${allCity}" var="item">
			<p>name:${item.name} &nbsp;&nbsp;&nbsp;
				population:${item.population}</p>
			<br>
			<br>
		</c:forEach>



	</form>
</body>
</html>