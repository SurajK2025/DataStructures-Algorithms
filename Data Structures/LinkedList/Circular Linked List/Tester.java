package com.cll;

public class Tester {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertAtEnd(30);
		cll.insertAtBeginning(20);
		cll.insertAtBeginning(10);
		cll.insertAtEnd(40);
		cll.insertAtPosition(2, 25);
		cll.display();
		
		System.out.println();
		cll.searchByData(30);
		
//		System.out.println();
//		cll.reverseLinks();
//		cll.display();
		
//		System.out.println();
//		cll.displayReverse();
		
//		System.out.println();
//		cll.removeFromBeginning();
//		cll.display();
//		
//		System.out.println();
//		cll.removeFromEnd();
//		cll.display();
		
//		System.out.println();
//		cll.removeFromPosition(2);
//		cll.display();
	}
}