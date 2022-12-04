package com.singlyLinkedList;

public class SinglyLinkedList {
	Node head;

	public boolean insertAtBeginning(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			return true;
		}

		newNode.setNext(head);
		head = newNode;
		return true;
	}

	public boolean insertAtEnd(int data) {
		Node newNode = new Node(data);

		if(head == null) {
			head = newNode;
			return true;
		}

		Node temp = head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}

		temp.setNext(newNode);
		return true;
	}

	public int removeFromBeginning() {
		if(head == null) return -999;

		Node temp = head;
		head = head.getNext();
		return temp.getData();
	}

	public int removeFromEnd() {
		if(head == null) return -999;

		Node temp = head, prev = head;
		if(head.getNext()==null) {
			head = null;
			return temp.getData();
		}

		while(temp.getNext()!=null) {
			prev = temp;
			temp = temp.getNext();
		}
		prev.setNext(null);
		return temp.getData();
	}

	public void display() {
		if(head == null) return;

		Node temp = head;
		while(temp.getNext() != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}
		System.out.print(temp.getData());
	}

	public void displayReverse() {
		if(head == null) return;

		Node temp = head, end = null;
		while(end != head) {
			while(temp.getNext() != end) {
				temp = temp.getNext();
			}
			System.out.print(temp.getData()+" ");
			end = temp;
			temp = head;
		}
	}
	
	public void reverseLinks() {
		if(head == null) return;
		
		Node temp = head, end = null, prev, newHead = null;
		while(end != head) {
			prev = null;
			while(temp.getNext() != end) {
				prev = temp;
				temp = temp.getNext();
			}
			if(temp.getNext()==null) {
				newHead = temp;
			}
			
			temp.setNext(prev);
			end = temp;
			temp = head;
		}
		
		head = newHead;
	}

	//Search indexes are zero based.
	public boolean searchByData(int data) {
		if(head == null) return false;
		
		Node temp = head;
		int count=0;
		while(temp.getNext()!=null) {
			if(temp.getData() == data) {
				System.out.println("Element found at index: "+count);
				return true;
			}
			temp = temp.getNext();
			count++;
		}
		if(temp.getData() == data) {
			System.out.println("Element found at index: "+count);
			return true;
		}
		return false;
	}

	//Positions<0 are treated as beginningInsertions and positions>size are treated as endInsertion.
	//Positions are considered as zero based here.
	public boolean insertAtPosition(int position, int data) {
		
		if(head == null) { 
			insertAtBeginning(data);
			return true;
		}
		
		Node newNode = new Node(data);
		int count = 0;
		Node temp = head, prev = head;
		
		if(position<=count) {
			insertAtBeginning(data);
			return true;
		}
		
		while(position>count && temp!=null) {
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
		
		Node temp = head, prev = head;
		int count=0;
		
		if(position <= 0) {
			removeFromBeginning();
			return temp.getData();
		}
		
		while(position>count && temp.getNext()!=null) {
			prev = temp;
			temp = temp.getNext();
			count++;
		}
		prev.setNext(temp.getNext());
		return temp.getData();
	}
}