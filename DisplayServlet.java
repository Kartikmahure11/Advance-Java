import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = (String) request.getAttribute("name");
        String email = (String) request.getAttribute("email");
        String password = (String) request.getAttribute("password");

        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>User Data</title></head><body>");
        response.getWriter().println("<h2>User Data</h2>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<p>Password: " + password + "</p>");
        response.getWriter().println("</body></html>");
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
