package p3;

public class Sampleth implements Runnable{
	int x;
	String str;
	Thread t;
	Sampleth(String s){
		x =0;
		str = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for(int i=0;i<50;i++) {
			x += 2;
			System.out.print(str+"-> "+x+" ");
		}
		System.out.println();
	}
	
}
