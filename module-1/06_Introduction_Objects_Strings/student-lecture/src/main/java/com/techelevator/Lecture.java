package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {
		
		int number = 10;
		boolean trueOrFalse= false;
		double amount= 2.56;
		
		String thisStringIsNull = null;
		
		String greeting = "Hello";
		Scanner in = new Scanner(System.in);
		
		int[] nums1 = new int[] {10, 20, 30, 40, 50};
		int[] nums2 = nums1;
		
		
		nums2[2] = 300;
		nums1[0] = 500;
	
		System.out.println("************************************");
		System.out.println("****** CREATING OBJECT ******");
		System.out.println("************************************");
	
		
		LegoPerson constructionWorker = new LegoPerson("Construction Worker", "blue", true);
		LegoPerson mailPerson = new LegoPerson("Mailperson", "orange", false);
		
		mailPerson.setClotingColor("yellow");
		constructionWorker.setHasHat(false);

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		String hello1 = "Hello";
		String hello2 = new String("Hello");
		
		if (hello1 == hello2) {
			System.out.println("They are equal");
		}
		
	
		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
	if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}
//
		/* So, to compare the values of two objects, we need to use the equals method.
//		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		
		String name1 = "John";
		String name2 = "John";
		
		//Value equality
		boolean areEqual = name1.equals(name2);
		
		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** STRING MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String str = "Tech Elevator";
		str.toUpperCase();
		//String strAsUpperCase = str.toUpperCase();
		
		//The results of String methods MUST be assigned to a variable.
		
		int length = str.length();
		char letter = str.charAt(3);
		
		String subStr = str.substring(2, 6);
		// substring modifier is inclusive at start, and exclusive at end.
		// If just beginning is given, end will fill in.
		
		boolean contains = str.contains("elevator");
		
		
		//Splits a string on a character into an array
		String strToSplit = "This is a String to split on the space";
		String[] parts = strToSplit.split(" ");
		
		
		String countDown = String.join("-->", "Five", "Four", "Three", "Two", "One");

		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		

	}
}
