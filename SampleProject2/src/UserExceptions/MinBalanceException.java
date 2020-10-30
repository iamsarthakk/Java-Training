package UserExceptions;

public class MinBalanceException extends Exception{
	public MinBalanceException(double balance){
	}
	public String toString() {
		return "Minimum Balance Exception Occured";
	}
}
