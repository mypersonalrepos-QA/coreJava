package com.string;

public class stringBufferOperations {

	public static void main(String s[]) {
		
		reverseAString("Gokul Test");
	}
	
	/* Reverse a String */
	static void reverseAString(String str) {
		
		String string = new StringBuffer(str).reverse().toString();
		System.out.println(string);
	}


}
