package com.stack;

public class Stack {
	int[] stack;
	int top;
	int size;
	
	public Stack() {
		top = -1;
		size = 10;
		stack = new int[size];
	}
	
	public Stack(int size) {
		top = -1;
		this.size = size;
		stack = new int[size];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==size-1;
	}
	
	public boolean push(int data) {
		if(isFull()) return false;
		
		stack[++top] = data;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) return -999;
		return stack[top--];
	}
	
	public int peek() {
		if(isEmpty()) return -999;
		return stack[top];
	}
}