package pkg1;

public class D1 {
	int a;
	String s;
	protected D1(){
		
	}
	protected D1(int a, String s){
		this.a = a;
		this.s = s;
	}
	protected void output() {
		System.out.println(a+" "+s);
	}
}
