package com.stackImpl1;

import java.util.List;

public class StackTester {
	public static void main(String[] args) {
		
		MyStack<String> myStack1 = new MyStack<>();
		
		myStack1.push("Suraj");
		myStack1.push("Prajwal");
		myStack1.push("Pankaj");
		myStack1.push("Arjun");
		myStack1.push("Aniket");
		myStack1.push("Swanand");
		
		System.out.println(myStack1.pop());
		System.out.println(myStack1.pop());
		
		System.out.println(myStack1.peek());
		
		System.out.println(myStack1.pop());
		System.out.println(myStack1.pop());
		System.out.println(myStack1.pop());
		System.out.println(myStack1.pop());
	
		System.out.println(myStack1.peek());
		
		
		
		
	}

}
