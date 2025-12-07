package com.string;

public class stringBuilderOperations {

	public static void main(String s[]) {
		
		stringBuilderOperations strOps = new stringBuilderOperations();
		strOps.reverseAString("Test");
		strOps.checkPalindrome("123Gokul");
		strOps.stringConcat("Gokul ", "Sathya");
	}
	
	/* Reverse a String */
	void reverseAString(String str) {
		
		String string = new StringBuilder(str).reverse().toString();
		System.out.println(string);
	}
	
	/* Palindrome */
	void checkPalindrome(String str) {
		
		String temp = new StringBuilder(str).reverse().toString();
		if(str.equals(temp))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}
	
	/* Concat a String */
	void stringConcat(String str, String appendStr) {
		str = new StringBuilder(str).append(appendStr).toString();
		System.out.println(str);
	}
}
