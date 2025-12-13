package com.string;

public class stringBufferOperations {

	public static void main(String s[]) {
		
		stringBufferOperations strOps = new stringBufferOperations();
		strOps.reverseAString("Gokul Test");
		strOps.checkPalindrome("racecar");
		strOps.stringConcat("Gokul ", "Sathya");
		strOps.countVowelsAndConstants("Java Programming");
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
	
	/* Concat a String */
	void stringConcat(String str, String appendStr) {
		str = new StringBuffer(str).append(appendStr).toString();
		System.out.println(str);
	}
	
	/* Count Vowels and Constants */
	void countVowelsAndConstants(String s) {
		char[] charArr = s.toLowerCase().toCharArray();
		int vowels = 0, constants = 0;
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'a' || charArr[i] == 'e' || charArr[i] == 'i' || charArr[i] == 'o' || charArr[i] == 'u')
				vowels++;
			else
				constants++;
		}
		System.out.println("vowels: " + vowels + ", constants: " + constants);
	}
}
