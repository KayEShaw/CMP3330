package bookstorage;

public class Library {
	private Book[] books;
	private int count;
	
	// Initalizes the Book array and count
	public Library() {
		books = new Book[5];
		count = 0;
	}
}