package com.assignments.collections;

import java.util.TreeSet;

// practice the TreeSet and its methods

public class TreeSetPractice 
{
	public static void main(String[] args) 
	{
		TreeSet <Integer> value  = new TreeSet<>();
		value.add(15);						// inserting the elements to the treeset
		value.add(21);
		value.add(50);
		value.add(36);
		value.add(2);
		System.out.println(value);
		System.out.println(value.higher(2));	// return the least element greater than given element 
		System.out.println(value.ceiling(15));	// return the least element greater or equal to the given element 
		System.out.println(value.first());		//  return the first element 
		System.out.println(value.floor(20));	// return the greatest element less than or equal to the given element
		System.out.println(value.lower(50));	// return the greatest element less than the given element
		System.out.println(value.toString());	// return the string representation of this collection
	}
}
