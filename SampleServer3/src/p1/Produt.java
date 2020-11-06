package p1;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Produt")
public class Produt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String pname="", pcolor="";
		int pid;
		double prate;
		
		pname = request.getParameter("pname");
		pcolor = request.getParameter("pcolor");
		prate = Double.parseDouble(request.getParameter("prate"));
		pid =  Integer.parseInt(request.getParameter("pid"));
		
		Product p = new Product(pid, pname, pcolor, prate);
		request.setAttribute("prod", p);
		String strViewPage="Prod.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(strViewPage);
		if(dispatcher!=null){
			dispatcher.forward(request, response);
		}

	}

}
