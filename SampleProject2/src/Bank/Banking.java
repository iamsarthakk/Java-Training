package Bank;

import UserExceptions.AmoutException;

public interface Banking {
	double sint_rate = 5.5;
	double rint_rate = 7.5;
	double plint_rate = 8.0;
	
	public default void Greet() {
		System.out.println("Welcome, You are in       Date: 29/10/2020");
	}
	public void deposit (double amount) throws AmoutException;
	public double calinterest(double principal);
	public void withdraw(double amount) throws AmoutException;
}
