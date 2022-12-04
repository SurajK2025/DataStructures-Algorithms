package com.queue;

public class Tester {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
		queue.enqueue(15);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		System.out.println(queue.enqueue(16));
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}