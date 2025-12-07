package com.string;

public class stringOperations {

	public static void main(String s[]) {
		
		System.out.println("Gokul");
		reverseAString("Gokul");
	}
	
	/* Reverse a String */
	static void reverseAString(String str) {
		
		String temp = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			temp+= str.charAt(i);
		}
		System.out.println(temp);
	}
	
	
}
