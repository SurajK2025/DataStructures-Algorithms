package com.stackImpl4;

import com.stackImpl2.MyStackException;

public class MyStack<T>{

	private T[] stack;
	private int top,size;

	public MyStack (){
		top=-1;
		size=10;
		stack = (T[]) new Object[size]; 
	}

	public MyStack(int s) {
		top=-1;
		size=s;
		stack = (T[]) new Object[size]; 	
	}

	public boolean isEmpty() {
		return top==-1;
	}

	public boolean isFull() {
		return top==size-1;
	}

	public void push(T data) throws MyStackException {
		if(!isFull())
		{
			top=top+1;
			stack[top] = data;
		}
		else
			throw new MyStackException("Cannot push, Stack is Full!!!");
	}

	public T pop() throws MyStackException {
		if(!isEmpty())
		{
			T temp = stack[top];
			top=top-1;
			return temp;
		}
		else
			throw new MyStackException("Cannot pop, Stack is Empty!!!");
	}

	public T peek() throws MyStackException {
		if(!isEmpty())
			return stack[top];
		throw new MyStackException("Cannot peek, Stack is Empty");
	}

}
