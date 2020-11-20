package com.p1.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int id; 
	int balty;
	String pname, pcolor;
	double prate;
	public Product() {
		
	}
	public Product(int balty, String pname, String pcolor, double prate) {

		this.balty = balty;
		this.pname = pname;
		this.pcolor = pcolor;
		this.prate = prate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalty() {
		return balty;
	}
	public void setBalty(int balty) {
		this.balty = balty;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcolor() {
		return pcolor;
	}
	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}
	public double getPrate() {
		return prate;
	}
	public void setPrate(double prate) {
		this.prate = prate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", balty=" + balty + ", pname=" + pname + ", pcolor=" + pcolor + ", prate=" + prate
				+ "]";
	}
	
}
