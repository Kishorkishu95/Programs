package com.java.strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		char[] str = " I am from  Tumakuru  ".toCharArray();
		int i = removeSpaces(str);
		System.out.println(String.valueOf(str).subSequence(0, i));
	}

	private static int removeSpaces(char[] str) {
		
		int count = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i]!=' ') {
				str[count++] =str[i];
			}
		}
		return count;
	}
	

}
