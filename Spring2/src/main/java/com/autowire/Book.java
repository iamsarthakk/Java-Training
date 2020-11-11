package com.autowire;

public class Book {
	private String bookname;
	private int bookprice;
	
	public Book() {
		
	}
	public Book(String bookname, int bookprice) {
		super();
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	
}
