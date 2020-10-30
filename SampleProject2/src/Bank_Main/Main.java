package Bank_Main;

import Bank_Classes.Recurring_Trn;
import Bank_Classes.Saving_Trn;
import UserExceptions.AmoutException;
import UserExceptions.MinBalanceException;
import UserExceptions.NullStringException;
import customer.Customer;

public class Main {

	public static void main(String[] args) {
			Customer c1;
			try {
				c1 = new Customer(101, "", 2000, "Raskovnikov");
				Saving_Trn S = new Saving_Trn(c1);
				S.Greet();
				
				try {
					System.out.println("Entering the try block");			
					S.deposit(-19);
					System.out.format("%8s %16s %16s %8s%16s", "ID" ,"AccountNO", "Balance", "Name", "Type");
					System.out.println();
					System.out.format("%8d %16d %16f %8s%16s", c1.getCid() , c1.getAccnumb(), c1.getBalance(), c1.getName(), "Saving");
					System.out.println();
					System.out.println("Exiting the try block");
				} catch (AmoutException e) {
					System.out.println("Amount should be greater than 0 "+e);
				}
					
				Recurring_Trn R = new Recurring_Trn(c1);
				try {
					System.out.println("Entering the try block");	
					R.deposit(100);
//					System.out.format("%8s %16s %16s %8s%8s", "ID" ,"AccountNO", "Balance", "Name", "Type");
//					System.out.println();
					System.out.format("%8d %16s %16f %8s%16s", c1.getCid() , c1.getAccnumb(), c1.getBalance(), c1.getName(), "Recurring");
					System.out.println();
					System.out.println("Exiting the try block");
					
				} catch (AmoutException e) {
					System.out.println("Amount should be greater than 0 "+e);
				}
			} catch (NullStringException e1) {
				
				System.out.println("AccountNo/Name can't be null "+e1);
			} catch (MinBalanceException e1) {
				
				System.out.println("Balance should be greater than 1000 "+e1);
			}		
			
			
			
	}

}
