package com.assignments.comparatorPractice;

import java.util.Comparator;

public class NameCompare implements Comparator<StudentInfo>
{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
