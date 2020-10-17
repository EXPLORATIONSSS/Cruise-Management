package com.vikrant.cruisedetails;
import java.time.LocalDate; 
import java.util.*;

public class Cruise {
	/*attributes Specific to Cruise class*/
	private
	String cruisename;
	LocalDate salingdate;
	LocalDate returnDate;
	PortDepNames depport;//Enum for Departure port
	PortArrivalNames arrivalport;//Enum for Arrival port
	int numofpass;
	public TicketCostFactory cruiseTicketCost;/*factory class call and aggregation*/
	
	public Cruise() {}
	/*Parameterised constructor*/
	public Cruise(String name,LocalDate indate,LocalDate date,String departureport,String ArrivalPort,String cruisetype,int numofpass)
	{
		setCruisename(name);
		setSalingdate(indate);
		setReturnDate(date);
		depport=PortDepNames.valueOf(departureport);
		arrivalport=PortArrivalNames.valueOf(ArrivalPort);
		cruiseTicketCost=new TicketCostFactory(cruisetype,numofpass);/*Factory class to create object based on cruisetype*/		
	}
	/*Getters and Settters*/

	public String getCruisename() {
		return cruisename;
	}
	public void setCruisename(String cruisename) {
		this.cruisename = cruisename;
	}
	public LocalDate getSalingdate() {
		return salingdate;
	}
	public void setSalingdate(LocalDate salingdate) {
		this.salingdate = salingdate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	/*To string method*/
	@Override
	public String toString() {
		return "Cruise cruisename=" + cruisename + " \nsalingdate=" + salingdate + " \nreturnDate=" + returnDate
				+ " \ndepport=" + depport + " \narrivalport=" + arrivalport + "\n" + cruiseTicketCost;
	}
	
}
