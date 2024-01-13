<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
</head>
<body>
<h2>Find Flights</h2>
<form action = "findFlights" method = "post">

<pre>
FROM: <input type ="text" name = "from"/>
TO: <input type ="text" name = "to"/>
DEPARTURE DATE: <input type="text" name="departureDate" placeholder="dd-MM-yyyy"/>
<input type = "Submit" value = "Search"/>
</pre>

</form>


</body>
</html>