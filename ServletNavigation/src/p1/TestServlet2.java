package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
	
		response.setContentType("text/html");
		
		Emp eobjop = new Emp();
		eobjop = (Emp)request.getAttribute("eobjop1");
		PrintWriter pw = response.getWriter();
		pw.println("<HTML>");
		pw.println("<BODY>");
		pw.println("This is from Servlet 2<br/>");
		pw.println("Id: "+eobjop.getEid()+"<br/>");
		pw.println("Name: "+eobjop.getEname()+"<br/>");
		pw.println("City: "+eobjop.getCity()+"<br/>");
		pw.println("Salary: "+eobjop.getEsal()+"<br/>");
		pw.println("</BODY>");
		pw.println("</HTML>");
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
