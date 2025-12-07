package com.string;

public class stringBuilderOperations {

	public static void main(String s[]) {
		
		reverseAString("Test");
	}
	
	/* Reverse a String */
	static void reverseAString(String str) {
		
		String string = new StringBuilder(str).reverse().toString();
		System.out.println(string);
	}
}
