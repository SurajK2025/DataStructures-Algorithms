package com.sortingAlgos;

class QuickSort {
	static int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low - 1); 
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	static void qSort(int arr[], int low, int high){
		if (low < high) {
			int pi = partition(arr, low, high);
			qSort(arr, low, pi - 1);
			qSort(arr, pi + 1, high);
		}
	}

	// Driver code
	public static void main(String args[]){
		int arr[] = { 4, 2, 6, 1, 2 };
		qSort(arr, 0, arr.length - 1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}