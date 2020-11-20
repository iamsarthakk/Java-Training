package com.p1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpMain1 {
	
	public static void main(String args[]) {
			Emp eobj1 = new Emp(101, "Abhigyan","New Delhi", 200000.00);
			Emp eobj2 = new Emp(102, "Riaz","Mumbai", 300000.00);
			Emp eobj3 = new Emp(103, "Mukesh","Bengaluru", 100000.00);
			Emp eobj4 = new Emp(104, "Roshan","Channai", 300000.00);
			
			try {
				FileOutputStream fos = new FileOutputStream("emp2.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(eobj1);
				oos.writeObject(eobj2);
				oos.writeObject(eobj3);
				oos.writeObject(eobj4);
				oos.flush();
				oos.close();
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException ioe) {
				System.out.println("Its IOException");
				}
	}
}
