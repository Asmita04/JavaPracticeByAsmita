class Customer {
	String name;
	String ticketType;
	static int totalTicketsSold;
	
Customer(String name){
		this.name = name;
		this.ticketType = "Normal";
		totalTicketsSold++;
}
	
Customer(String name, String ticketType){
		this.name = name;
		this.ticketType = ticketType;
		totalTicketsSold++;
	}

//setters
public void setName(String name){
	this.name = name;
}

public void setTicketType(String seatType){
	this.ticketType = ticketType;
}


// getters
public String getName(){
	return name;
}

public String getTicketType(){
	return ticketType;
}


public static void showTotalTicketsBooked(){
 System.out.println("Total Students : " + totalTicketsSold);
}

public static void main(String[] args){

	Customer c1 = new Customer("Asmita");
	Customer c2 = new Customer("Pooja","Preminum");
	Customer c3 = new Customer("Amit");
	
	System.out.println("\nCustomer 1 :  Name : " + c1.getName()  + " Ticket: " + c1.getTicketType());
	System.out.println("\nCustomer 2 :  Name : " + c2.getName()  + " Ticket: " + c2.getTicketType());
	System.out.println("\nCustomer 3 :  Name : " + c3.getName()  + " Ticket: " + c3.getTicketType());


	showTotalTicketsBooked();
	



}


}