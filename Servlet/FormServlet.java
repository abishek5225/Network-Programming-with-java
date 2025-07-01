import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

class FormServlet.java{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");

        String name= request.getParameter("username");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello, "+ name "!Welcome sir.");
        out.println("</body></html>");
    }
}