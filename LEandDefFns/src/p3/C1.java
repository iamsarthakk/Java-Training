package p3;

public class C1 {
	public static void main(String args[]) {
		LeString obj1 = (person)->{
			return "Hi"+" "+person;
		};
		
		System.out.println(obj1);
		System.out.println(obj1.wish("Ajay"));
		
		LeString obj2 = (person)->{
			return "Hi "+person;
		};
		System.out.println(obj2);
		System.out.println(obj2.wish("Akash"));
	}
}
