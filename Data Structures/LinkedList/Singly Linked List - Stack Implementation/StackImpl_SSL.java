package com.stackImpl.usingSSL;

public class StackImpl_SSL<T> {
	
	SSL<T> linkedList = new SSL<>();
	
	public void push(T data) {
		linkedList.insertAtEnd(data);
	}
	
	public T pop() {
		return (T) linkedList.removeFromEnd();
	}
	
	public T peep() {
		T temp = (T) linkedList.removeFromEnd();
		linkedList.insertAtEnd(temp);
		return temp;
	}
	
	public void displayStack() {
		linkedList.display();
	}
}
