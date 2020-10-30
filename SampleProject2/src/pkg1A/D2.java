package pkg1A;

import pkg1.D1;

public class D2 extends D1 {
	double d;
	protected D2(){
		super();
	}
	protected D2(double d, int a, String s){
		super(a, s);
		this.d = d;
	}
}
