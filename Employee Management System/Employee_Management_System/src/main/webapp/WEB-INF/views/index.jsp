<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
</head>
<body>
<h1>Employee Management System</h1>
<table border="1" style="border-collapse: collapse">
  <tr>
  	<th>EmpId</th>
    <th>Name</th>
    <th>Roll</th>
    <th>City</th>
    <th>Action</th>
  </tr>
  <c:forEach items="${employee}" var="emp">
  <tr>
  	<td>EMP${emp.emp_Id}</td>
    <td>${emp.emp_Name}</td>
    <td>${emp.emp_Roll}</td>
    <td>${emp.emp_City}</td>
    <td>
    <a href="delete/${emp.emp_Id}"><i class="fa-solid fa-trash-can"></i></a>
    </td>
  </tr>
  </c:forEach>
</table>
<div>
<a href="add_employee">Add Employee</a>
</div>

</body>
</html>
