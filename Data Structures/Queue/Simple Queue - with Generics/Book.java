package com.simpleQueue;

public class Book {
	
	private String name;
	private int ISBN;
	
	public Book() {
		super();
		name = "MyBook";
		ISBN = 100;	
	}
	
	public Book(String name,int ISBN) {
		this.name = name;
		this.ISBN = ISBN;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", ISBN=" + ISBN + "]";
	}
}