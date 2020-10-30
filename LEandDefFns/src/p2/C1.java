package p2;

public class C1 {
	public static void main(String args[]) {
		double dl3, dl1=3.35, dl2=4.75;
		
		LambdaExp1 le1 = (d1, d2) ->(d1+d2);//lambda exp
		
		dl3 = le1.operation(dl1, dl2); //java exp
		
		System.out.println(le1.operation(dl1, dl2));
		
		LambdaExp1 le2 = (d1,d2) ->(d1*d2);
		
		dl3 = le2.operation(dl1,  dl2);
		
		System.out.println(dl3);
	}
}
