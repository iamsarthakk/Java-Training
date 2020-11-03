package Problem2;

import java.time.LocalDate;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		BankAccount B = new BankAccount("200013456", "Sarthak", "Saving", LocalDate.now(), 2000.00, Locale.CANADA);
		Transaction t = new Transaction();
//		t.addData("200013457", "Ankit", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);
//		t.addData("200013452", "Rohit", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);
//		t.addData("200013451", "Kailash", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);
//		t.addData("200013454", "Monal", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);
//		t.addData("200013453", "Banku", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);
//		t.addData("200013455", "Robert", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);
//		t.addData("200013458", "Vasundhara", "Saving", LocalDate.now(), 20000000.00, Locale.CANADA);

		t.addTransactions("status", B, 1000);
		t.addTransactions("deposit", B, 1000);
		t.addTransactions("status", B, 1000);
		t.addTransactions("withdraw", B, 1000);		
		t.addTransactions("status", B, 1000);
		t.addTransactions("withdraw", B, 1000);
		t.addTransactions("status", B, 1000);
		t.addTransactions("deposit", B, 1000);
		t.addTransactions("withdraw", B, 1000);
		t.addTransactions("status", B, 1000);
		
//		System.out.println(t);
		BankAccount C = new BankAccount("200013457", "Ankit", "Saving", LocalDate.now(), 2400.00, Locale.CANADA_FRENCH);

		t.addTransactions("status", C, 1000);
		t.addTransactions("deposit", C, 1000);
		t.addTransactions("status", C, 1000);
		t.addTransactions("withdraw", C, 1000);		
		t.addTransactions("status", C, 1000);
		t.addTransactions("withdraw", C, 1000);
		t.addTransactions("status", C, 1000);
		t.addTransactions("deposit", C, 1000);
		t.addTransactions("withdraw", C, 1000);
		t.addTransactions("status", C, 1000);
		
//		for(int i=0;i<t.ll.size();i++) {
//			System.out.println(t.ll.get(i));
//		}
		List<BankAccount> trn = t.ll.stream()
												.filter(x->x.name=="Ankit")
												.collect(Collectors.toList());
		for(int i=0;i<trn.size();i++) {
			System.out.println(trn.get(i));
		}
		
	}

}
