package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MystudentServlet", value = "/MystudentServlet")
public class MystudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myName=(String) session.getAttribute("myName");
        int tempAge=Integer.parseInt((String) session.getAttribute("myAge"));
        String myHobbies=(String) session.getAttribute("myHobbies");
        int tempHeight=Integer.parseInt((String) session.getAttribute("myHeight"));
        int tempWeight=Integer.parseInt((String) session.getAttribute("myWeight"));

        String myMactricNo = (String) session.getAttribute("myMactricNo");
        String myProgramCode = (String) session.getAttribute("myProgramCode");
        String myCampus = (String) session.getAttribute("myCampus");


//        MyStudent myStudent = new MyStudent("Faiz Wahid",21,"Gaming",182.00,50.00,"2021101951","CS266","Jasin");
        MyStudent myStudent = new MyStudent(myName, tempAge, myHobbies, tempHeight, tempWeight, myMactricNo, myProgramCode, myCampus );

        out.println("<html><body>");

        out.println("<h3>"+"Name : "+myStudent.getMyName()+"</h3>");
        out.println("<h3>"+"Age : "+myStudent.getMyAge()+"</h3>");
        out.println("<h3>"+"Hobbies : "+myStudent.getMyHobbies()+"</h3>");
        out.println("<h3>"+"Height : "+myStudent.getMyHeight()+"cm"+"</h3>");
        out.println("<h3>"+"Weight : "+myStudent.getMyWeight()+"kg"+"</h3>");
        out.println("<h3>"+"Matric no : "+myStudent.getMyMactricNo()+"</h3>");
        out.println("<h3>"+"Program Code : "+myStudent.getMyProgramCode()+"</h3>");
        out.println("<h3>"+"Campus : "+myStudent.getMycampus()+"</h3>");


        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
