package com.vikrant.shiptype;

public class Mainstream implements Ship/*Interface implementation*/ {
	double weight;
	int numofpass;
	public Mainstream(double weight,int numofpass)
	{
		this.weight=weight;
		this.numofpass=numofpass;
	}
	public double setcabins() {
		
		return 15;
	}
	public int passengercapacity() {
		/*Exception Handling(to check if number of passengers doesn't exceed the limit)*/
		if(numofpass>9000)
		{
			throw new ArithmeticException("Passengers exceeded sorry: Choose some other cruise type");
		}
		return 9000;
	}
	public double shipweight() {
		double dockingFee;
		if (weight < 30000)
        {   dockingFee = 20000;
            return dockingFee;
        }
        if (weight > 30000 && weight < 50000)
        {   dockingFee = 50000;
            return dockingFee;
        }
        if (weight > 50000)
        {   dockingFee = 100000;
            return dockingFee;
        }
        else
        {
        	dockingFee=10000;
        	return dockingFee;
        }
	}	
	public double Totalcost()
	{
		double total;
		total=shipweight()+40000+numofpass*30000;//Docking fee+ miscellaneous charges+ number of passenger charges
		return total;
		
	}
	@Override
	public String toString() {
		return "Mainstream ship" + "\n" + "Passenger Capacity is" + passengercapacity() + "\n" + "Total cabins Available" + setcabins() +"\n";
	}
	

}