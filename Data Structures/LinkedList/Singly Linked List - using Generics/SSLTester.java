package com.SLLImpl;

public class SSLTester {
	public static void main(String[] args) {
		SSL<Integer> linkedList1 = new SSL<>();
		SSL<String> linkedList2 = new SSL<>();
		
		linkedList1.insertAtEnd(51);
		linkedList1.insertAtEnd(55);
		linkedList1.insertAtEnd(65);
		linkedList1.insertAtEnd(71);
		linkedList1.insertAtEnd(78);
		
		linkedList1.displayReverse(null);
		
		System.out.println("Initial list: ");
		linkedList1.display();
		
		System.out.println("\nAfter Removing head node: ");
		linkedList1.removeFromBeginning();
		linkedList1.display();
		
		System.out.println("\nAfter Removing end node: ");
		linkedList1.removeFromEnd();
		linkedList1.display();
		
		System.out.println("\nInserting 69 at position 3: ");
		linkedList1.inserAtPosition(69, 3);
		linkedList1.display();
		
		System.out.println();
		linkedList2.insertAtEnd("One");
		linkedList2.insertAtEnd("Two");
		linkedList2.insertAtEnd("Three");
		
		linkedList2.display();
		
		System.out.println("\n71 found at index: "+linkedList1.searchByData(71));
	}
}
