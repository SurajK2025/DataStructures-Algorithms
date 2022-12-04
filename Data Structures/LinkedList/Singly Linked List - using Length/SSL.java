package com.SSLUsingPosition;

public class SSL<T> {
	Node<T> head;
	int length=0;

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
		length++;
	}

	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node<>(data);

		if(head == null)
			head = newNode;
		else {
			newNode.setNext(head);
			head = newNode;
		}
		length++;
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
			length--;
			return (T) temp.getData();
		}

		else {
			Node lastNode = head;
			Node prevNode = head;

			while(lastNode.getNext() != null) {
				prevNode = lastNode;
				lastNode = lastNode.getNext();
			}
			prevNode.setNext(null);
			length--;
			return (T) lastNode.getData();
		}
	}

	public T removeFromBeginning(){
		if(head == null)
			return null;

		else {
			Node<T> temp = head;
			head = head.getNext();
			length--;
			return (T) temp.getData();
		}
	}

	public int searchByData(T data) {
		int count = -1;
		Node<T> curNode = head;

		if(head == null) 
			return -999;
		while(curNode.getNext()!= null) {
			count++;
			if(curNode.getData()==data) {
				return count;
			}
			else {
				curNode = curNode.getNext();
			}
		}
		if(curNode.getData()==data) {
			count++;
			return count;
		}
		return -8888;
	}

	public void insertAtPosition(T data, int position) {
		if(position < 0 || position > length)
			return;

		Node<T> newNode = new Node<>(data);
		if(newNode == null)
			return;

		if(position == 0 ) {
			if(head == null)
				head = newNode;
			else {
				newNode.setNext(head);
				head = newNode;
			}
			length++;
			return;
		}

		Node<T> temp = head;
		for(int i=1; i<position; i++) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);

		length++;
	}

	public T deleteByPosition(int position) {

		if(position < 0 || position > length)
			return null;

		Node<T> temp = head;
		if(position == 0) {
			if(head != null) {
				head = head.getNext();
				return (T) temp.getData();
			}
			else {
				return null;
			}
		}

		else {
			for(int i=1; i<position; i++) {
				temp = temp.getNext();
			}
			Node<T> deletedNode = temp.getNext();
			temp.setNext(null);
			return (T) deletedNode.getData();
		}
	}
}









