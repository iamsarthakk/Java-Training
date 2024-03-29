package Bank_Classes;

import Bank.Banking;
import UserExceptions.AmoutException;
import customer.Customer;

public class Recurring_Trn implements Banking {
	Customer c;
	public Recurring_Trn(Customer c) {
		this.c = c;
	}
	@Override
	public void deposit(double amount) throws AmoutException {
		if(amount<=0)
			throw new AmoutException(amount);
		c.setBalance(c.getBalance()+amount);
	}
	@Override
	public double calinterest(double principal) {
		int time = 20;
		return principal*rint_rate*time/100;
	}
	@Override
	public void withdraw(double amount) throws AmoutException {
		if(amount<=0)
			throw new AmoutException(amount);
		c.setBalance(c.getBalance()-amount);
	}
}
