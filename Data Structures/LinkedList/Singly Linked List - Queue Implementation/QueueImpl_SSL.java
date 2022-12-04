package com.queueImpl.usingSSL;

public class QueueImpl_SSL<T> {
	
	SSL<T> linkedList = new SSL<>();
	
	public void enqueue(T data) {
		linkedList.insertAtEnd(data);
	}
	
	public T dequeue() {
		return (T) linkedList.removeFromBeginning();
	}
	
	public void displayQueue() {
		linkedList.display();
	}
}
