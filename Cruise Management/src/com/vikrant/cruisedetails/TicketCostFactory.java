package com.vikrant.cruisedetails;

import com.vikrant.shiptype.Expedition;
import com.vikrant.shiptype.Luxury;
import com.vikrant.shiptype.Mainstream;
import com.vikrant.shiptype.Ship;
/*Factory class to create the object based on the cruise type and to check if numofpassengers doesnt exceed the limit*/
public class TicketCostFactory  {
	String shipname;
	double cost;
	Ship type;
	int numofpass;
	public TicketCostFactory(String shipname,int numofpass)
	{
		this.shipname=shipname;
		this.numofpass=numofpass;
		if(shipname.equals("Luxury"))
		{
			type=new Luxury(90000,numofpass);
			cost=((Luxury) type).Totalcost();
		}
		else if(shipname.equals("Mainstream"))
		{
			type=new Mainstream(45000,numofpass);
			cost=((Mainstream) type).Totalcost();
		}
		else
		{
			type=new Expedition(41000,numofpass);
			cost=((Expedition) type).Totalcost();
		}
			
	}
	
	@Override
	public String toString() {
		return "TicketCostFactory [shipname=" + shipname + ", cost=" + cost + ", type=" + type + "]";
	}
	
}
