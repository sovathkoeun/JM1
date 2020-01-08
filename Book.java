package Homework_5;

public class Book {
	private String title;
	private String autor;
	private int publishYear;
	private boolean isBorrowed = true;
	
	public Book(String title, String autor, int publishYear) {
		this.title = title;
		this.autor = autor;
		this.publishYear = publishYear;
	}

	public void borowed() {
		isBorrowed = true;
	}
	
	public void returnBack() {
		isBorrowed = false;
	}
	
	String getTitle() {
		return title;
	}
	
	String getAutor() {
		return autor;
	}
	
	int getPublishYear() {
		return publishYear;
	}
	
	public String isBorrowed() {
		String BorrowedBooks;
		if(isBorrowed == true) {
			BorrowedBooks= "Not available ";
		}else {
			BorrowedBooks=  "Availab le";
		}
		return BorrowedBooks;
	}
	public String toString() {
		return title + autor + publishYear + isBorrowed();
  }
}