<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
  background-image: url('https://tse3.mm.bing.net/th/id/OIP.PeFJ0uTZlAPwsrMfp_Zu-gHaFS?w=221&h=180&c=7&o=5&dpr=1.5&pid=1.7');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Hangers</title>
</head>
<body>
<div align="center">
		<h1>Welcome to Add Hanger Page</h1>
		<form:form action="addHangers" method="post" modelAttribute="plane">
			<table border=1>
			<tr>
				<td>Hanger Name</td>
				<td><form:input type="text" path="hangerName"
				style="width: 120px" /><form:errors path="hangerName"/></td>
				<tr>
					<td>Hanger Type</td>
					<td><form:select path="hangerType">
							<option value="public">Public</option>
							<option value="private">Private</option>
					</form:select></td>
				</tr>
			</table>
			<button type="submit">Submit</button>
			<br>
			</form:form>
			<p>Click here to go to Home page</p> <a href="homepage">Home</a>
</body>
</html>