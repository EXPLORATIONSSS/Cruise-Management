package com.vikrant.cruisedetails;

import java.time.LocalDate;

public class Passenger extends Cruise/*Inheriting Cruise class*/{
	private String pname;
	private String homeadd;
	private String pnationality;
	private LocalDate dob;
	
	/*default constructor*/
	public Passenger()
	{
		
	}
	/*Parameterised constructor*/
	public Passenger(String cruisename,LocalDate indate,LocalDate date,String departureport,String ArrivalPort,String cruise,String name,String address,String nationality,LocalDate dateofbirth,int numofpass)
	{
		super(cruisename,indate,date,departureport,ArrivalPort,cruise,numofpass);/*Initialising the parent class*/
		setPname(name);
		setHomeadd(address);
		setPnationality(nationality);
		setDob(dateofbirth);	
	}
	/*Getters and setters*/
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getHomeadd() {
		return homeadd;
	}
	public void setHomeadd(String homeadd) {
		this.homeadd = homeadd;
	}
	public String getPnationality() {
		return pnationality;
	}
	public void setPnationality(String pnationality) {
		this.pnationality = pnationality;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dateofbirth) {
		this.dob = dateofbirth;
	}
	
	@Override
	public String toString() {
		return "Passenger [pname=" + pname + ", homeadd=" + homeadd + ", pnationality=" + pnationality + ", dob=" + dob +"]\n"+ super.toString();
	}
	
	

}
