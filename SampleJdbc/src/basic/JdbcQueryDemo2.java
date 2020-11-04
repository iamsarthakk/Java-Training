package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcQueryDemo2 {

	public static void main(String[] args) {
		int dno=101;
		String deptname;
		
		String query = "SELECT * FROM dept WHERE deptid = ?";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample",
					"root", "root");
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, dno);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				deptname = rs.getString("dname");
				System.out.println(deptname);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
		
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}

}
