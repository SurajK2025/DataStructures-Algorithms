package com.reverseStack;

public class MyStack<T>{
	
	private T [] stack;
	private int top,size;
	
	public MyStack (){
		top = -1;
		size = 10;
		stack = (T[]) new Object [size]; 
	}
	
	public MyStack(int s) {
		top = -1;
		size = s;
		stack = (T[]) new Object [size]; 	
	}
	
	public void display() {
		
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}
	
	public void push(T data) {
		if(isFull()==false)
		{
			top = top + 1;
			stack[top] = data;
		}
		else
			System.out.println("Stack is Full");
	}
	
	public T pop() {
		if(isEmpty()==false)
		{
			T temp = stack[top];
			top = top - 1;
			return temp;
		}
		else
			return null;
	}
	
	public T peek() {
		if(isEmpty()==false)
			return stack[top];
		return null;
	}
	
	public void reverseStack() {
		
	}
}