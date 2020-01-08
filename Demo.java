package Homework_5;

import java.util.ArrayList;
import java.util.List;
public class Demo {

		public static void main(String[] args) {
		    Student student = new Student ("Channak","WEB2019");
			Book book1 = new Book("Don't make me think","Steve Krung",2000);
			book1.borowed();
			Book book2 = new Book("Pro Java Programming","Terrill",2005);
			book2.borowed();
			Book book3 = new Book("Programming in Python 3","Mark Summerfield",2005);
			book3.borowed();
			Book book4 = new Book("The Clean Coder","Robert",2011);
			book4.borowed();
			Book book5 = new Book("The Art of Agile Development","James Shore",2007);
			book5.borowed();	
			Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
			book6.borowed();
			Book book7 = new Book("The Linux Command Line","Willian",2009);
			book7.borowed();
			Book book8 = new Book("Code Complete","Steve",1993);
			Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
			book8.returnBack();
			book9.returnBack();
			Book book10 = new Book("The C++ Programming Language","Bjarne Stroustup",2013);
		    book10.borowed();
			
			// Create list of array for table
			List<Book> books = new ArrayList<>();
			System.out.println("------------------------------------------------------------------------------------");
			System.out.format("%30s %20s %10s %10s","TITLE","AUTHOR","YEAR","STATUS");
			System.out.println();
			 System.out.println("------------------------------------------------------------------------------------");
			 books.add(book1);
			 books.add(book2); 
			 books.add(book3); 
			 books.add(book4); 
			 books.add(book5);
			 books.add(book6); 
			 books.add(book7);
			 books.add(book8);
			 books.add(book9); 
			 books.add(book10);		
			 
			for(Book Book : books) {
				System.out.format("%30s %20s %10s %20s",Book.getTitle(),Book.getAutor(),Book.getPublishYear(),Book.isBorrowed());
				System.out.println();
			}
			 System.out.println("-------------------------------------------------------------------------------------");
			
				student.borrowedBook(book1);
				student.returnBook(book3);
				System.out.println(student);
				System.out.println(book2.getTitle());
				System.out.println(book5.getTitle());
				System.out.println(book6.getTitle());
		     }
		
	     }
