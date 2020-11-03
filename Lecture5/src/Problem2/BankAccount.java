package Problem2;

import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;

public class BankAccount {
	String accNo, name, tType;
	LocalDate date;
	double balance;
	Locale locale;
	Currency c;
	public BankAccount(String accNo, String name, String tType, LocalDate date, double balance, Locale locale) {
		this.accNo = accNo;
		this.name = name;
		this.tType = tType;
		this.date = date;
		this.balance = balance;
		this.locale = locale;
		this.c = Currency.getInstance(locale);
	}
	public void status() {
		System.out.println(balance+" "+c.getCurrencyCode()+" in this account");
	}
	public void deposit(int deposit) {
		balance+=deposit;
		System.out.println(deposit+" "+c.getCurrencyCode()+" deposited");
	}
	
	public void withdraw(int w) {
		if(w<balance) {
			balance-=w;
			System.out.println(w+" "+c.getCurrencyCode()+" withdrawn");
		}
		else {
			System.out.println("You can't withdraw "+w+" "+c.getCurrencyCode()+"!");
		}
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", name=" + name + ", tType=" + tType + ", date=" + date + ", balance="
				+ balance + ", locale=" + locale + ", c=" + c + "]";
	}
}
