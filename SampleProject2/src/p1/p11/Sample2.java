package p1.p11;

public class Sample2 {
	int a;
	String s;
	Integer i1;
	public void method1() {
		s = "GenPact";
		a = 25;
		i1 = 100;
		i1 = a; //auto boxing - Primitive data type is converted to object
		a = i1; //auto-unboxing
	}
}
