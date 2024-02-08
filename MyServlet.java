import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double time = Double.parseDouble(request.getParameter("time"));

        double simpleInterest = (principal * rate * time) / 100;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Simple Interest Calculator Result</title></head><body>");
        out.println("<h2>Simple Interest Calculator Result</h2>");
        out.println("<p>Principal: $" + principal + "</p>");
        out.println("<p>Rate: " + rate + "%</p>");
        out.println("<p>Time (years): " + time + "</p>");
        out.println("<p>Simple Interest: $" + simpleInterest + "</p>");
        out.println("</body></html>");
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 
		doGet(request, response);
	}

}
