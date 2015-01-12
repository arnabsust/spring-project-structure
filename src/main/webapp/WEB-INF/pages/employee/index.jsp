<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Setup</title>
</head>
<body>
<div class="col-md-12">
    <h1 class="page-header">Employee List</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Employee Number</th>
            <th>Last Name</th>
            <th>First Name</th>
            <th>Extension</th>
            <th>Email</th>
            <th>Office Code</th>
            <th>Job Title</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${employeeList}">
            <tr>
                <td>${item.employeeNumber}</td>
                <td>${item.lastName}</td>
                <td>${item.firstName}</td>
                <td>${item.extension}</td>
                <td>${item.email}</td>
                <td>${item.officeCode}</td>
                <td>${item.jobTitle}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>