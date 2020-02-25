package com.ds.sort;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = {5, 1, -2, 0, 8, 9, 4};
		for(int lastUnsortedIndex = a.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
			int largest = 0;
			for(int i=1; i<=lastUnsortedIndex; i++){
				if(a[i] > a[largest]){
					largest = i;
				}
			}
			swap(a, largest, lastUnsortedIndex);
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void swap(int a[], int i, int j){
		if(i == j){
			return;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}

}
