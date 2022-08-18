package com.assignments.collections;

import java.util.LinkedList;

//practices the LinkedList and methods in it

public class LinkedListPractice 
{
	public static void main(String[] args) 
	{
		LinkedList<Character> value = new LinkedList<>();
		value.add('a');						// inserting the elements to the linkedlist
		value.add('v');
		value.add('s');
		value.add('@');
		value.add('^');
		System.out.println(value);			// print the elements in linked list
		System.out.println(value.size());	// return the number of elements in the linkedlist
		System.out.println(value.getLast());// return last element of the lisked list
		System.out.println(value.getClass());// return the class name 
		System.out.println(value.poll());	//return the first element of the list
		value.push('*');					// push the element as the first element in the linkedlist
		System.out.println(value);
		System.out.println(value.peek());	// return the first element of the list
		
	}
}
