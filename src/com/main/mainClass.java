package com.main;

public class mainClass {

	public static void main(String s[]) {
		
		findPalindrome("racecar");
	}
	
	static void findPalindrome(String str) {
		
		String string = new StringBuilder(str).reverse().toString();
		if(str.equals(string))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}
}
