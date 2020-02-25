package com.java.strings;

public class FindFirstCapChar {

	public static void main(String[] args) {
		String str = "i love Anusha";
		char ch = firstUpper(str);
		if(ch!=0)
			System.out.println("Found " + ch);
		else {
			System.out.println("Not Found Cap Character..");

		} 

	}

	private static char firstUpper(String str) {
		int i;
		for(i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		return 0;
	}

}
