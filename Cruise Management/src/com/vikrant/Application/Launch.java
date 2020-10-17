package com.vikrant.Application;

import com.vikrant.cruisedetails.Passenger;
import com.vikrant.passengers.Addpassenger;
/*This launch method is created to view the loaded data. This is the basic Client apllication 
 which will load the data and get the passengers in from Addpassenger get method*/
public class Launch {
	private static Passenger[] p;
	private static void loaddata() {
		Dataload.loadData();
		p=Addpassenger.getinstance().getPassengers();
		for(Passenger clients:p)
		{
			System.out.println(clients);
		}
	}
	public static void main(String args[])
	{
		loaddata();
	}
	
}
