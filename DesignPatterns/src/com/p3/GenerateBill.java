package com.p3;

import java.io.IOException;
import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) throws IOException{
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of plan for which bill will be generated: ");
		Scanner sc = new Scanner(System.in);
		String planName = sc.next();
		
		System.out.println("Enter the number of units for bill will be calculated: ");
		int units = sc.nextInt();
		
		Plan p = planFactory.getPlan(planName);
		System.out.println("Bill amount for "+planName+" of "+units+" units is: ");
		p.getRate();
		p.calculateBill(units);
		sc.close();
	}

}
