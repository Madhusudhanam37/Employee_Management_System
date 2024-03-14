<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<h1>Employee Management System</h1>
<form action="handle-employee" method="post">
<div>
<label for="name">Employee Name</label>
<input type="text" name="emp_Name" id="name" placeholder="Enter the Name">
</div>
<div>
<label for="roll">Employee Roll</label>
<input type="text" name="emp_Roll" id="roll" placeholder="Enter the Roll">
</div>
<div>
<label for="city">Employee City</label>
<input type="text" name="emp_City" id="city" placeholder="Enter the City">
</div>
<div>
<%-- ${pageContext.request.contextPath }/ --%>
<a href="${pageContext.request.contextPath }/">Back</a>
<button type="submit">Add</button>
</div>


</form>
</body>
</html>