package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Student {
	int studentid, marks1, marks2, marks3;
	String sname;
	public Student() {
		
	}
	public Student(int studentid, int marks1, int marks2, int marks3, String sname) {
		super();
		this.studentid = studentid;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.sname = sname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
public void insert(Student e) {
		
		Connection conn = null;
		try {
			String myDriver = "com.mysql.cj.jdbc.Driver";
			Class.forName(myDriver);
		}catch(ClassNotFoundException ob1) {
			System.out.println("Cannot Load Driver"+ob1);
		}
		try {
			String myUrl = "jdbc:mysql://localhost:3306/sample";
			conn = DriverManager.getConnection(myUrl, "root", "root");			
			}catch(SQLException sqle1) {
				sqle1.printStackTrace();
			}
		
		String ins = "insert into student values(?,?,?,?,?)";
		try {
			int studentid = e.studentid;
			String sname = e.sname;
			int marks1 = e.marks1;
			int marks2 = e.marks2;
			int marks3 = e.marks3;
		
			
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1, studentid);
			preparedStmt.setString(2, sname);
			preparedStmt.setInt(3, marks1);
			preparedStmt.setInt(4, marks2);
			preparedStmt.setInt(5, marks3);
			preparedStmt.execute();
			
			System.out.println("Data Inserted");		
		
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());
		}
		
		try {
			System.out.println("Exiting Program!!!");
			conn.close();
		} catch (SQLException es) {
			es.printStackTrace();
		}
	}

	public LinkedList<Student> addStudent() {
	Connection conn = null;
	LinkedList<Student> el=new LinkedList<Student>();;
	try {
		String myDriver = "com.mysql.cj.jdbc.Driver";
		Class.forName(myDriver);
	}catch(ClassNotFoundException ob1) {
		System.out.println("Cannot Load Driver"+ob1);
	}
	try {
		String myUrl = "jdbc:mysql://localhost:3306/sample";
		conn = DriverManager.getConnection(myUrl, "root", "root");			
		}catch(SQLException sqle1) {
			sqle1.printStackTrace();
		}
	
	String query = "SELECT * FROM student";
	 
//	System.out.println("Id\tName\tCity\tSalary");
	try {
		PreparedStatement pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int studentid = rs.getInt("studentid");
			String sname = rs.getString("sname");
			int marks1 = rs.getInt("marks1");
			int marks2 = rs.getInt("marks2");
			int marks3 = rs.getInt("marks3");
			
			Student e= new Student(studentid, marks1, marks2, marks3, sname);
			el.add(e);
//			System.out.println(eid+"\t"+ename+"\t"+ecity+"\t"+esal);
		}
	}catch(SQLException s) {
		s.printStackTrace();
	}
	
	try {
		System.out.println("Exiting Program after adding Emp to database!!!");
		conn.close();
	} catch (SQLException es) {
		es.printStackTrace();
	}
	return el;
}
	
}
