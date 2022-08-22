package com.assignments.collections;

import java.util.HashSet;

// practices the hashset and its methods

public class HashSetPractice 
{
	public static void main(String[] args) 
	{	// creating 2 hashset and inserting the elements in it
	
		HashSet<Integer> temp = new HashSet<>(); 
		temp.add(12);
		temp.add(5);
		temp.add(52);
		HashSet<Integer> value = new HashSet<>();
		value.add(15);
		value.add(21);
		value.add(50);
		value.add(36);
		value.add(2);
		System.out.println(value);
		
		System.out.println(value.equals(temp));	//check whether 2 hashset are equal or not
		value.addAll(temp);						// adding all the elements from temp to value
		System.out.println(value);
		value.clear();							// deleting all the elements from the hashset(value)
		System.out.println(value);
		
		
	}
}
