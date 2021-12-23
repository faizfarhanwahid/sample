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
    <title>Myfamily Page</title>
</head>
<body style="text-align: center">
<%@include file="Menu.html"%>
<br><br>
<style>
    body{
        background-color: lemonchiffon;
    }
</style>
    <br>
    <form name="MyfamilyForm" method="post" action="Myfamily.jsp">
        <br><br>

        Dad : <input type="text" name="myDad"><br>
        Mom : <input type="text" name="myMom"><br>
        Siblings : <input type="text" name="mySiblings"><br>
        Siblings1 : <input type="text" name="mySiblings1"><br>

        <br>
        <input type="submit" value="submit">
        <br>
    </form>
<c:forEach var="i" begin="1" end="5">
    <c:out value="family first"/><br>
</c:forEach>
<%! String getMessage()
{
    return "Session Created in declaration";
}

%>

    <%
        String mytext =request.getParameter("myDad");

        if(mytext == null)
        {}
        else{

            session.setAttribute("myDad",request.getParameter("myDad"));
            session.setAttribute("myMom",request.getParameter("myMom"));
            session.setAttribute("mySiblings",request.getParameter("mySiblings"));
            session.setAttribute("mySiblings1",request.getParameter("mySiblings1"));

            out.println(getMessage());
        }
    %>

    <br>
<div style="border: thick solid black; padding: 3px; width: fit-content; margin: auto">
<h1><%= "This is MyFamily Page" %></h1>
 <jsp:include page="MyfamilyServlet"/>
</div>
</body>
</html>
