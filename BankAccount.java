public class BankAccount{

	String holderName;
	double balance;
	static double interestRate;
	
	static{
		interestRate = 4.0;	
		System.out.println("Bank Interest Rate Initialized  " + interestRate +"%");
		
	}
	
BankAccount(String holderName, double balance){
	this.holderName = holderName;
	this.balance = balance;
}

//Setters
	public void setHolderName(String holderName){
		this.holderName = holderName;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}
	
//getters
	public String getHolderName(){
		return holderName;
	}
	
	public double getBalance(){
		return balance;
	}

public static void main(String[] args){

	
	BankAccount b1 = new BankAccount("Rohit",5000);
	BankAccount b2 = new BankAccount("Priya",15000);
	
	System.out.println("Account1: Name = " + b1.getHolderName() + " Balance = "+ b1.getBalance() + " Interest Rate = " + interestRate + "%");
	
	System.out.println("Account2: Name = " + b2.getHolderName() + " Balance = "+ b2.getBalance() + " Interest Rate = " + interestRate + "%");








}

}