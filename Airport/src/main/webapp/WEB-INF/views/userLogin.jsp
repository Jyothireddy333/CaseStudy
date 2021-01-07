%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
  background-image: url('https://tse2.mm.bing.net/th/id/OIP.bwpAUWpEDjqa54W1fHEhtQHaEO?w=316&h=180&c=7&o=5&dpr=1.5&pid=1.7');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
		<h1>Welcome to Login Page</h1>
		<form:form action="userLogin" method="post" modelAttribute="userCredential">
			<table border=1>
				<tr>
					<td>userId</td>
					<td><form:input type="text" path="userId"
						style="width: 120px"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
						style="width: 120px"/></td>
				</tr>

			</table>
			<input type="submit" value="Login">
		</form:form><br></br>
		<p>Not registered?</p><a href="userRegistration">Register</a>
		<p>Click here to go to Homepage </p><a href="homepage">Home</a>
	</div>
</body>
</html>