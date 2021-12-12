package com.example.jeetry;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "My name is Muhammad Faiz Farhan bin Abdul Wahid @.@";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        for(int i=0; i<10; i++)
        {
            out.println("<h1>" + message + "</h1>");
        }

        out.println("</body></html>");
    }

    public void destroy() {
    }
}