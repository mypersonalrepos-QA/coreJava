package com.integer;

public class integerOperations {

	public static void main(String args[]) {
		
		integerOperations intOps = new integerOperations();
		intOps.reverseAnInteger("12345");
		intOps.findTheLargestOf3Numbers(10, 100, 30);
		intOps.swap2Numbers(5, 3);
		intOps.swap2NumbersWithout3rdVariable(51, 72);
	}
	
	/* Reverse an Integer */
	public void reverseAnInteger(String s) {
		
		int value = Integer.parseInt(s), reversedInteger = 0;
		
		while(value != 0) {
			int i = value % 10;
			reversedInteger = reversedInteger * 10 + i;
			value /= 10;
		}
		System.out.println(reversedInteger);
	}
	
	/* Find the Largest of 3 numbers */
	void findTheLargestOf3Numbers(int a, int b, int c) {
		
		int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(largest);
	}
	
	/* Swapping 2 Numbers */
	void swap2Numbers(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
	}
	
	/* Swapping 2 Numbers without using 3rd variable*/
	void swap2NumbersWithout3rdVariable(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
	}
}
