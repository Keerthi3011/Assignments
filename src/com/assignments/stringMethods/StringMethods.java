package com.assignments.stringMethods;

// practices the methods in string 

public class StringMethods {

	public static void main(String[] args) {

		String name1 = "Keerthika";
		System.out.println(name1.length()); // get the length of the string
		System.out.println(name1.compareTo("keerthi")); // compare one string with another
		System.out.println(name1.hashCode()); // print the hash code value of the string
		
		String name2 = "kEERTHIKA";
		System.out.println(name1.equals(name2)); // check whether two strings are equal or not(case sensitive)
		System.out.println(name1.equalsIgnoreCase(name2));// check whether two strings are equal or not(not case sensitive)
		
	}

}
