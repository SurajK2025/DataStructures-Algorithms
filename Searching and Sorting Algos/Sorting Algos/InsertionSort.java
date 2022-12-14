package com.sortingAlgos;

import java.util.Arrays;

public class InsertionSort {
	
	private static void insertionSort(int[] intArray) {
		for(int i=1; i<intArray.length; i++ ) {
			
			int element = intArray[i];
			int j = i-1;
			
			while(j >=0 && element < intArray[j]) {
				intArray[j+1] = intArray[j];
				j = j-1;
			}
			intArray[j+1] = element;
		}
	}

	public static void main(String[] args) {
		int[] intArray = {9, 83, 68, 55, 24, 71, 49};
		insertionSort(intArray);
		System.out.println(Arrays.toString(intArray));
	}
}