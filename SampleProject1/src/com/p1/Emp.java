package com.p1;

public class Emp extends EmpDet{
	String city;
	transient double sal;
	public Emp() {
		super();
	}
	public Emp(int id, String ename, String city, double sal) {
		super(id , ename);
		this.city = city;
		this.sal = sal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [city=" + city + ", sal=" + sal + ", eid=" + eid + ", ename=" + ename + "]";
	}
	
}
