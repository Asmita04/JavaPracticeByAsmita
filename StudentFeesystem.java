public class StudentFeesystem{ 

	String name;
	String Class;
	static int tuitionFee;
	
	static{
		tuitionFee = 30000;	
		System.out.println("School Tuition Fee Initialized:  " + tuitionFee);
		
	}
	
StudentFeesystem(String name, String Class){
	this.name = name;
	this.Class = Class;
}

//Setters
	public void setName(String name){
		this.name = name;
	}

	public void setClass(String Class){
		this.Class = Class;
	}
	
//getters
	public String getName(){
		return name;
	}
	
	public String getStudentsClass(){
		return Class;
	}

public static void main(String[] args){
		
		StudentFeesystem s1 = new StudentFeesystem("Anjali","10th");
		StudentFeesystem s2 = new StudentFeesystem("Vikram","12th");

	
	System.out.println("Student1: Name = " + s1.getName() + " Class= = "+ s1.getStudentsClass() + " Tuition Fee = " + tuitionFee);
	
	System.out.println("Student2: Name = " + s2.getName() + " Class= = "+ s2.getStudentsClass() + " Tuition Fee = " + tuitionFee);


}

}
