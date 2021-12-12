package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyselfServlet", value = "/MyselfServlet")
public class MyselfServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        final String myName = (String) session.getAttribute("myName"),
                tempAge =  (String) session.getAttribute("myAge"),
                myHobbies = (String) session.getAttribute("myHobbies"),
                tempHeight =  (String) session.getAttribute("myHeight"),
                tempWeight =  (String) session.getAttribute("myWeight");

        if(tempAge == null || myName == null || myHobbies == null || tempHeight == null || tempWeight == null) {


            return;
        }

        int myAge = Integer.parseInt(tempAge);
        double myHeight = Double.parseDouble(tempHeight);
        double myWeight = Double.parseDouble(tempWeight);

//        String myname = (String) session.getAttribute("MyName");
//        //String myage = (String) session.getAttribute("MyAge");
//        int myAge = Integer.parseInt((String)session.getAttribute("myAge"));
//        String myhobbies = (String) session.getAttribute("MyHobbies");
//        double myHeight = Double.parseDouble((String)session.getAttribute("myHeight"));
//        double myWeight = Double.parseDouble((String)session.getAttribute("myWeight"));




//        MySelf mySelf = new MySelf("Faiz Wahid",21,"Gaming",182.00,50.00);
        MySelf mySelf = new MySelf(myName, myAge, myHobbies, myHeight, myWeight);

        out.println("<html><body>");

        out.println("<h3>"+"Name : "+mySelf.getMyName()+"</h3>");
        out.println("<h3>"+"Age : "+mySelf.getMyAge()+"</h3>");
        out.println("<h3>"+"Hobbies : "+mySelf.getMyHobbies()+"</h3>");
        out.println("<h3>"+"Height : "+mySelf.getMyHeight()+"cm"+"</h3>");
        out.println("<h3>"+"Weight : "+mySelf.getMyWeight()+"kg"+"</h3>");


        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
