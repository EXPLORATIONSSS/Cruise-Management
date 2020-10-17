package com.vikrant.passengers;


import java.time.LocalDate;
/*Singleton class implementation to create a single object for a passenger*/

import com.vikrant.Application.Dataload;
import com.vikrant.cruisedetails.Passenger;
/*Singleton class implementation
 (Private constructor and instance that is private and static
 Getinstance method to acquire the private instance method) */
public class Addpassenger {
	private static Addpassenger instance=new Addpassenger();
	/*Dataload object is made private so that 
	it acts like an Utility class and aggreggation concept is implemented*/
	private static Dataload d=new Dataload();
	
	private Addpassenger() {}/*Private constructor*/
	public static Addpassenger getinstance()/*Method to return the instance*/
	{
		return instance;
	}
	
	public Passenger[] getPassengers()/*Method to display the passengers*/
	{
		return d.getPassengers();
	}
	
	/*when data is loaded create passenger method is called to instantiate the passenger data*/
	public Passenger createpassenger(String cruisename, LocalDate indate, LocalDate date, String departureport,
			String arrivalPort, String cruise, String name, String address, String nationality,
			LocalDate dateofbirth,int numofpass) 
	{
		Passenger p=new Passenger(cruisename, indate,date , departureport, arrivalPort,cruise,name,address,nationality,dateofbirth,numofpass);
		return p;
		
	}
	
}
