package com.string;

public class stringBufferOperations {

	public static void main(String s[]) {
		
		stringBufferOperations strOps = new stringBufferOperations();
		strOps.reverseAString("Gokul Test");
		strOps.checkPalindrome("racecar");
	}
	
	/* Reverse a String */
	void reverseAString(String str) {
		
		String string = new StringBuffer(str).reverse().toString();
		System.out.println(string);
	}

	/* Palindrome */
	void checkPalindrome(String str) {
		
		String temp = new StringBuffer(str).reverse().toString();
		if(str.equals(temp))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}
}
