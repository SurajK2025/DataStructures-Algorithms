package com.reverseStack;

public class StringReverser {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<>();
		MyQueue<Integer> queue = new MyQueue<>();
		
		stack.push(44);
		stack.push(45);
		stack.push(46);
		stack.push(47);
		stack.push(48);
		
		queue.enqueue(stack.pop());
		queue.enqueue(stack.pop());
		queue.enqueue(stack.pop());
		queue.enqueue(stack.pop());
		queue.enqueue(stack.pop());
		
		queue.display();
	}

}
