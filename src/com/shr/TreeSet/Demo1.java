package com.shr.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

record Product1(Integer id,String name ) implements Comparable<Product1>{

	@Override
	public int compareTo(Product1 p1) 
	{
		return this.name().compareToIgnoreCase(p1.name());
	}
}

public class Demo1{
	public static void main (String[] args) 
	{
		TreeSet<Product1> ts1=new TreeSet<>();
		ts1.add(new Product1(333,"camera"));
		ts1.add(new Product1(111,"laptop"));
		ts1.add(new Product1(888,"mobile"));
		ts1.add(new Product1(444,"tab"));
		
		System.out.println("-----------------------------------");
		
		ts1.forEach(System.out::println);
		
		Iterator<Product1> descItr=ts1.descendingIterator();
		System.out.println("in descending order");
		descItr.forEachRemaining(System.out::println);
		
		System.out.println("-----------------------------------");
		
		/*//Sorting based on id
		TreeSet<Product> ts2=new TreeSet<>((s1,s2)->Integer.compare(s1.id(),s2.id()));
		
		ts2.add(new Product(333,"camera"));
		ts2.add(new Product(111,"laptop"));
		ts2.add(new Product(888,"mobile"));
		ts2.add(new Product(444,"tab"));
		
		ts2.forEach(System.out::println);*/
				
	}
}

