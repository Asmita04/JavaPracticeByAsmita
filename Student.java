class Student{
	String name;
	int marks;
	static int totalStudents;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}

//setters
public void setName(String name){
	this.name = name;
}
public void setMarks(int marks){
	this.marks = marks;
}

// getters

public String getName(){
	return name;
}
public int getMarks(){
	return marks;
}

public boolean isPassed(){
  return (marks>=35)?true:false;
} 

public static void showTotalStudents(){
 System.out.println("Total Students : " + totalStudents);
}



 

public static void main(String[] args){
	
	Student s1 = new Student("Rahul",78);
	Student s2 = new Student("Pooja",34);
	Student s3 = new Student("Amit",65);
	
	System.out.println("Student " + s1.getName() + " Passed ? " + s1.isPassed());
	System.out.println("Student " + s2.getName() + " Passed ? " + s2.isPassed());
	System.out.println("Student " + s3.getName() + " Passed ? " + s3.isPassed());
	
	showTotalStudents();

}


}