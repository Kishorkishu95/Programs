package com.ds.sort;

public class QuickSort {

	public static void main(String[] args) {

		int a[] = {5, -8, 7, 2, 10, 11, 6};
		quickSort(a, 0, a.length);
		
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void quickSort(int[] input, int start, int end){
		if(end - start < 2){
			return;
		}
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
		
	}

	private static int partition(int[] input, int start, int end) {
		// This is using the 1st element as pivot
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while(i < j){
			while(i < j && input[--j] >= pivot);
			if(i < j){
				input[i] = input[j];
			}
			while(i < j && input[++i] <= pivot);
			if(i < j){
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;
		return j;
	}

}
