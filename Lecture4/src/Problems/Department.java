package Problems;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Department {
	int deptid;
	String name;
	LinkedList<Emp> employees;
	Department(){
		
	}
	public Department(int deptid, String name, LinkedList<Emp> employees) {
		this.deptid = deptid;
		this.name = name;
		this.employees = employees;
	}

	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Emp> employees = new LinkedList<Emp>();
		Department dp = new Department(1, "CSE", employees);
		for(int i=0;i<3;i++) {
			System.out.println("Details of Employee Numbe "+i+1);
			System.out.println("Enter Employee ID: ");
			int id = sc.nextInt();
			System.out.println("Enter Employee Name: ");
			String name = sc.next();
			System.out.println("Enter Employee Salary: ");
			double sal = sc.nextDouble();
			
			Emp e = new Emp(id, name, sal);
			dp.employees.add(e);
		}
		
		Collections.sort(dp.employees,  new SortByName());
		System.out.println("\nSorted by name");
		for(int i=0;i<dp.employees.size();i++)
			System.out.println(dp.employees.get(i));
		
		Collections.sort(dp.employees,  new SortBySalary());
		System.out.println("\nSorted by Salary");
		for(int i=0;i<dp.employees.size();i++)
			System.out.println(dp.employees.get(i));
	}	
		
}
