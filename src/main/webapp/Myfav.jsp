<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/14/2021
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Myfav Page</title>
</head>
<body style="text-align: center">
<%@include file="Menu.html"%>
<br><br>
<style>
    body{
        background-color: blanchedalmond;
    }
</style>
<br>
<form name="MyfavouriteForm" method="post" action="Myfav.jsp">
    <br><br>

    Food : <input type="text" name="myFood"><br>
    Drink : <input type="text" name="myDrink"><br>
    Colour : <input type="text" name="myColour"><br>
    Brand : <input type="text" name="myBrand"><br>

    <br>
    <input type="submit" value="submit">
    <br>
</form>
<c:forEach var="i" begin="1" end="5">
    <c:out value="manis manis tapi uwangnya nipis"/><br>
</c:forEach>
    <%! String getMessage()
    {
        return "Session Created in declaration";
    }

%>

    <%
        String mytext =request.getParameter("myFood");

        if(mytext == null)
        {}
        else{

            session.setAttribute("myFood",request.getParameter("myFood"));
            session.setAttribute("myDrink",request.getParameter("myDrink"));
            session.setAttribute("myColour",request.getParameter("myColour"));
            session.setAttribute("myBrand",request.getParameter("myBrand"));

            out.println(getMessage());
        }
    %>

<br>
<div style="border: thick solid black; padding: 3px; width: fit-content; margin: auto">
<h1><%= "This is MyFavourite Page" %></h1>
    <jsp:include page="MyfavServlet"/>
</div>
<body>
</html>
