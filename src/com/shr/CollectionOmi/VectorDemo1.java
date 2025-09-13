package com.shr.CollectionOmi;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

record Product(int productId, String productName) {
	
}

public class VectorDemo1 {
	

	public static void main(String[] args) {
		Vector<Product> listOfProduct = new Vector<>();
		listOfProduct.add(new Product(111,"Laptop"));
		listOfProduct.add(new Product(222,"Mobile"));
		listOfProduct.add(new Product(333,"camera"));
		listOfProduct.add(new Product(444,"bag"));
		listOfProduct.add(new Product(555,"watch"));
		
		Enumeration<Product> elements = listOfProduct.elements();
		
		Iterator<Product> asIterator = elements.asIterator();
		asIterator.forEachRemaining(System.out::println);


		
		

	}


}
