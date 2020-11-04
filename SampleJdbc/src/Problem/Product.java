package Problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Product {
	
	public static void insert(Connection conn) {
		String ins = "insert into product values(?,?,?,?)";
		try {
			Scanner sc = new Scanner(System.in);
			int prodid = sc.nextInt();
			String pname = sc.next();
			String color = sc.next();
			double rate = sc.nextDouble();
			
			PreparedStatement preparedStmt = conn.prepareStatement(ins);
			preparedStmt.setInt(1, prodid);
			preparedStmt.setString(2, pname);
			preparedStmt.setString(3, color);
			preparedStmt.setDouble(4, rate);
			preparedStmt.execute();
			
			System.out.println("Data Inserted");
			
			
			sc.close();
		}catch(SQLException ob3) {
			System.err.println("Got an exception!");
			System.err.println(ob3.getMessage());
		}
	}
	public static void display(Connection conn) {
		String query = "SELECT * FROM product";
		ProductList p = new ProductList();
		System.out.println("Id\tProduct\tColor\tRate");
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int prodid = rs.getInt("prodid");
				String pname = rs.getString("pname");
				String color = rs.getString("color");
				double rate = rs.getDouble("rate");
				Prod prod= new Prod(prodid, pname, color, rate);
				p.p.add(prod);
				System.out.println(prodid+"\t"+pname+"\t"+color+"\t"+rate);
			}
		}catch(SQLException s) {
			s.printStackTrace();
		}
	}
	public static void main(String args[]) {
		
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
		
		System.out.println("Enter Y to proceed");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		 do{
			System.out.println("Chose\n1. Insert\n2. Display");
			int choice = sc.nextInt();
			switch(choice){
			case 1: insert(conn);
			break;
			case 2: display(conn);
			break;
			default: System.out.println("Not a valid choice");
			}
			System.out.println("Want to continue? (Y/N)");
			s = sc.next();
		
		}while(s.compareTo("Y")==0);
		sc.close();
		
		try {
			System.out.println("Exiting Program!!!");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
