package p1.p11;

public class Sample3 {
	public static void main(String args[]) {
		int x = 25;
		double d;
		try {
			d = (double)x/0;
			System.out.println(d);
		}
		catch(ArithmeticException are){
			System.out.println("Cannot divide by zero");
		}
		finally {
			System.out.println("Exited from try and catch");
		}
	}
}
