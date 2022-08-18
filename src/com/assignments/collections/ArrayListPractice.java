package com.assignments.collections;

import java.util.ArrayList;
import java.util.Collections;

// practices the Arraylist and methods in it

public class ArrayListPractice 
{
	public static void main(String[] args) 
	{
		// Arraylist
		ArrayList <Integer> value = new ArrayList<>();
		value.add(10);																	// inserting the elements to the arraylist
		value.add(20);
		value.add(75);
		value.add(51);
		value.add(63);
		
		System.out.println("The element at the index position 3 is "+value.get(3)); 	// accessing the element in the index position 3
		
		System.out.println("Displaying all the elements in the arraylist");
		for(int i :value) 																// printing all the elements in the arraylist using for each 
			System.out.print(i+" ");

		System.out.println("\nThe ArrayList is empty "+value.isEmpty()); 				// check is the arraylist i empty or not
		System.out.println("The index value of the element 63 is "+value.indexOf(63)); 	// get the index position of the value
		value.remove(4); 																// remove the element in the index 4
		
		System.out.println("Displaying all the elements in the arraylist after removing an element");
																						// printing all the elements in the arraylist after removing an element
		System.out.println(value);
		
		System.out.println("Maximum value in the arraylist is "+Collections.max(value));// returns the maximum value in the list
		System.out.println("Minimum value in the arraylist is "+Collections.min(value));// returns the minimum value in the list
	}

}
