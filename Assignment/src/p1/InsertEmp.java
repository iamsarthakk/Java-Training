package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmp {
	public void insert( Emp e) {
		
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
		
		String ins = "insert into emp values(?,?,?,?)";
		try {
			int eid = e.eid;
			String ename = e.ename;
			String ecity = e.ecity;
			double esal = e.esal;
		
			
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1, eid);
			preparedStmt.setString(2, ename);
			preparedStmt.setString(3, ecity);
			preparedStmt.setDouble(4, esal);
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
}
