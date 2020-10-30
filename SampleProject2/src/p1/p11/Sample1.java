package p1.p11;

public class Sample1 {
	public static void main(String args[]) {
		int a[];
		a = new int[4];
		
		
		try {
			a[0]=25;
			a[1]=15;
			a[2]=5;
			a[3]=45;
			for(int i=0;i<=4;i++) {
				System.out.println(a[i]);
			}
		}
		catch(Exception ae) {
			System.out.println("Array exceeding size");
			System.out.println(ae);
		}
		
		finally {
			System.out.println("Out of for loop");
		}
		
	}
}
