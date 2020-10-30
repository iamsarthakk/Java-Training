package Java_Exceptions;

public class SampleException extends Exception {
	private int age;
	SampleException(int x){
		age = x;
	}
	public String toString() {
		return "Its a Sample Exception";
	}
}
