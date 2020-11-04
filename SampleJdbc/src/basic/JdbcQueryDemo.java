package basic;

import java.sql.*;

public class JdbcQueryDemo {

	public static void main(String[] args) {
		System.out.println("Querying a table example!");
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException exob1) {
			
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample",
																		"root", "root");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Statement st = con.createStatement();
			ResultSet rs;
			System.out.println("Id"+"\tName\tGen\tSalary\tCity");
			System.out.println("================================");
			rs = st.executeQuery("SELECT * FROM emp");
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getDouble(4)+"\t");
				System.out.print(rs.getString(5));
				System.out.println();
			}
		}catch(SQLException s) {
			System.out.println("Table or column type is not found");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
