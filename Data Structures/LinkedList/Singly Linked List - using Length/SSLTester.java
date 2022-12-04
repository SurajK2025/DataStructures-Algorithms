package com.SSLUsingPosition;

public class SSLTester {
	public static void main(String[] args) {
		SSL<Integer> linkedList1 = new SSL<>();
		SSL<String> linkedList2 = new SSL<>();
		
		linkedList1.insertAtEnd(51);
		linkedList1.insertAtEnd(55);
		linkedList1.insertAtEnd(65);
		linkedList1.insertAtEnd(71);
		linkedList1.insertAtEnd(78);
		
		System.out.println("Initial list: ");
		linkedList1.display();
		
		System.out.println("\nAfter Removing head node: ");
		linkedList1.removeFromBeginning();
		linkedList1.display();
		
		System.out.println("\nAfter Removing end node: ");
		linkedList1.removeFromEnd();
		linkedList1.display();
		
		System.out.println("\nInserting 91 at position 3: ");
		linkedList1.insertAtPosition(91, 3);
		linkedList1.display();
		
		System.out.println("\nInserting 69 at position 3: ");
		linkedList1.insertAtPosition(69, 3);
		linkedList1.display();
		
		System.out.println();
		linkedList2.insertAtEnd("One");
		linkedList2.insertAtEnd("Two");
		linkedList2.insertAtEnd("Three");
		
		linkedList2.display();
		
		System.out.println(linkedList1.searchByData(78));
		
		System.out.println("\nInserting 11 at position 0: ");
		linkedList1.insertAtPosition(11, 0);
		linkedList1.display();
		
		System.out.println("\nDeleting element at position 0:");
		linkedList1.deleteByPosition(0);
		linkedList1.display();
		
		System.out.println("\nDeleting element at position 4:");
		linkedList1.deleteByPosition(4);
		linkedList1.display();
		
		
	}
}
