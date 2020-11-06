package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestServlet1")
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID=1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse rs) 
			throws ServletException, IOException {
		Emp eobj1 = new Emp();
		eobj1.eid = Integer.parseInt(req.getParameter("id"));
		eobj1.ename = req.getParameter("empname");
		eobj1.ecity = req.getParameter("empcity");

		eobj1.esal = Double.parseDouble(req.getParameter("esal"));
		req.setAttribute("eobjop1", eobj1);

		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/TestServlet2");
					if(dispatcher!=null)
						dispatcher.forward(req, rs);
	}

}
