package com.autowire;

public class Categories {
	private String name;
	private Book bk;
	
	public Categories() {
		
	}
	public Categories(String name, Book bk) {
		this.name = name;
		this.bk = bk;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBk() {
		return bk;
	}
	public void setBk(Book bk) {
		this.bk = bk;
	}
	public void show() {
		System.out.println("Category name: "+name);
		System.out.println("Book name: "+bk.getBookname()+" and Book price: "+bk.getBookprice());
	}
	
}
