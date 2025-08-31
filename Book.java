public class Book{
	String title;
	String author;
	boolean issued;
	static int totalIssuedBooks;
	
	Book(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		if(issued){
			totalIssuedBooks++;
		}
	}
	
	//setters
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public void setIssuedStatus(boolean issued){
		this.issued = issued;
	}
	
	//getters
	
	public String getTitle(){
		 return title; 
	}
	public String getAuthor(){
		return author;
	} 
	public boolean getIssuedStatus(){
		return issued;
	}

 	public static void showTotalIssued(){
 		
 		System.out.println("Total Issued: " + totalIssuedBooks);
 		
 	}
 	
public static void main(String args[]){
	
	Book b1 = new Book("Harry Potter", "J.K.Rowling",true);
	Book b2 = new Book("Five Point Someone", "Chetan Bhagat",false);
	Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki",true);
	
	System.out.println("\n" + b1.getTitle()+": Issued ?" + b1.getIssuedStatus());
	System.out.println("\n" +b2.getTitle()+": Issued ?" + b2.getIssuedStatus());
	System.out.println("\n" + b3.getTitle()+": Issued ?" + b3.getIssuedStatus());
	b3.showTotalIssued();
	



}
}
