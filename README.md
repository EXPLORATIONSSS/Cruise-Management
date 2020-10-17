# Cruise-Management
First a package for cruise Details is created. The cruise class inside the package contains the private attributes such as cruise name, sailing date, return date, departure port, arrival port, number of passengers and an object of Ticketcost(Aggregation).The parameterised constructor are created along with the getters and setters for the class.Then the passenger class extends(Inheritance) the Cruise class is created with private attributes like passenger name, Home address, nationality, Date of birth and an object of cruise. Again, a parameterised constructor is created to initialise both the passenger and Cruise.
Enum is created for both the arrival port and Departure port used in cruise class.
There is a class for choosing the Cruise type according to which the cost will be calculated.
Ship is an interface with impelementation methods like setcabins, passenger capacity, shipweight and Totalcost. There are three implementation class for the interface. Luxury, Mainstream and expedition classes. All the three having private attributes weight and number of passengers.The number of cabins will be set based on cruise type. The passenger capacity will be using exception handing to check if number of passengers doesn’t exceed the capacity of selected cruise. Based on shipweight, docking fee will calculated. The totalcost will be calculated based on shipweight, number of passengers and the miscellaneous charges.

Factory class concept
There is a class called Ticket cost Factory which creates the object for one of these three class. Based on the cruisetype,Ticket cost Factory will create the object and calculate the total cost incurred and print the details of the cruise type. 
 
Singleton class concept.
Inorder to create a single instance for each passenger, singleton class was created with two public methods getpassenger and createpassenger. Getinstance is the public static method created to return the instance.
Dataload and Launch
Dataload class is used to load the 3 passenger details and Launch is used to have a view about on the client application created.
The Launch pattern just loads the data and displays the details of the passenger. 
