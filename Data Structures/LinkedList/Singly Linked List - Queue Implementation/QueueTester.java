package com.queueImpl.usingSSL;

public class QueueTester {
	public static void main(String[] args) {
		QueueImpl_SSL<Integer> queue = new QueueImpl_SSL<>();
		queue.enqueue(45);
		queue.enqueue(66);
		queue.enqueue(71);
		
		queue.displayQueue();
		
		System.out.println("Dequeue value: "+queue.dequeue());
		System.out.println("Dequeue value: "+queue.dequeue());
	}
}
