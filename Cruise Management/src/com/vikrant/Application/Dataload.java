package com.vikrant.Application;

import java.time.LocalDate;

import com.vikrant.cruisedetails.Passenger;
import com.vikrant.passengers.Addpassenger;

public class Dataload {
	private static final int Total_passengers = 3;/*Refactoring it to make it global*/
	private static Passenger[] passengers=new Passenger[Total_passengers];
	
	/*Users are loaded using the createpassenger method in singleton addpassenger class 
	 and 3 users are created manually*/
	private static void loadUsers() {
		// TODO Auto-generated method stub
		passengers[0]= Addpassenger.getinstance().createpassenger("ShawkRighters",LocalDate.of(2015,5,24), LocalDate.of(2015,7,24), "NewOrleans", "NewYOrk","Luxury", "Raaghavi", "Aarohi Homes Ahmedabad", "Indian", LocalDate.of(1998,9,14),3);
		passengers[1]= Addpassenger.getinstance().createpassenger("TrailBlazers", LocalDate.of(2016,9,14), LocalDate.of(2016,11,16), "Beaumont", "Portarthur", "Mainstream", "Keerthi", "D-block vikramnagar Ahmedabad", "Australian", LocalDate.of(1975,12,15),5);
		passengers[2]= Addpassenger.getinstance().createpassenger("Rockingworld", LocalDate.of(2018,10,18), LocalDate.of(2018,12,18), "Houston", "GruiseFruiste", "Expedition", "Keerthana", "Hasthinapuram Chennai", "US", LocalDate.of(1988,12,1),7);
	}

	/*Load data method is used load Users*/
	public static void loadData()
	{
		loadUsers();
	}
	/*Method to return the passengers in array form*/
	public Passenger[] getPassengers() {
		return passengers;
	}
	
}
