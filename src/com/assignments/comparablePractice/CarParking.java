package com.assignments.comparablePractice;

public class CarParking implements Comparable<CarParking>
{
	private int parkingSlot;
	private String carName;
	private String carOwner;
	
	public int getParkingSlot() 
	{ 
		return parkingSlot; 
	} 
	public void setParkingSlot(int parkingSlot) 
	{ 
		this.parkingSlot = parkingSlot; 
	} 
	public String getCarName() 
	{ 
		return carName; 
	}
	public void setCarName(String carName) 
	{ 
		this.carName = carName; 
	} 
	public String getCarOwner() 
	{ 
		return carOwner; 
	} 
	public void setCarOwner(String carOwner) 
	{ 
		this.carOwner = carOwner; 
	}
	  
	public CarParking() {}
	@Override
	public String toString() {
		return "CarParking [parkingSlot=" + parkingSlot + ", carName=" + carName + ", carOwner=" + carOwner + "]";
	}
	
	
	  
	 
	public CarParking(int parkingSlot, String carName, String carOwner) {
		super();
		this.parkingSlot = parkingSlot;
		this.carName = carName;
		this.carOwner = carOwner;
	}
	@Override
	public int compareTo(CarParking o) {
		return carName.compareTo(o.carName);
		
	}	
	
	
}
