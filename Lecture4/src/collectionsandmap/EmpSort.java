package collectionsandmap;

import java.util.ArrayList;
import java.util.Collections;

public class EmpSort {

	public static void main(String[] args) {
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(new Employee(111, "bbbb", "london"));
		ar.add(new Employee(131, "aaaa", "nyc"));
		ar.add(new Employee(121, "cccc", "jaipur"));
		
		System.out.println("Unsorted");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortbyEid());
		
		System.out.println("\nSorted by rollno");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByName());
		
		System.out.println("\nSorted by name");
		for(int i=0;i<ar.size();i++)
			System.out.println(ar.get(i));
	}

}
