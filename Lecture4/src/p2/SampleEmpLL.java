package p2;

import java.util.LinkedList;
import java.util.ListIterator;

public class SampleEmpLL {

	public static void main(String[] args) {
		LinkedList<Emp> ll1emp = new LinkedList<Emp>(); 
		ll1emp.add(new Emp(1001, "Sarthak", 'M', 201000.00));
		ll1emp.add(new Emp(1002, "Vasundhara", 'F', 200000.00));
		ll1emp.add(new Emp(1003, "Roshan", 'M', 240000.00));
		ll1emp.add(new Emp(1004, "Mukesh", 'M', 280000.00));
		ll1emp.add(new Emp(1005, "Priti", 'F', 135000.00));
		ll1emp.add(new Emp(1006, "Shruti", 'F', 205000.00));
		ll1emp.add(new Emp(1007, "Vaibhav", 'M', 200770.00));
		System.out.println(ll1emp);
		ListIterator<Emp> itr = ll1emp.listIterator();
		System.out.format("%16s%16s%8s%16s","ID",  "Name",  "Gender",  "Salary");
		System.out.println();
		while(itr.hasNext()) {
			Emp temp = itr.next();
			System.out.format("%16d%16s%8s%16s", temp.empid,  temp.ename,  temp.egen,  temp.esal);
			System.out.println();
		}
	}

}
