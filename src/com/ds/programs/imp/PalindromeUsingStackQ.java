package com.ds.programs.imp;

import java.util.LinkedList;

public class PalindromeUsingStackQ {

	public static void main(String[] args) {

		System.out.println(palindromeCheck("KISHU"));
	}

	private static boolean palindromeCheck(String string) {
		LinkedList<Character> queue = new LinkedList<Character>();
		LinkedList<Character> stack = new LinkedList<Character>();
		String lowerCaseString = string.toLowerCase();
		
		for(int i=0; i<lowerCaseString.length(); i++){  
			char c = lowerCaseString.charAt(i);
			if(c >= 'a' && c <= 'z'){
				stack.push(c);
				queue.addLast(c);
			}
		}
		while(!stack.isEmpty()){
			if(stack.pop().equals(queue.removeFirst())){
				return false;
			}
		}
		return true;

	}

}
