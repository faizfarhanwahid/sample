<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 6/11/2021
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Mystudent Page</title>
</head>
<body style="text-align: center">
<%@include file="Menu.html"%>
<br><br>
<style>
    body{
        background-color: paleturquoise;
    }
</style>

    <br>
    <form name="MystudentForm" method="post" action="Mystudent.jsp">
        <br><br>
        &nbsp &nbsp &nbsp MatricNo : <input type="text" name="myMactricNo"><br>
        ProgramCode : <input type="text" name="myProgramCode"><br>
        &nbsp Campus : <input type="text" name="myCampus"><br>

        <br>
        <input type="submit" value="submit">
        <br>
    </form>
<c:forEach var="i" begin="1" end="5">
    <c:out value="belajar rajin rajin kerja makan gaji bro"/><br>
</c:forEach>
<%! String getMessage()
{
    return "Session Created in declaration";
}

%>
    <%
        String mytext =request.getParameter("myMactricNo");

        if(mytext == null)
        {}
        else{

            session.setAttribute("myMactricNo",request.getParameter("myMactricNo"));
            session.setAttribute("myProgramCode",request.getParameter("myProgramCode"));
            session.setAttribute("myCampus",request.getParameter("myCampus"));

            out.println(getMessage());
        }
    %>

    <br>
<div style="border: thick solid black; padding: 3px; width: fit-content; margin: auto">
<h1><%= "This is MyStudent Page" %></h1>
    <jsp:include page="MystudentServlet"/>
    </div>
</body>
</html>
