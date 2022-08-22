package com.assignmets.comparablePractice;

import java.util.ArrayList;
import java.util.Collections;

public class CarParkingMain 
{
	public static void main(String[] args) 
	{
		ArrayList <CarParking> data = new ArrayList<>();
		data.add(new CarParking(5,"Ford","Lokesh"));
		data.add(new CarParking(1,"Toyota","Gowtham"));
		data.add(new CarParking(4,"Audi","Thulasi"));
		data.add(new CarParking(3,"BMW","Shahil"));
		data.add(new CarParking(7,"Nano","Srinivasan"));
		Collections.sort(data);
		
		for(CarParking i : data)
		{
			System.out.println(i.getCarName());
		}
		//System.out.println(data);
	}
}
