package p1;

public interface I1 {
	public void display();
	
	//default methods in interface
	public default void displayMesg1() {
		System.out.println("Welcome");
	}
	public default void displayMesg2() {
		System.out.println("In Mesg 2");
	}
}
