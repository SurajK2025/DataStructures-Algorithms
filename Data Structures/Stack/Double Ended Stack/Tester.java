package com.stackImpl7;

public class Tester {
	public static void main(String[] args) {
		DoubleEndedStack<Integer> stack = new DoubleEndedStack<>();
		System.out.println("<-- Bottom  Top -->");
		
		stack.insertAtTop(11);
		stack.insertAtTop(12);
		stack.insertAtTop(13);
		stack.display();
		
		System.out.println("\n\nInsert at bottom: 10");
		stack.insertAtBottom(10);
		stack.display();
		
		System.out.println("\n\nDelete from top: ");
		stack.deleteFromTop();
		stack.display();
		
		System.out.println("\n\nDelete from bottom: ");
		stack.deleteFromBottom();
		stack.display();
	}
}
