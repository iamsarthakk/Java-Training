package p2;

public class TestMain {
	public static void main(String args[]) {
		A3 obj = new A3();
		obj.display();
		obj.display();
		obj.display();
		A1 ref;
		ref = new A1();
		ref.display();
		ref = new A2(); //upcasting
		ref.display();
		ref = new A3();
		ref.display();
		
//		A2 rf;
//		rf = (A2)new A1();   //downcasting
	}
}
