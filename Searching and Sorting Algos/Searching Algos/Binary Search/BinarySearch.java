package com.searchingAlgos;

import java.util.Scanner;

public class BinarySearch {

	private static void binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length-1, mid=-1;
		
		while(low<=high) {
			mid = (low+high)/2;
			
			if(arr[mid] == key) {
				System.out.println("Element found at index "+mid);
				return;
			}
			else {
				if(arr[mid] > key)
					high = mid-1;
				else
					low = mid+1;
			}	
		}
		System.out.println("Element not found.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] intArray = {12, 24, 27, 35, 41, 60};
		System.out.println("Enter the element to be searched.");
		int n = sc.nextInt();
		binarySearch(intArray, n);
	}
}