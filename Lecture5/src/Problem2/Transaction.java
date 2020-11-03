package Problem2;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Locale;

public class Transaction {
	LinkedList<BankAccount> ll;
	Transaction(){
		ll = new LinkedList<BankAccount>();
	}
	@Override
	public String toString() {
		return "Transaction [ll=" + ll + "]";
	}
	public void addData(String accNo, String name, String tType, LocalDate date, double balance, Locale locale) {
		new BankAccount( accNo,  name,  tType,  date,  balance,  locale);
	}
	public void addTransactions(String type, BankAccount B, int am) {
		if(type=="deposit") {
			B.deposit(am);
			ll.add(B);
		}
		else if(type=="withdraw") {
			B.withdraw(am);
			ll.add(B);
		}
		else if(type=="status") {
			B.status();
			ll.add(B);
		}
	}
}
