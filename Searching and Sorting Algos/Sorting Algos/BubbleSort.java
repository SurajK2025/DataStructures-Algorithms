package com.sortingAlgos;

import java.util.Arrays;

public class BubbleSort {

	private static void bubbleSort(int[] intArray) {
		
		for(int i=0; i<intArray.length; i++) {
			
			for(int j=0; j<intArray.length-1; j++) {
				
				if(intArray[j]>intArray[j+1]) {
					int temp = intArray[j+1];
					intArray[j+1] = intArray[j];
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
