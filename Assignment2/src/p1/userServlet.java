package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/userServlet")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_name="", password="";
		user_name = request.getParameter("user_name");
		password = request.getParameter("password1");
		User u = new User(user_name, password);
		
		u.insert(u);
		String strViewPage="Sdetails.html";
		RequestDispatcher dispatcher = request.getRequestDispatcher(strViewPage);
		if(dispatcher!=null){
			dispatcher.forward(request, response);
		}
	}

}
