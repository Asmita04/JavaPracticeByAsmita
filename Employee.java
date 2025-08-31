class Employee{
String name; 
double salary;
int yearsOfService;
static int totalEmployees;

Employee(String name, double salary, int yearsOfService){
	this.name = name;
	this.salary = salary;
	this.yearsOfService = yearsOfService;
	totalEmployees++;
}

public void setName(String name){
	this.name = name;
}
public void setSalary(double salary){
	this.salary = salary;
}
public void setYearsOfService(int yearsOfService){
	this.yearsOfService = yearsOfService;
}

// getters

public String getName(){
	return name;
}
public double getSalary(){
	return salary;
}
public int getYearsOfService(){
	return yearsOfService;
}

public double calculateBonus(){
  if(yearsOfService > 5){
  	return (salary*5/100);
  }else{
  	return 0.0;
  }
} 

public static void showTotalEmployees(){
 System.out.println("Total Employees : " + totalEmployees);
}



public static void main(String[] args){

	Employee e1 = new Employee("Ravi",150000,6);
	Employee e2 = new Employee("Ankita",120000,3);
	Employee e3 = new Employee("Suresh",100000,8);
	
	System.out.println("Employee " + e1.getName() + " bonus is : " + e1.calculateBonus());
	
	System.out.println("Employee " + e2.getName() + " bonus is : " + e2.calculateBonus());
	
	System.out.println("Employee " + e3.getName() + " bonus is : " + e3.calculateBonus());

	showTotalEmployees();


}

}