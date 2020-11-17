package com.p1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column
	private int bookid;
	@Column
	private String bookname;
	@Column
	private int price;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getBookid() {
		return bookid;
	}
}
