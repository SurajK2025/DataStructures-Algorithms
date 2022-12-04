package com.simpleQueue;

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

	public void enqueue(T data) throws MyQueueException {
		if(front==-1)
			front=0;

		if(!isFull()) {
			rear = rear+1;
			queue[rear] = data;
		}
		else
			throw new MyQueueException("Queue is full.");
	}

	public T dequeue() throws MyQueueException {
		if(!isEmpty()) {
			T temp = queue[front];
			front = front + 1;
			return temp;
		}
		else
			throw new MyQueueException("Queue is Empty.");
	}
	
	public T peek() throws MyQueueException {
		if(!isEmpty())
			return queue[front];
		else
			throw new MyQueueException("Queue is Empty.");
	}
}