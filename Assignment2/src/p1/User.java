package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User {
	String user_name, password;

	public User(String user_name, String password) {
		this.user_name = user_name;
		this.password = password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void insert(User e) {
		
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
		
		String ins = "insert into user values(?,?)";
		try {
			
			String user_name = e.user_name;
			String password = e.password;
			
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
	
			preparedStmt.setString(1, user_name);
			preparedStmt.setString(2, password);
			
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
