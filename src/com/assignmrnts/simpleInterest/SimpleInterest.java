package com.assignmrnts.simpleInterest;

// Write a program to calculate simple interest

public class SimpleInterest 
{
	// creating a method to find simple interest
		public double findSimpleInterest(int p, int n, int r )
		{
			double result = (p*n*r)/100;
			return result;
		}

		public static void main(String[] args) 
		{
			SimpleInterest f = new SimpleInterest(); 
			double output = f.findSimpleInterest(5000, 4, 3);  // calling the method and input is given through argument
			System.out.println("Simple interest = "+output);
		}
}
