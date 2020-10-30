package pc3;
import pc2.C2;

public class C3 extends C2{
	String s;
	 public C3(String s, double d, int a) {
		super(d, a);   //Call Superclass constructor
		this.s = s;
	}
	 void inputC3(String s) {
		this.s = s;
	}
	 void outputC3() {
		 outputC2();
		System.out.println(s);
	}
}
