package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyfavServlet", value = "/MyfavServlet")
public class MyfavServlet extends HttpServlet {
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

        String myFood = (String) session.getAttribute("myFood");
        String myDrink = (String) session.getAttribute("myDrink");
        String myColour = (String) session.getAttribute("myColour");
        String myBrand = (String) session.getAttribute("myBrand");


//        MyFav myFav = new MyFav("Faiz Wahid",21,"Gaming",182.00,50.00,"Tomyam","Pepsi","Yellow","Adidas");
        MyFav myFav = new MyFav(myName, tempAge, myHobbies, tempHeight, tempWeight, myFood, myDrink, myColour, myBrand);

        out.println("<html><body>");

        out.println("<h3>"+"Name : "+myFav.getMyName()+"</h3>");
        out.println("<h3>"+"Age : "+myFav.getMyAge()+"</h3>");
        out.println("<h3>"+"Hobbies : "+myFav.getMyHobbies()+"</h3>");
        out.println("<h3>"+"Height : "+myFav.getMyHeight()+"cm"+"</h3>");
        out.println("<h3>"+"Weight : "+myFav.getMyWeight()+"kg"+"</h3>");
        out.println("<h3>"+"Food : "+myFav.getMyFood()+"</h3>");
        out.println("<h3>"+"Drink : "+myFav.getMyDrink()+"</h3>");
        out.println("<h3>"+"Colour : "+myFav.getMyColour()+"</h3>");
        out.println("<h3>"+"Brand : "+myFav.getMyBrand()+"</h3>");

        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
