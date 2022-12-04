package com.circularQueue;

public class CircularQueueTester {
	public static void main(String[] args) throws MyQueueException {
		System.out.println("Circular Queue: ");
		MyCircularQueue<Book> circularQueue = new MyCircularQueue<>(10);

		try{
			circularQueue.enqueue(new Book("Book1", 1001));
			circularQueue.enqueue(new Book("Book2", 1002));
			circularQueue.enqueue(new Book("Book3", 1003));
			circularQueue.enqueue(new Book("Book4", 1004));
			
			circularQueue.display();
			
			System.out.println(circularQueue.dequeue());
			System.out.println(circularQueue.dequeue());
			System.out.println(circularQueue.dequeue());
			
			System.out.println("\nIs Circular Queue empty? "+circularQueue.isEmpty());
			
			circularQueue.enqueue(new Book("Book1", 1001));
			circularQueue.enqueue(new Book("Book2", 1002));
			circularQueue.enqueue(new Book("Book3", 1003));
			circularQueue.enqueue(new Book("Book11", 1011));
			circularQueue.enqueue(new Book("Book12", 1012));
			circularQueue.enqueue(new Book("Book13", 1013));
			
			System.out.println(circularQueue.dequeue());
			System.out.println(circularQueue.dequeue());
			System.out.println(circularQueue.dequeue());
			System.out.println(circularQueue.dequeue());
			System.out.println(circularQueue.dequeue());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}