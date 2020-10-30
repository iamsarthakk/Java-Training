package UserExceptions;

public class AmoutException extends Exception{
	private double am;
	public AmoutException(double amount){
		am = amount;
	}
	public String toString() {
		return "Amount Exception Occured";
	}
}
