package com.doubleEndedQueue;

public class DoubleEndedQueue {
	int[] queue;
	int front, rear;
	int size;

	public DoubleEndedQueue() {
		size = 10;
		front = rear = -1;
		queue = new int[size];
	}

	public DoubleEndedQueue(int size) {
		this.size = size;
		front = rear = -1;
		queue = new int[size];
	}

	public boolean isFull() {
		return rear == size-1;
	}

	public boolean isEmpty() {
		return front>rear || front==-1;
	}
	
	public void rightShift() {
		int temp = rear;
		while(rear>=front) {
			queue[rear+1] = queue[rear];
			rear--;
		}
		rear = temp+1;
	}

	public boolean insertAtBeginning(int data) {
		if(isFull()) return false;
		if(front == -1) front++;

		rightShift();
		queue[front] = data;
		rear++;
		return true;
	}

	public boolean insertAtEnd(int data) {
		if(isFull()) return false;
		if(front == -1) front++;

		queue[++rear] = data;
		return true;
	}
	
	public int removeFromEnd() {
		if(isEmpty()) return -999;
		return queue[rear--];
	}
	
	public int removeFromFront() {
		if(isEmpty()) return -999;
		return queue[front++];
	}

}
