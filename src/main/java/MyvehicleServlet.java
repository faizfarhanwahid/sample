import com.example.jeetry.MySelf;
import com.example.jeetry.MyVehicle;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyvehicleServlet", value = "/MyvehicleServlet")
public class MyvehicleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        out.println("<h3>"+"Vehicle Type : "+ MyVehicle.MyVehicleType+"</h3>");
        out.println("<h3>"+"Vehicle Brand : "+MyVehicle.MyVehicleBrand+"</h3>");
        out.println("<h3>"+"Vehicle Id : "+MyVehicle.MyVehicleId+"</h3>");


        out.println("</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
