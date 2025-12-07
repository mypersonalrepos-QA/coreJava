package com.string;

public class stringOperations {

	public static void main(String s[]) {
		
		stringOperations strOps = new stringOperations();
		strOps.reverseAString("Gokul");
		strOps.checkPalindrome("123mam21");
		
	}
	
	/* Reverse a String */
	void reverseAString(String str) {
		
		String temp = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			temp+= str.charAt(i);
		}
		System.out.println(temp);
	}
	
	/* Palindrome */
	void checkPalindrome(String str) {
		
		String temp = "";
		for(int i = str.length() -1; i >= 0; i--) {
			temp+= str.charAt(i);
		}
		if(str.equals(temp))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}
	
}
