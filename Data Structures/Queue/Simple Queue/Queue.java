package com.queue;

public class Queue {
	int[] queue;
	int front, rear;
	int size;
	
	public Queue() {
		front = rear = -1;
		size = 10;
		queue = new int[size];
	}
	
	public Queue(int size) {
		front = rear = -1;
		this.size = size;
		queue = new int[size];
	}
	
	public boolean isFull() {
		return rear == size-1;
	}
	
	public boolean isEmpty() {
		return front==-1 || front>rear;
	}
	
	public boolean enqueue(int data) {
		if(isFull()) return false;
		if(front == -1) front = 0;
		
		queue[++rear] = data;
		return true;
	}
	
	public int dequeue() {
		if(isEmpty()) return -999;
		
		return queue[front++];
	}
}