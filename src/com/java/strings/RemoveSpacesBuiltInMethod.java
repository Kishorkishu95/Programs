package com.java.strings;

public class RemoveSpacesBuiltInMethod {

	public static void main(String[] args) {
		String str = " I am  from  Karnataka ";
		System.out.println(removeWhiteSpaces(str));
	}

	private static String removeWhiteSpaces(String str) {
		String str2 = str.replaceAll("\\s", "");
		return str2;
	}
	

}
