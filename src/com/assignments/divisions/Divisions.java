package com.assignments.divisions;

public class Divisions 
{
	//creating a method for categorizing the average value of marks
	public String categorizing(int S1, int S2, int S3,int S4,int S5)
	{
		double average = (S1+S2+S3+S4+S5)/5;
		if (average >= 60) {
			return "First division";
		}
		else if(average > 49 && average < 60) {
			return "Second division";
		}
		else if(average > 39 && average < 50) {
			return "Third division";
		}
		else {
			return "Fail";
		}
	}
	public static void main(String[] args) 
	{
		Divisions obj = new Divisions();
		String output = obj.categorizing(65, 55, 80, 72, 57);
		System.out.println(output);
	}

}
