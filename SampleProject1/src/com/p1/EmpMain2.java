package com.p1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpMain2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Emp empobj = new Emp();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("emp2.dat");
			ois = new ObjectInputStream(fis);
			System.out.println("List of Employees");
			while((empobj=(Emp)ois.readObject())!=null) {
				System.out.println(empobj);
			}
		}catch(EOFException exp) {
			System.out.println("End of File Reached");
		}
	}

}
