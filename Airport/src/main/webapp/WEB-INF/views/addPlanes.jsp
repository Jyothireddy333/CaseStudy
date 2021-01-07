<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
  background-image: url('https://www.bing.com/th/id/OIP.nrIrhPJCbHMByc0y2IfYTgHaEo?w=228&h=180&c=7&o=5&dpr=1.5&pid=1.7');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Planes</title>
</head>
<body>
<div align="center">
		<h1>Welcome to Add Plane Page</h1>
		<form:form action="addPlanes" method="post" modelAttribute="plane">
			<table border=1>
			<tr>
				<td>Plane Name</td>
				<td><form:input type="text" path="planeName"
				style="width: 120px" /><form:errors path="planeName"/></td></tr>
				
            <tr>
				<td>Travel From</td>
				<td><form:select path="travelFrom">
			<option value="Chennai">Chennai</option>
			<option value="Hyderabad">Hyderabad</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Banglore">Banglore</option>
			<option value="Tirupathi">Tirupathi</option>
				</form:select></td>
				<td><form:errors path="travelFrom"/></td></tr>
			<tr>
				<td>Travel To</td>
				<td><form:select path="travelTo">
			<option value="Chennai">Chennai</option>
			<option value="Hyderabad">Hyderabad</option>
			<option value="Mumbai">Mumbai</option>
			<option value="Banglore">Banglore</option>
			<option value="Tirupathi">Tirupathi</option>
				</form:select></td>
				<td><form:errors path="travelTo"/></td></tr>
				<tr>
				<td>Hanger Id</td>
				<td><form:input type="text" path="hangerId"
				style="width: 120px" /><form:errors path="hangerId"/></td></tr>
				
            <tr>
		</table>
		<button type="submit">Submit</button><br>
	</form:form>
	<p>Click here to go to Home page</p> <a href="homepage">Home</a>
</body>
</html>