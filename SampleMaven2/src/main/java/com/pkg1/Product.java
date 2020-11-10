package com.pkg1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prodid")
	private int prodid;
	
	@Column(name="pname")
	private String pname;
	
	@Column(name="color")
	private String color;
	
	@Column(name = "rate")
    private double rate;

	public Product() {
		
	}
	public Product(int prodid, String pname, String color, double rate) {
		this.prodid = prodid;
		this.pname = pname;
		this.color = color;
		this.rate = rate;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Product [prodid=" + prodid + ", pname=" + pname + ", color=" + color + ", rate=" + rate + "]";
	}
}
