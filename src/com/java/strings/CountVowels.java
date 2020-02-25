package com.java.strings;

public class CountVowels {

	public static void main(String[] args) {
		String str = "IndiaIndia";
		System.out.println("Count of Vowels = " +countVowels(str));

	}
	private static boolean isVowel(char ch) {
		ch= Character.toUpperCase(ch);
		return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
	}

	private static int countVowels(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
