package com.ds.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {5, 3, 10, -8, 0, -7, 1};
		for(int lastUnsortedIndex=a.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
			for(int i=0; i<lastUnsortedIndex; i++){
				if(a[i] > a[i+1]){
					swap(a, i, i+1);
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

	public static  void swap(int a[], int i, int j){
		if(i == j){
			return;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		 	
	}
}
