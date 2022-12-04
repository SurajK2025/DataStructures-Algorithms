package com.doubleEndedQueue;

public class Tester {

	public static void main(String[] args) {
		DoubleEndedQueue queue = new DoubleEndedQueue(5);
		
		System.out.println(queue.insertAtEnd(12));
		System.out.println(queue.insertAtBeginning(11));
		System.out.println(queue.insertAtBeginning(10));
		System.out.println(queue.insertAtEnd(13));
		System.out.println(queue.insertAtEnd(14));
		
		System.out.println();
		System.out.println(queue.isFull());
		
		System.out.println(queue.removeFromFront());
		System.out.println(queue.removeFromEnd());
	}
}