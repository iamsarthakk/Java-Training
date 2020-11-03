package Problem;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
//import java.util.Iterator;

public class Bill {
	int billNo;
	LocalDate billdate;
	String customer;
	ArrayList<Product> products=new ArrayList<Product>();
	
	Bill(){
		
	}
	
	public Bill(int billNo, LocalDate billdate, String customer, ArrayList<Product> products) {
		super();
		this.billNo = billNo;
		this.billdate = billdate;
		this.customer = customer;
		this.products = products;
	}

	public static void main(String args[]) {
		ArrayList<Product> products=new ArrayList<Product>();
		Bill B = new Bill(100, LocalDate.now(),"Sarthak", products);
		B.products.add(new Product(134, 10,"Laptop", 0.1, 50000.00));
		B.products.add(new Product(244, 3,"Phone", 0.3, 58000.00));
		B.products.add(new Product(561, 10,"VR", 0.1, 7000.00));
		B.products.add(new Product(113, 10,"Software", 0.23, 3455.50));
		B.products.add(new Product(311, 10,"Mouse", 0.91, 400.00));
		
		double amount = 0;
		System.out.println("Customer Name: "+B.customer+", Date: " +LocalDate.now());
		System.out.format("%16s%16s%16s%16s","ID",  "Product", "Value", "Quantity");
		System.out.println();
		for(int i=0;i<B.products.size();i++) {
			
			System.out.format("%16d%16s%16s%16s",B.products.get(i).getpId(),B.products.get(i).getPname(), B.products.get(i).getValue(), B.products.get(i).getPqty());
			System.out.println();
			amount+=B.products.get(i).getValue()*B.products.get(i).getPqty();
		}
		System.out.format("%16s", "Total Amount: "+amount);
	}
	
	
}
