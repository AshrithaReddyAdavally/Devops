

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class LoginServlet extends HttpServlet {
	
	String user,pass;
	public void init()
	{
		System.out.println("Inside method");
	}
    
      	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		user=request.getParameter("user");
		pass=request.getParameter("pass");
		request.setAttribute("user", "user");
		//out.println("Username"+user+ " "+"password"+pass);
		if(user.equals("Ashritha") && pass.equals("ash123"))
		{
			response.sendRedirect("Servlet2");
			//RequestDispatcher r=request.getRequestDispatcher("Servlet2");
			//r.forward(request,response);
			//out.println("Hello "+user+" Welcome to this site");
			//out.println("Email"+getServletContext().getInitParameter("Email"));
		}
		else
		{
			response.sendRedirect("2.html");
			//RequestDispatcher r=request.getRequestDispatcher("/2.html");
			//r.include(request, response);
			out.println("Invalid username");
			//out.println("Fail");
		}
      	}
		public void destroy()
		{
			System.out.println("Inside destroy method");
		}
      	}
