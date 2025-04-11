<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.gqt.model.Car" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Car Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
        }
        h2 {
            color: #4CAF50;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 12px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
            color: #333;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        .no-data {
            color: red;
        }
    </style>
</head>
<body>

<h2>Car Information</h2>

<%
    ArrayList<Car> carList = (ArrayList<Car>) session.getAttribute("scustomerCarDetails");

    if (carList != null && !carList.isEmpty()) {
%>
        <table>
            <tr>
                <th>Username</th>
                <th>Car Model</th>
                <th>Car Type</th>
                <th>Car Registration</th>
                <th>Service Type</th>
                <th>Status</th>
            </tr>
            <% 
                for (Car x : carList) { 
            %>
            <tr>
                <td><%= x.getUsername() %></td>
                <td><%= x.getCarmodel() %></td>
                <td><%= x.getCartype() %></td>
                <td><%= x.getCarreg() %></td>
                <td><%= x.getServicetype() %></td>
                <td><%= x.getStatus() %></td>
            </tr>
            <% 
                } 
            %>
        </table>
<%
    } else {
%>
    <p class="no-data">No car details available.</p>
<%
    }
%>

</body>
</html>
