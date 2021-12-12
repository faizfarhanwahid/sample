<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/15/2021
  Time: 11:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Myvehicle Page</title>
</head>
<body style="text-align: center" >
<style>
    body{
        background-color: thistle;
    }
</style>
<%@include file="Menu.html"%>
<br><br>
<div style="border: thick solid black; padding: 3px; width: fit-content; margin: auto">
<h1><%= "This is MyVehicle Page" %></h1>
    <jsp:include page="MyvehicleServlet"/>
    <div>
</body>
</html>
