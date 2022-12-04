package com.stackImpl.usingSSL;

public class StackTester {
	public static void main(String[] args) {
		StackImpl_SSL<Integer> stack = new StackImpl_SSL<>();
		stack.push(45);
		stack.push(66);
		stack.push(71);
		
		stack.displayStack();
		System.out.println("Peeped value: "+stack.peep());
		
		System.out.println("\nPopped value: "+stack.pop());
		System.out.println("Popped value: "+stack.pop());
	}
}
