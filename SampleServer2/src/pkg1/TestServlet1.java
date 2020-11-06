package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet1")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String ename="", city="";
		int eid;
		double esal;
		
		ename = request.getParameter("ename");
		city = request.getParameter("ecity");
		esal = Double.parseDouble(request.getParameter("esal"));
		eid =  Integer.parseInt(request.getParameter("eid"));
		
		Emp e = new Emp(eid, ename, city, esal);
		
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		pr.println("<html><body>");
		pr.println("Following data is Stored in Employee:");
		pr.println("Id: "+e.getEid()+"<br/>");
		pr.println("Name: "+e.getEname()+"<br/>");
		pr.println("City: "+e.getCity()+"<br/>");
		pr.println("Salary: "+e.getEsal()+"<br/>");
		pr.println("</body></html>");
	}

}
