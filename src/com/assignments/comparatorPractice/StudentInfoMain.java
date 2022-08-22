package com.assignments.comparatorPractice;

import java.util.ArrayList;
import java.util.Collections;

public class StudentInfoMain 
{
	public static void main(String[] args) 
	{
		ArrayList <StudentInfo> data = new ArrayList<>();
		data.add(new StudentInfo("Keerthika", 21, 521));
		data.add(new StudentInfo("Divya", 20, 525));
		data.add(new StudentInfo("Anupriya", 25, 520));
		data.add(new StudentInfo("Roshni", 23, 518));
		data.add(new StudentInfo("IndhuSree", 22, 536));
		
		Collections.sort(data, new RollNoCompare());
		for(StudentInfo i:data)
			System.out.println(i);
	}

}
