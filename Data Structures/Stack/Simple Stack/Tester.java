package com.stack;

public class Tester {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		
		System.out.println(stack.push(16));
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
	}
}