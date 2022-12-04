package com.stackImpl5;

import java.util.Scanner;

public class StringReverser {
	public static void main(String[] args) {

		MyStack<Character> stack = new MyStack<>(25);

		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter a string: ");
			String str = sc.nextLine();
			
			for(int i=0; i<str.length(); i++) {
				stack.push(str.charAt(i));
			}
			
			for(int i=0; i<str.length(); i++) {
				System.out.print(stack.pop());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
