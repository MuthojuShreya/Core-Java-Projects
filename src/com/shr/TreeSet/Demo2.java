package com.shr.TreeSet;

import java.util.*;

//Book class implementing Comparable to allow sorting by name
class Book implements Comparable<Book> {
 String name;
 String author;

 // Constructor
 public Book(String name, String author) {
     this.name = name;
     this.author = author;
 }

 // compareTo method to sort by name
 @Override
 public int compareTo(Book other) {
     return this.name.compareToIgnoreCase(other.name);
 }

 // toString for display
 @Override
 public String toString() {
     return "Book{name='" + name + "', author='" + author + "'}";
 }
}

//Main class
public class Demo2 {
 public static void main(String[] args) {
     // TreeSet to store books sorted by name
     TreeSet<Book> bookSet = new TreeSet<>();

     // Adding 5 book records
     bookSet.add(new Book("The Hobbit", "J.R.R. Tolkien"));
     bookSet.add(new Book("A Tale of Two Cities", "Charles Dickens"));
     bookSet.add(new Book("Moby Dick", "Herman Melville"));
     bookSet.add(new Book("Pride and Prejudice", "Jane Austen"));
     bookSet.add(new Book("1984", "George Orwell"));

     // Display all books sorted by name
     System.out.println("Books sorted by name:");
     for (Book book : bookSet) {
         System.out.println(book);
     }
 }
}



