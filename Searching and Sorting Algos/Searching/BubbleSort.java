package com.sortingAlgos;

import java.util.Arrays;

public class BubbleSort {

	private static void bubbleSort(int[] intArray) {
		
		for(int i=0; i<intArray.length-1; i++) {
			
			for(int j=i+1; j<intArray.length; j++) {
				
				if(intArray[i]>intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] intArray = {62, 55, 71, 28, 23, 89, 15};
		bubbleSort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
}