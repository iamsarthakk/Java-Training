package com.pkg6;

import java.util.LinkedList;

import org.springframework.stereotype.Component;

@Component
public class EmpDao {
	LinkedList<Emp> empll;
	EmpDao(){
		empll = new LinkedList<Emp>();
	}
	
	public void addEmp(Emp e) {
		empll.add(e);
	}
	
	public void display() {
		for(int i=0;i<empll.size();i++) {
			System.out.println(empll.get(i));
		}
	}
}
