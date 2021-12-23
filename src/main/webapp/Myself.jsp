<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 6/11/2021
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head style="background: #333333" >
    <title>Myself Page</title>
</head>
<body style="text-align: center">
<%@include file="Menu.html"%>
<br><br>
<style>
    body{
        background-color: beige;
    }
</style>
    <br>
    <form name="MyselfForm" method="post" action="Myself.jsp">
        <br><br>
        Name: <input type="text" name="myName"><br>
        Age: <input type="text" name="myAge"><br>
        Hobbies : <input type="text" name="myHobbies"><br>
        Height : <input type="text" name="myHeight"><br>
        Weight : <input type="text" name="myWeight"><br>
        <br>
        <input type="submit" value="submit">
        <br>
    </form>

<c:forEach var="i" begin="1" end="5">
    <c:out value="berjaya install"/><br>
</c:forEach>

<%! String getMessage()
    {
        return "Session Created in declaration";
    }

%>

    <%
        String mytext =request.getParameter("myName");

        if(mytext == null)
        {}
        else{
            session.setAttribute("myName",request.getParameter("myName"));
            session.setAttribute("myAge",request.getParameter("myAge"));
            session.setAttribute("myHobbies",request.getParameter("myHobbies"));
            session.setAttribute("myHeight",request.getParameter("myHeight"));
            session.setAttribute("myWeight",request.getParameter("myWeight"));

            out.println(getMessage());
        }
    %>

    <br>
<div style="border: thick solid black; padding: 3px; width: fit-content; margin: auto">
<h1><%= "This is Myself Page" %></h1>
    <jsp:include page="MyselfServlet"/>
</div>
</body>
</html>
