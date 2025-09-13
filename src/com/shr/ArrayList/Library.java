package com.shr.ArrayList;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books;

	public Library(Book books) {
		super();
		this.books = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		for(Book b:books) {
			if(b.getIsbn()==book.getIsbn()) {
				System.out.println("book with same ISBN number already exits");
			}
			else {
				books.add(b);
				System.out.println("book is available");
			}
		}	
	}
	private Book searchBookByISBN(long isbn) {
		
		for(Book book:books) {
			if(book.getIsbn()==isbn) {
				return book;
		}
		
	}
		return null;
	}
	
	public void displayAllBooks() {
		if(books.isEmpty()) {
			System.out.println("no book available");
			return;}
		for(Book book:books) {
			System.out.println(book.displayBook());
		}
	}
	
	public void updateBookQuantityByISBN(long isbn) {
		
	}
	
		
		
		
		
		
		
		
		
	

}
