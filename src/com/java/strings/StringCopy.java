package com.java.strings;

public class StringCopy {

	public static void main(String[] args) {
		String str1 ="kishorAnusha";	
		char[] ch1 =str1.toCharArray();
		char[] ch2 = new char[ch1.length];
		stringCopy(ch1, ch2);
		System.out.println("ch1 = "+String.valueOf(ch1));

		System.out.println("ch2 = "+String.valueOf(ch2));
	}

	private static void stringCopy(char[] ch1, char[] ch2) {
		int i;
		for(i=0; i<ch1.length; i++) {
			ch2[i] = ch1[i];
		}
		
	}

}
