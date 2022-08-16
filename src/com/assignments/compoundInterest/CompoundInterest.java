package com.assignments.compoundInterest;

// write a program to find the compound interest

public class CompoundInterest 
{
	// creating a method to find compound interest
	public double calculate(int p, int t, double r, int n) 
	{
        double amount = p * Math.pow(1 + (r / n), n * t);
        double result = amount - p;
        return result;
    }
	
	
    public static void main(String args[]) {
    	CompoundInterest obj = new CompoundInterest();
    	double output = obj.calculate(2000, 5, .08, 12);	// calling the method and input is given through argument
    	System.out.println("Compound interest = "+ output);
    }
}
