public class StudentsMarkChecker{
	String name;
	int rollNo;
	int marks;
	
StudentsMarkChecker(String name, int rollNo, int marks){
	this.name = name;
	this.rollNo = rollNo;
	this.marks  = marks;
}

//Setters
	public void setMarks(int marks){
		this.marks = marks;
	}

//getters
	public int getMarks(){
		return marks;
	}
	
	public static 

public static void main(String[] args){
		
	StudentsMarkChecker s1 = new StudentsMarkChecker("Anjali",116,78);
	StudentsMarkChecker s1 = new StudentsMarkChecker("Rahul",119,65);

	//s1.setMarks(85);
	
	//System.out.println("Student1: Name = " + s1.name + ", Roll Number= = "+ s1.rollNo + ", Marks= " + s1.getMarks());
	
}
}