package com.ds.recursion;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.print(fibonacci(6));
	}
	private static int fibonacci(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 1;
		return fibonacci(n -1) + fibonacci(n - 2);
	}
}
