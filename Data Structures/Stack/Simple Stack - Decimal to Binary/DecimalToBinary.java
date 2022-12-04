package com.stackImpl6;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {

		MyStack<Integer> stack = new MyStack<>(500);

		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			
			//16
			while(num!=1 && num!=0) {
				stack.push(num%2); //0 0 0 0 
				num = num/2;	   //8 4 2 1
			}
			if(num == 1) {
				stack.push(1);	   //1
			}
				
			while(!stack.isEmpty()) {
				System.out.print(stack.pop());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
