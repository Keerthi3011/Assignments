package com.assignments.collections;
import java.util.Collections;
import java.util.Vector;

//practices the Vector and methods in it

public class VectorPractice 
{
	public static void main(String[] args) 
	{
		Vector <String> value = new Vector<>();
		value.add("Hello");						// inserting the elements in the vector
		value.add("Keerthika");
		value.add("hi");
		System.out.println(value);				// printing the elements from the vector
		
		System.out.println(value.elementAt(0)); // return the element located at the index of 0
		
		value.set(2, "java");					//replacing the element in index 2
		System.out.println(value);
		
		Object x = value.clone();				// getting the copy of vector to another variable
		System.out.println(x);
		
		System.out.println(value.contains(x));	// check whether the vector has all the elements from x variable
		
		Collections.reverse(value);				// reversing the vector
		System.out.println(value);
		
	}
}
