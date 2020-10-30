package customer;

import UserExceptions.MinBalanceException;
import UserExceptions.NullStringException;

public class Customer {
	int cid;
	double balance;
	String name, accnumb;
	public Customer(int cid, String accnumb, long balance, String name) throws NullStringException, MinBalanceException {
		super();
		if (accnumb == "")
			throw new NullStringException(accnumb);
		if (name == "")
			throw new NullStringException(name);
		
		if(balance<1000)
			throw new MinBalanceException(balance);
		this.cid = cid;
		this.accnumb = accnumb;
		this.balance = balance;
		this.name = name;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getAccnumb() {
		return accnumb;
	}
	public void setAccnumb(String accnumb) {
		this.accnumb = accnumb;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		
		return "Customer [cid=" + cid + ", accnumb=" + accnumb + ", balance=" + balance + ", name=" + name + "]";
	}
}
