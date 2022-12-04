package com.stackImpl.usingSSL;

public class SSL<T> {
	Node<T> head;

	public void insertAtEnd(T data) {
		Node<T> newNode = new Node<>(data);

		if(head == null)
			head = newNode;
		else {
			Node<T> lastNode = head;
			while(lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
	}

	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);

		if(head == null)
			head = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void display() {
		Node<T> curNode;

		if(head == null)
			System.out.println("SSL is empty.");
		else {
			curNode = head;
			while(curNode.getNext() != null) {
				System.out.println(curNode.getData());
				curNode = curNode.getNext();

			}
			System.out.println(curNode.getData());
		}
	}

	public T removeFromEnd(){
		
		if(head == null)
			return null;

		else if(head.getNext() == null) {
			Node<T> temp = head;
			head = null;
			return (T) temp.getData();
		}
		
		else {
			Node<T> lastNode = head;
			Node<T> prevNode = head;
			
			while(lastNode.getNext() != null) {
				prevNode = lastNode;
				lastNode = lastNode.getNext();
			}
			prevNode.setNext(null);
			return (T) lastNode.getData();
		}
	}

	public T removeFromBeginning(){
		if(head == null)
			return null;
		
		else {
			Node<T> temp = head;
			head = head.getNext();
			return (T) temp.getData();
		}
	}

}







