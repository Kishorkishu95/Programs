package com.java.strings;

public class CountConsonants {

	public static void main(String[] args) {
		String str = "Karnataka";
		System.out.println("Count is " + countConsonants(str));
	}

	private static int countConsonants(String str) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(isConsonant(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static boolean isConsonant(char ch) {
		ch = Character.toUpperCase(ch);
		return !(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') && ch>=65 && ch<=90;
	}

}
