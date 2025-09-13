package com.shr.ExceptionHandling;

import java.util.Scanner;

public class ClassNotFoundExcDemo {
	
	public ClassNotFoundExcDemo(String className) {
		try {
			Class<?> cls =Class.forName(className);
			System.out.println("class loaded successfully: "+cls.getName());
		}
		catch(ClassNotFoundException e) {
			System.out.println("Error: calss "+className+" not found");
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  the class name to load:");
		String className=sc.nextLine();
		
		new ClassNotFoundExcDemo(className);
		
		sc.close();
	}
}
