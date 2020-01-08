package Homework_5;
import java.util.ArrayList;

public class Student {
private String firstName;
private String batch;
private  ArrayList<Book> getBookCart ;

public Student(){
	
}

public Student(String firstName, String batch) {
	this.firstName = firstName;
	this.batch = batch;
	 getBookCart = new ArrayList<Book>();
}

public void borrowedBook(Book book) {
	if(getBookCart.add(book)) {
		System.out.println("You could borrow only maximum 3 books");
	}else if(getBookCart.add(book)) {
		System.out.println("This book isn'n Avaible");
	}
}

public void returnBook(Book borrowed) {
	if(getBookCart.add(borrowed)) {
		System.out.println("You didn't borrow this book");
	}
}

public void getBookCart(ArrayList <Book> bookCart) {
	this.getBookCart = bookCart;
}

public String toString() {
	return  firstName + " of class "+ batch + " has borrowed:";
   }

}





	
	

