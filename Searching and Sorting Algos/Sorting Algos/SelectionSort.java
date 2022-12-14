package com.sortingAlgos;

import java.util.Arrays;

public class SelectionSort {
	
	private static void selectionSort(int[] intArray) {
		for(int i=0; i<intArray.length-1; i++) {
			
			int index=i;
			for(int j=i+1; j<intArray.length; j++) {
				
				if(intArray[index] > intArray[j])
					index = j;
			}
			
			int temp = intArray[i];
			intArray[i] = intArray[index];
			intArray[index] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] intArray = {11, 91, 86, 79, 54};
		selectionSort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
}