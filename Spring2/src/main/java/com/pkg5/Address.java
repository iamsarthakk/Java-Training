package com.pkg5;

public class Address {
	int hno;
	String locality, state;
	
	Address(){
		
	}
	public Address(int hno, String locality, String state) {
		this.hno = hno;
		this.locality = locality;
		this.state = state;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return locality;
	}
	public void setStreet(String street) {
		this.locality = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", locality=" + locality + ", state=" + state + "]";
	}
	
}
