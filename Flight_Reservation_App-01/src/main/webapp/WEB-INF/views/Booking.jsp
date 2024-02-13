<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking Details</title>
</head>
<body>

<h1>Booking Details</h1>

<c:choose>
<c:when test="${not empty msg}">
<p>${msg}</p>
</c:when>
<c:otherwise>
<c:if test="${not empty reservation}"></c:if>
<table border="2">
<tr>
<tr>
<th>Reservation ID</th>
<th>Passenger Name</th>
<th>Flight Number</th>
<th>OperatingAirlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Date of Departure</th>
<th>Estimated Departure Time</th>
</tr>

<tr>
<td>${reservation.id}</td>
<td>${reservation.passenger.firstName}</td>
<td>${reservation.flight.flightNumber}</td>
<td>${reservation.flight.operatingAirlines}</td>
<td>${reservation.flight.departureCity}</td>
<td>${reservation.flight.arrivalCity}</td>
<td>${reservation.flight.dateOfDeparture}</td>
<td>${reservation.flight.estimatedDepartureTime}</td>
</tr>

</table>
</c:otherwise>
</c:choose>
</body>
</html>