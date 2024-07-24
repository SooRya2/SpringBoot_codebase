<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.incedo.bean.Employee,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1 align="center">Employee page</h1>
   <form action="addEmployee" method="post">
   <table align="center">
  	 	
 	  <tr>
 		<td>Employee Name</td>
 		<td><input type="text" name="name"></td>
 	 </tr>	
 	  <tr>
 		<td>Employee Email</td>
 		<td><input type="email" name="email"></td>
 	 </tr>	
 	  <tr>
 		<td>Employee DOB</td>
 		<td><input type="date" name="dob"></td>
 	 </tr>	
 	 <tr>
 	 	<td>
 	 		<button type="submit">Add employee</button>
 	 	</td>
 	 </tr>
 	</table>
 	</form>
 	<table border="1">
 	<c:forEach var="e" items="${employees}">
 		<tr><td>${e.empid}</td><td>${e.name}</td><td>${e.email}</td><td>${e.dob}</td></tr>
 	</c:forEach>
 	</table>
 	
</body>
</html>