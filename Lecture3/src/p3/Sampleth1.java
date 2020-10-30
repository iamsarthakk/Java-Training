package p3;

public class Sampleth1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		int n;
		n = Thread.currentThread().getPriority();
		System.out.println(n);
		Thread.currentThread().setPriority(7);
		n = Thread.currentThread().getPriority();
		System.out.println(n);
		Thread.currentThread().setName("Sarthak");
		System.out.println(Thread.currentThread().getName());
	}

}
