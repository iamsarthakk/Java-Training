package p1;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename="", ecity="";
		int eid;
		double esal;
		
		ename = request.getParameter("ename");
		ecity = request.getParameter("ecity");
		esal = Double.parseDouble(request.getParameter("esal"));
		eid =  Integer.parseInt(request.getParameter("eid"));
		
		Emp e = new Emp(eid, ename, ecity, esal);
		
		InsertEmp i = new InsertEmp();
		i.insert(e);
		
		DisplayEmp d= new DisplayEmp();
		LinkedList<Emp> empl = d.addEmp();
		
		request.setAttribute("elist", empl);
		
		String strViewPage="Employee.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(strViewPage);
		if(dispatcher!=null){
			dispatcher.forward(request, response);
		}
		
//		response.setContentType("text/html");
//		PrintWriter pr = response.getWriter();
//		pr.println("<html><body>");
//		pr.println("Following data is Stored in Employee:");
//		pr.println("Id: "+e.getEid()+"<br/>");
//		pr.println("Name: "+e.getEname()+"<br/>");
//		pr.println("ecity: "+e.getecity()+"<br/>");
//		pr.println("Salary: "+e.getEsal()+"<br/>");
//		pr.println("</body></html>");
	}

}
