<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
</head>
<body>
<h2>Flight Search Results</h2>
<h3>List of Flights</h3>
<table border="2">
<tr>
<tr>
<th>AIRLINES</th>
<th>DEPARTURE CITY</th>
<th>ARRIVAL CITY</th>
<th>DEPARTURE TIME</th>
<th>SELECT FLIGHT</th>
</tr>
<c:forEach var="findFlights" items="${msg}">
<tr>
<td>${findFlights.operatingAirlines}</td>
<td>${findFlights.departureCity}</td>
<td>${findFlights.arrivalCity}</td>
<td>${findFlights.estimatedDepartureTime}</td>
<td><a href="showCompleteReservation?flightId=${findFlights.id}">Select</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>