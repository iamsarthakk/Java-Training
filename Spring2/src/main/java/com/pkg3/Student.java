package com.pkg3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	int studid;
	String sname;
	double marks;
	@Autowired
	Course cobj;       //Autowire by name
	
	public Student() {
		
	}

	public Student(int studid, String sname, double marks) {
		this.studid = studid;
		this.sname = sname;
		this.marks = marks;

	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Course getCobj() {
		return cobj;
	}

	public void setCobj(Course cobj) {
		this.cobj = cobj;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", sname=" + sname + ", marks=" + marks + ", cobj=" + cobj + "]";
	}
}
