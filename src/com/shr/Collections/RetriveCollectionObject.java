package com.shr.Collections;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;


public class RetriveCollectionObject {
	private static final String Iterator = null;

	public static void main(String []args) {
		
	
	Vector<String> listOfCity =new Vector<>();
	listOfCity.add("hyd");
	listOfCity.add("pune");
	listOfCity.add("indore");
	listOfCity.add("bhubneswar");
	listOfCity.add("kolkata");
	
	System.out.println("1) by using toString: ");
	System.out.println(listOfCity.toString());
	System.out.println("---------------------------");
	
	System.out.println("2) by using Ordinary for loop: ");
	for(int i=0; i<listOfCity.size(); i++)
	{
		System.out.println(listOfCity.get(i));
	}
	System.out.println("---------------------------");
	
	System.out.println("3) by using for each loop: ");
	for(String str:listOfCity)
	{
		System.out.println(str);
	}
	System.out.println("---------------------------");
	
	System.out.println("4) by using Enumeration interface");
	Enumeration<String> ele = listOfCity.elements();
	while(ele.hasMoreElements())
	{
		System.out.println(ele.nextElement());
	}
	System.out.println("---------------------------");
	
	System.out.println("5) by using iterator interface");
	Iterator<String> itr = listOfCity.iterator();
	itr.forEachRemaining(city->System.out.println(city));
	
	System.out.println("---------------------------");
	
	System.out.println("6) by using Listiterator interface");
	
	ListIterator<String> istitr = listOfCity.listIterator();
	System.out.println("forward direction");
	while(istitr.hasNext())
	{
		System.out.println(istitr.next());
	}
	
	System.out.println("backward direction");
	while(istitr.hasPrevious())
	{
		System.out.println(istitr.previous());
	}
	System.out.println("---------------------------");
	
	System.out.println("7) by using Splititerator interface");
	
	
	
	
	
	
	
	
	
	
	
	

}
}
