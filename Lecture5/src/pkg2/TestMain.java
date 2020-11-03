package pkg2;

import java.util.Locale;

public class TestMain {

	public static void main(String[] args) {
		Account ac = new Account(Locale.UK, 15000);
		ac.status();
		ac.withdraw(1000);
		ac.status();
		ac.deposit(5000);
		ac.status();
		ac.withdraw(100000);

	}

}
