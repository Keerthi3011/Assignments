package com.assignments.comparatorPractice;

public class StudentInfo 
{
	String name;
	int rollNo;
	int age;
	public StudentInfo(String name, int rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", rollNo=" + rollNo + ", age=" + age + "]";
	}
}
