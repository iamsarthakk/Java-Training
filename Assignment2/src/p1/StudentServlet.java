package p1;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sname="";
		int studentid, marks1, marks2, marks3;
		
//		String username = request.getParameter("user_name");
		sname = request.getParameter("sname");
		studentid =  Integer.parseInt(request.getParameter("studentid"));
		marks1 =  Integer.parseInt(request.getParameter("Marks1"));
		marks2 =  Integer.parseInt(request.getParameter("Marks2"));
		marks3 =  Integer.parseInt(request.getParameter("Marks3"));

		
		Student s = new Student(studentid, marks1, marks2, marks3, sname);
		s.insert(s);
		LinkedList<Student> sl;
		sl = s.addStudent();
		request.setAttribute("slist", sl);
		
		String strViewPage="Student.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(strViewPage);
		if(dispatcher!=null){
			dispatcher.forward(request, response);
		}
	}

}
