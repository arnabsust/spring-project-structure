<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Setup</title>
</head>
<body>
<div class="col-md-12">
    <h1 class="page-header">Customer List</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Customer Number</th>
            <th>Customer Name</th>
            <th>Contact Last Name</th>
            <th>Contact First Name</th>
            <th>Phone</th>
            <th>Address Line</th>
            <th>City</th>
            <th>State</th>
            <th>Postal</th>
            <th>Country</th>
            <th>Credit Limit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${customerList}">
            <tr>
                <td>${item.customerNumber}</td>
                <td>${item.customerName}</td>
                <td>${item.contactLastName}</td>
                <td>${item.contactFirstName}</td>
                <td>${item.phone}</td>
                <td>${item.addressLine1}</td>
                <td>${item.city}</td>
                <td>${item.state}</td>
                <td>${item.postalCode}</td>
                <td>${item.country}</td>
                <td>${item.creditLimit}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>