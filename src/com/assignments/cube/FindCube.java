package com.assignments.cube;

//Write a program to calculate cube, input will be sent through method arguments

public class FindCube 
{
	// creating a method to find cube value
	public int cube(int value)
	{
		int result = value*value*value;
		return result;
	}

	public static void main(String[] args) 
	{
		FindCube f = new FindCube(); 
		int output = f.cube(5);  // calling the method and input is given through argument
		System.out.println("cube value = "+output);
	}

}
