package com.ds.sort;

public class CountingSort {

	public static void main(String[] args) {
		int a[] = {2, 5, 8, 1, 10, 6, 7, 9, 5};
		
		countingSort(a, 1, 10);
		
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		
	}
	
	public static void countingSort(int input[], int min, int max){
		int countArr[] = new int[(max-min) + 1];
		for(int i=0; i < input.length; i++){
			countArr[input[i] - min]++;
		}
		int j = 0;
		for(int i=min; i <= max; i++){
			while(countArr[i - min] > 0){
				input[j++] = i;
				countArr[i - min]--;
			}
		}
	}

}
