package com.p8;

import java.util.Arrays;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Harry hacker", 35000);
		staff[1] = new Employee("Sonu sood", 33000);
		staff[2] = new Employee("Lucky Rocker", 65000);

		Arrays.sort(staff);
		for(int i=0;i<3;i++) {
			System.out.println(staff[i]);
		}
	}

}
