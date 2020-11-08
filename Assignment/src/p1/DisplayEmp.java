package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;


public class DisplayEmp {
	public LinkedList<Emp> addEmp() {
		Connection conn = null;
		LinkedList<Emp> el=new LinkedList<Emp>();;
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
		
		String query = "SELECT * FROM emp";
		 
//		System.out.println("Id\tName\tCity\tSalary");
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int eid = rs.getInt("eid");
				String ename = rs.getString("ename");
				String ecity = rs.getString("ecity");
				double esal = rs.getDouble("esal");
				Emp e= new Emp(eid, ename, ecity, esal);
				el.add(e);
//				System.out.println(eid+"\t"+ename+"\t"+ecity+"\t"+esal);
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
