package pc2;
import pc1.C1;

public class C2 extends C1{
	 double d;
	 protected C2(double d, int a) {
		super(a);
		this.d = d;
	}
	 void inputC2(double d) {
		this.d = d;
	}
	protected void outputC2() {
		System.out.println(d);
	}
}
