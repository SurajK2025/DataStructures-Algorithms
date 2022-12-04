package com.simpleQueue;

public class QueueTester {
	public static void main(String[] args) throws MyQueueException {
		System.out.println("Simple Queue: ");
		MyQueue<Book> myQueue = new MyQueue<>(5);

		try{
			myQueue.enqueue(new Book("Book1", 1001));
			myQueue.enqueue(new Book("Book2", 1002));
			myQueue.enqueue(new Book("Book3", 1003));
			myQueue.enqueue(new Book("Book4", 1004));
			System.out.println("\nDisplay queue contents: ");
			myQueue.display();
			
			System.out.println("\nRemoving data:");
			System.out.println(myQueue.dequeue());
			System.out.println(myQueue.dequeue());
			System.out.println(myQueue.dequeue());
			
			System.out.println("\nIs Queue empty? "+myQueue.isEmpty());
			
			System.out.println("\nDisplay queue contents: ");
			myQueue.display();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}