package pkg1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SampleStreamEmp {

	public static void main(String[] args) {
		Emp eobj[] = new Emp[3];
		eobj[0] = new Emp();
		eobj[1] = new Emp();
		eobj[2] = new Emp();
		
		List<Emp> list = new ArrayList<Emp>();
		
		for(int i=1;i<3;i++) {
			list.add(eobj[i]);
		}
		
		Stream<Emp> stream = list.stream();
		stream.forEach(emp -> System.out.println(emp));
	}

}
