package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyfamilyServlet", value = "/MyfamilyServlet")
public class MyfamilyServlet extends HttpServlet {
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

                String myDad = (String) session.getAttribute("myDad");
                String myMom = (String) session.getAttribute("myMom");
                String mySiblings = (String) session.getAttribute("mySiblings");
                String mySiblings1 = (String) session.getAttribute("mySiblings1");


//        MyFamily myFamily = new MyFamily("Faiz Wahid",21,"Gaming",182.00,50.00,"Abdul Whaid",
//                                         "Zarina","Naim","Darwisy");
        MyFamily myFamily = new MyFamily(myName, tempAge, myHobbies, tempHeight, tempWeight, myDad, myMom, mySiblings, mySiblings1 );

        out.println("<html><body>");

        out.println("<h3>"+"Name : "+myFamily.getMyName()+"</h3>");
        out.println("<h3>"+"Age : "+myFamily.getMyAge()+"</h3>");
        out.println("<h3>"+"Hobbies : "+myFamily.getMyHobbies()+"</h3>");
        out.println("<h3>"+"Height : "+myFamily.getMyHeight()+"cm"+"</h3>");
        out.println("<h3>"+"Weight : "+myFamily.getMyWeight()+"kg"+"</h3>");
        out.println("<h3>"+"Dad Name : "+myFamily.getMyDad()+"</h3>");
        out.println("<h3>"+"Mom Name : "+myFamily.getMyMom()+"</h3>");
        out.println("<h3>"+"Sibling Name : "+myFamily.getMySiblings()+","+myFamily.getMySiblings1()+"</h3>");


        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
