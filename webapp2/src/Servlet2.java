

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		//out.println(((GenericServlet)request).getInitParameter("Mobile"));
		//ServletContext s=getServletContext();
		out.println("Hello "+request.getAttribute("user")+"you are in the page "+getServletConfig().getServletName());
	}

}
