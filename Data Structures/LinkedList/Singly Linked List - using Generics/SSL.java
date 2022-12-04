package com.SLLImpl;

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
			while(curNode != null) {
				System.out.println(curNode.getData());
				curNode = curNode.getNext();
			}
		}
	}
	
	public void displayReverse(Node<T> node) {
		Node<T> temp = null;

		if(head == null)
			System.out.println("SSL is empty.");
		else {
			temp = head;
			while(temp.getNext() != node) {
				temp = temp.getNext();
			}
		}
		
		System.out.println(temp.getData());
		if(temp != head)
			displayReverse(temp);
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
			Node lastNode = head;
			Node prevNode = head;

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

	public void inserAtPosition(T data, int position) {
		if(position <= 0 || (head==null && position > 1)) {
			return;
		}
		
		Node<T> newNode = new Node<>(data);
		if(newNode == null)
			return;
		
		if(position == 0) {
			//insertAtBeginning(data);
			newNode.setNext(head);
			head = newNode;
			return;
		}
		
		Node<T> prev = head;
		for(int i=1; i < position; i++) {
			prev = prev.getNext();
			if(prev == null) {
				return;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return;
	}

}







