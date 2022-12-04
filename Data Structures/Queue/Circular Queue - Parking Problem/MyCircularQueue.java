package com.queueImpl2;

public class MyCircularQueue{
	private int front, rear, size, count;
	private int queue[];

	MyCircularQueue() {
		front=rear=-1;
		size=10;
		count=0;
		queue = new int[size];
	}

	MyCircularQueue(int size) {
		front=rear=-1;
		this.size=size;
		count=0;
		queue = new int[size];
	}

	public void enqueue(int data) throws MyQueueException {
		if(front==-1)
			front=0;

		if(!isFull()) {
			rear = (rear+1) % size;
			queue[rear] = data;
			count = count + 1;
		}
		else
			throw new MyQueueException("Queue is full.");
	}

	public int dequeue() throws MyQueueException {
		if(!isEmpty()) {
			int temp = queue[front];
			queue[front] = 0;
			front = (front+1) % size;
			count = count - 1;
			return temp;
		}
		else
			throw new MyQueueException("Queue is Empty.");
	}

	public int peek() throws MyQueueException {
		if(!isEmpty())
			return queue[front];
		else
			throw new MyQueueException("Queue is Empty.");
	}

	public boolean isEmpty() {
		return count==0;
	}

	public boolean isFull() {
		return count==size;
	}

	public void display() {
		int tempFront=front, tempCount=count;
		while(!isEmpty()) {
			System.out.println(queue[front]);
			front = (front+1) % size;
			count--;
		}
		front = tempFront;
		count = tempCount;
	}
}
