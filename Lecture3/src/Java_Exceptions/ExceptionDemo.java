package Java_Exceptions;

public class ExceptionDemo {
	static void compute(int a) throws SampleException{
		System.out.println("Called compute(" + a +")");
		if(a>10)
			throw new SampleException(a);
		System.out.println("Normal Exit");
	}
	public static void main(String[] args) {
		try {
			System.out.println("Entering the try block");
			compute(1);
			compute(20);
			System.out.println("Exiting the try block");
		}
		catch(SampleException e) {
			System.out.println("Number cannot be more than 10 "+e);
		}
	}

}
