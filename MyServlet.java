

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
		  response.setContentType("text/html");
		  PrintWriter out=response.getWriter();
		  String id = request.getParameter("realname");
		  String password = request.getParameter("mypassword");
		  out.print("Username:"+id+"<br>Password:"+password); 
	}

		public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
		    String id = request.getParameter("realname");
		    String password = request.getParameter("mypassword");
		    
		    out.print("Username:"+id+"<br>Password:"+password); 
	}

	 
	 

}
