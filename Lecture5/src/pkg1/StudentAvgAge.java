package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentAvgAge {

	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		
		studentlist.add(new Student(11, "Jon", 22));
		studentlist.add(new Student(22, "Steve", 18));
		studentlist.add(new Student(33, "Lucy", 22));
		studentlist.add(new Student(44, "Sansa", 23));	
		studentlist.add(new Student(55, "Maggie", 18));
		
		Double avgAge = studentlist.stream()
									.collect(Collectors.averagingInt(s->s.age));
		System.out.println("Average Age of Students: "+avgAge);
	}

}
