package com.reverseStack;

public class MyQueue <T> {

	private int front, rear, size;
	private T[] queue;

	MyQueue() {
		front = rear = -1;
		size = 10;
		queue = (T[]) new Object[size]; 
	}

	MyQueue(int size) {
		front = rear = -1;
		this.size = size;
		queue = (T[]) new Object[size]; 
	}

	public boolean isEmpty() {
		return front==-1 || front>rear;
	}

	public boolean isFull() {
		return rear==queue.length-1;
	}
	
	public void display() {
		int temp = front;
		while(!isEmpty()) {
			System.out.println(queue[front]);
			front++;
		}
		front = temp;
	}

	public void enqueue(T data) {
		if(front==-1)
			front=0;

		if(!isFull()) {
			rear = rear+1;
			queue[rear] = data;
		}
		else
			return;
	}

	public T dequeue() {
		if(!isEmpty()) {
			T temp = queue[front];
			front = front + 1;
			return temp;
		}
		else
			return null;
	}
	
	public T peek() {
		if(!isEmpty())
			return queue[front];
		else
			return null;
	}
}