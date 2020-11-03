package pkg2;

import java.util.Currency;
import java.util.Locale;

public class Account {
	private Locale locale;
	private int amount;
	private Currency c;
	public Account(Locale locale, int amount) {
		super();
		this.locale = locale;
		this.amount = amount;
		this.c = Currency.getInstance(locale);
	}
	public Locale getLocale() {
		return locale;
	}
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Currency getC() {
		return c;
	}
	public void setC(Currency c) {
		this.c = c;
	}
	
	public void status() {
		System.out.println(amount+" "+c.getCurrencyCode()+" in this account");
	}
	public void deposit(int deposit) {
		amount+=deposit;
		System.out.println(deposit+" "+c.getCurrencyCode()+" deposited");
	}
	
	public void withdraw(int w) {
		if(w<amount) {
			amount-=w;
			System.out.println(w+" "+c.getCurrencyCode()+" withdrawn");
		}
		else {
			System.out.println("You can't withdraw "+w+" "+c.getCurrencyCode()+"!");
		}
	}
	
}
