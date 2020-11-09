package example;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CoffeeSelect")
public class CoffeeSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String c = request.getParameter("type");//from html
		CoffeeExpert ce = new CoffeeExpert();//from model
		List<String> result = ce.getTypes(c);//from model
		request.setAttribute("styles", result);
		RequestDispatcher view = 
					request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
