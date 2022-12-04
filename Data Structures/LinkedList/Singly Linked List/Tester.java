package com.singlyLinkedList;

public class Tester {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.insertAtBeginning(5);
		
//		System.out.println("Display: ");
		list.display();
		
		System.out.println();
		list.reverseLinks();
		list.display();
//		list.insertAtPosition(7, 100);
//		list.display();
		
		//System.out.println(list.removeFromPosition(6));
		
//		System.out.println("\nDisplay Reverse: ");
//		list.displayReverse();
//		
//		System.out.println();
//		list.searchByData(40);
		
//		System.out.println(list.removeFromBeginning());
//		System.out.println(list.removeFromEnd());
	}
}