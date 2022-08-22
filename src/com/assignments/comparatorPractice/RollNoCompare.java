package com.assignments.comparatorPractice;

import java.util.Comparator;

public class RollNoCompare implements Comparator<StudentInfo>
{

	@Override
	public int compare(StudentInfo o1, StudentInfo o2) {
		if(o1.rollNo == o2.rollNo)
			return 0;
		else if(o1.rollNo>o2.rollNo)
			return 1;
		else
			return -1;
	}
	
}
