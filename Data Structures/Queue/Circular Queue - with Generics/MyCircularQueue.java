package com.circularQueue;

public class MyCircularQueue <T> {
	private int front, rear, size, count;
	private T[] myCircularQueue;

	MyCircularQueue() {
		front=rear=-1;
		size=10;
		count=0;
		myCircularQueue = (T[]) new Object[size];
	}

	MyCircularQueue(int size) {
		front=rear=-1;
		this.size=size;
		count=0;
		myCircularQueue = (T[]) new Object[size];
	}

	public void enqueue(T data) throws MyQueueException {
		if(front==-1)
			front=0;

		if(!isFull()) {
			rear = (rear+1) % myCircularQueue.length;
			myCircularQueue[rear] = data;
			count = count + 1;
		}
		else
			throw new MyQueueException("Queue is full.");
	}

	public T dequeue() throws MyQueueException {
		if(!isEmpty()) {
			T temp = myCircularQueue[front];
			front = (front+1) % myCircularQueue.length;
			count = count - 1;
			return temp;
		}
		else
			throw new MyQueueException("Queue is Empty.");
	}

	public void display() {
		if(!isEmpty()) {

			for(T queue:myCircularQueue) {
				if(queue!=null) 
					System.out.println(queue);
			}
		}
	}

	public T peek() throws MyQueueException {
		if(!isEmpty())
			return myCircularQueue[front];
		else
			throw new MyQueueException("Queue is Empty.");
	}

	public boolean isEmpty() {
		return count==0;
	}

	public boolean isFull() {
		return count==myCircularQueue.length;
	}
}
