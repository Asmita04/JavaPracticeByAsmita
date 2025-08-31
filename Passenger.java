class Passenger{
	String name;
	int age;
	String seatType;
	static int totalTicketsBooked;
	
	Passenger(String name, int age){
		this.name = name;
		this.age = age;
		seatType = "General";
		totalTicketsBooked++;
	}
	
		Passenger(String name, int age, String seatType){
		this.name = name;
		this.age = age;
		this.seatType = seatType;
		totalTicketsBooked++;
	}

//setters
public void setName(String name){
	this.name = name;
}
public void setAge(int age){
	this.age = age;
}

public void setSeatType(String seatType){
	this.seatType = seatType;
}


// getters

public String getName(){
	return name;
}
public int getAge(){
	return age;
}
public String getSeatType(){
	return seatType;
}


public static void showTotalTicketsBooked(){
 System.out.println("Total Students : " + totalTicketsBooked);
}


public static void main(String[] args){

	Passenger p1 = new Passenger("Ravi",30);
	Passenger p2 = new Passenger("Asmita",24,"AC Sleeper");
	Passenger p3 = new Passenger("Akash",27);
	
	System.out.println("\nPassenger 1 :  Name : " + p1.getName() + " Age: " + p1.getAge() + " Seat: " + p1.getSeatType());
	System.out.println("\nPassenger 1 :  Name : " + p2.getName() + " Age: " + p1.getAge() + " Seat: " + p2.getSeatType());
	System.out.println("\nPassenger 1 :  Name : " + p3.getName() + " Age: " + p1.getAge() + " Seat: " + p3.getSeatType());
	
	showTotalTicketsBooked();

}


}