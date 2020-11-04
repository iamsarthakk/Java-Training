package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {

	public static void main(String[] args) {
		int x;
		String s1;
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
		
		x = 111;
		s1 = "B-Projects";
//		s2 = "THBS-GV";
		String ins = "insert into dept values(?,?)";
		try {
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1, x);
			preparedStmt.setString(2, s1);
			preparedStmt.execute();
			System.out.println("Data Inserted");
			conn.close();
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());
		}
	}

}
