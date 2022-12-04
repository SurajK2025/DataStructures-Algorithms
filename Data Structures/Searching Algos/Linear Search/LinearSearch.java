package com.searchingAlgos;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = {2, 67, 5, 74, 10, 75, 14, 38, 79, 50};
		System.out.println("Enter the element to be searched.");
		int n = sc.nextInt();
		
		int count=0;
		for(int i : intArray) {
			if(i == n) 
				System.out.print(i+" found at index "+ count);
			count++;
		}
	}
}