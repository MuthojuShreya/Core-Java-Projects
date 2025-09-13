package com.shr.CollectionOmi;

import java.util.Collections;
import java.util.Vector;

record Manager(Integer id, String name, Double salary)
{}

public class VectorDemo {
	public static void main(String[]args)
	{
		Vector<Manager> listOfManagers = new Vector<>();
		listOfManagers.add(new Manager(333, "scott", 72000D));
		listOfManagers.add(new Manager(444, "Smith", 65000D));
		listOfManagers.add(new Manager(222, "Alen", 44000D));
		listOfManagers.add(new Manager(111, "John", 55000D));
		listOfManagers.add(new Manager(555, "Martin", 49000D));
		
		System.out.println("Manage Data, Sorted Based on the Id:");
		
		Collections.sort(listOfManagers, (m1, m2)-> m1.id().compareTo(m2.id()));
		listOfManagers.forEach(System.out::println );
		
		for(Manager manager : listOfManagers)
		{
			if(manager.salary()>50000)
			{
				System.out.println(manager);
			}
		}
	}
}
