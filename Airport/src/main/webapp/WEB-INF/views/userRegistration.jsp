<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
<head>
<style>
body {
  background-image: url('https://tse1.mm.bing.net/th/id/OIP.HgXGexsVCm1-u7fDUkPgOwHaE7?w=269&h=180&c=7&o=5&dpr=1.5&pid=1.7');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<form:form action="userRegistration" method="post" modelAttribute="user">
			<table border=1>
				<tr>
					<td>Firstname</td>
					<td><form:input type="text" path="firstname"
						style="width: 120px" /><font color="red"><form:errors path="firstname"/></font></td>
				</tr>
				<tr>
					<td>Lastname</td>
					<td><form:input type="text" path="lastname"
						style="width: 120px" /><font color="red"><form:errors path="lastname"/></font></td>
				</tr>
				<tr>
					<td>age</td>
					<td><form:input type="text" path="age"
						style="width: 120px"/><font color="red"><form:errors path="age"/></font></td>
				</tr>
				<tr>
					<td>gender</td>
					<td><form:input type="text" path="gender"
						style="width: 120px"/><font color="red"><form:errors path="gender"/></font></td>
				</tr>
				<tr>
					<td>phone number</td>
					<td><form:input type="text" path="contactNumber"
						style="width: 120px"/><font color="red"><form:errors path="contactNumber"/></font></td>
				</tr>
				<tr>
					<td>User id</td>
					<td><form:input type="text" path="userId"
						style="width: 120px"/><font color="red"><form:errors path="userId"/></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password"
						style="width: 120px"/><font color="red"><form:errors path="password"/></font></td>
				</tr>
				<tr>
					<td>RoleId</td>
					<td><form:select path="roleId" id="roleId" style="width: 127px">
							<option value=1>Admin</option>
							<option value=2>Manager</option>
					</form:select></td>
				</tr>
				
			</table>
			<input type="submit" value="Register">
		</form:form><br></br>
		Already Registered?<a href="userLogin">Login</a>
		<p>Click here to go to Home page</p> <a href="homepage">Home</a>
	</div>
</body>
</html>