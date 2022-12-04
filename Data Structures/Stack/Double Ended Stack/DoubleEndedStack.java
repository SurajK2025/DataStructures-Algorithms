package com.stackImpl7;

public class DoubleEndedStack<T> {
	private int rear; 	//top1
	private int front; 	//top2
	private int size;
	private T[] stack;

	DoubleEndedStack() {
		rear = -1;
		front = -1;
		this.size = 10;
		stack = (T[]) new Object[size];
	}

	DoubleEndedStack(int size) {
		rear = -1;
		front = -1;
		this.size = size;
		stack = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		return rear == -1 || front>rear;
	}

	public boolean isFull() {
		return rear == size-1;
	}

	public void rightShift() {
		int temp = rear;
		while(rear>=front) {
			queue[rear+1] = queue[rear];
			rear--;
		}
		rear = temp+1;
	}

	public void display() {
		int temp = front;
		while(!isEmpty()) {
			System.out.print(stack[front]+" ");
			front++;
		}
		front = temp;
	}

	public void insertAtTop(T data) {
		if(rear == -1) 
			front = front+1;

		if(!isFull()) {
			rear = rear+1;
			stack[rear] = data;
		}

	}

	public void insertAtBottom(T data) {
		if(front == -1) 
			front = front+1;

		if(!isFull()) {
			rightShift();
			stack[front] = data;
			rear++;
		}
	}

	public T deleteFromTop() {
		T temp = stack[rear];
		rear = rear-1;
		return temp;
	}

	public T deleteFromBottom() {
		T temp = stack[front];
		front = front + 1;
		return temp;
	}
}
