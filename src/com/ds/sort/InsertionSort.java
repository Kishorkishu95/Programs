package com.ds.sort;

public class InsertionSort {

	public static void main(String[] args) {


		int a[] = {-10, -15, 10, 15, 8, 6, 7};
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex  < a.length; firstUnsortedIndex++){
			int newElement = a[firstUnsortedIndex];
			int i;
			for(i = firstUnsortedIndex; i > 0 && a[i-1] > newElement; i--){
				a[i] = a[i-1];
			}
			a[i] = newElement;
		}
		for(int i=0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
	}

}
