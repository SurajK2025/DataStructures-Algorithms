package com.cll;

public class CircularLinkedList {
	Node head;

	public boolean insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			head.setNext(head);
			return true;
		}

		Node temp = head;
		while(temp.getNext()!=head) {
			temp = temp.getNext();
		}
		newNode.setNext(head);
		temp.setNext(newNode);
		head = newNode;
		return true;
	}

	public boolean insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			head.setNext(head);
			return true;
		}

		Node temp = head;
		while(temp.getNext()!=head) {
			temp = temp.getNext();
		}
		temp.setNext(newNode);
		newNode.setNext(head);
		return true;
	}

	public int removeFromEnd() {
		if(head == null) return -999;

		Node temp = head, prev = head;
		while(temp.getNext()!=head) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(head);
		return temp.getData();
	}

	public int removeFromBeginning() {
		if(head == null) return -999;

		int data = head.getData();
		Node temp = head;
		while(temp.getNext()!=head) {
			temp = temp.getNext();
		}
		temp.setNext(head.getNext());
		head = head.getNext();
		return data;
	}

	public void display() {
		if(head == null) return;

		Node temp = head;
		while(temp.getNext()!=head) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}

	public void displayReverse() {
		if(head == null) return;

		Node temp = head, end = null;
		while(end!=head) {
			end = temp;
			temp = head;
			while(temp.getNext()!=end) {
				temp = temp.getNext();
			}
			System.out.println(temp.getData());
			end = temp;
		}
	}

	//Positions<0 are treated as beginningInsertions and positions>size are treated as endInsertion.
	//Positions are considered as zero based here.
	public boolean insertAtPosition(int position, int data) {
		Node newNode = new Node(data);
		if(head == null || position <=0) {
			insertAtBeginning(data);
			return true;
		}

		int count = 0;
		Node temp = head, prev = head;
		while(position>count && temp.getNext()!=head) {
			prev = temp;
			temp = temp.getNext();
			count++;
		}
		prev.setNext(newNode);
		newNode.setNext(temp);
		return true;
	}

	public int removeFromPosition(int position) {
		if(head == null) return -999;

		if(position <=0) return removeFromBeginning();

		int count = 0;
		Node temp = head, prev = head;
		while(position>count && temp.getNext()!=head) {
			prev = temp;
			temp = temp.getNext();
			count++;
		}
		prev.setNext(temp.getNext());
		return temp.getData();
	}

	public void reverseLinks() {
		if(head == null) return;
		
		Node temp = head, end = null, prev, newHead = null;
		while(end != head) {
			prev = null;
			end = temp;
			temp = head;
			while(temp.getNext() != end) {
				prev = temp;
				temp = temp.getNext();
			}
			if(temp.getNext()==head) {
				newHead = temp;
			}
			
			temp.setNext(prev);
			end = temp;
		}
		
		head = newHead;
		
		if(temp.getNext() == null) {
			temp.setNext(head);
		}
	}
	
	//Search indexes are zero based
	public void searchByData(int data) {
		if(head == null) return;
		
		Node temp = head;
		int count = 0;
		while(temp.getNext()!=head) {
			if(temp.getData() == data) {
				System.out.println("Element fount at index: "+count);
				return;
			}
			temp = temp.getNext();
			count++;
		}
		if(temp.getData() == data) {
			System.out.println("Element fount at index: "+count);
			return;
		}
		System.out.println("Element not found.");
	}
}
