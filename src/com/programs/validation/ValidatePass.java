package com.programs.validation;

import java.util.Scanner;

public class ValidatePass {
	private static boolean checkSpecial(String st) {
		char[] ch = st.toCharArray();
		int charCountSpecial = 0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=32 && ch[i]<=47 || ch[i]>=58 && ch[i]<=64 || ch[i]>=91 && ch[i]<=96 || ch[i]>=123 && ch[i]<=126)
			charCountSpecial++;
		}
		if(charCountSpecial>=1) {
			return true;
		}
		return false;
		}
	private static boolean checkIntValue(String st) {
		char[] ch = st.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				count++;
			}
		}
		if(count>=1) {
			return true;
		}
		return false;
	}
	private static boolean checkUpperCase(String st) {
		char[] ch = st.toCharArray();
		int count=0;
		for(int i=0; i<ch.length;i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				count++;
			}
		}
		if(count>=1) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password to check : ");
		String pass = sc.nextLine();
		char[] ch = pass.toCharArray();
		int len = ch.length;
		if(len>=8 && len<=20) {
			boolean lenSpecial = checkSpecial(pass);
			boolean lenInt = checkIntValue(pass);
			boolean lenUpper = checkUpperCase(pass);
			
				if(lenUpper) {
					if(lenInt) {
						if(lenSpecial) {
						System.out.println("Entered Password is Valid!!");
						}
						else {
							System.out.println("Password should contain at least one special character");
							}
						}
					else {
						System.out.println("Password should contain at least one number");
					}
				}
				else {
					System.out.println("Password should contain at least one uppercase");
				}
			}
		
		else {
				System.out.println("Password should contain minimum 8 characters");
			}
		}
}
