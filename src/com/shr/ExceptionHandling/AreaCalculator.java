package com.shr.ExceptionHandling;

import java.util.Scanner;

public class AreaCalculator {
	public static double calculateArea(double length,double width)
	{
		if(length<0 || width<0) {
			throw new IllegalArgumentException("Length and width must be gereater than zero");
		}
		return length*width;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try(sc) {
			System.out.println("Enter length of recangle");
			double length=sc.nextDouble();
			
			System.out.println("Enter width of recangle");
			double width=sc.nextDouble();
			
			double area=calculateArea(length,width);
			System.out.println("Area of Rectangle with length "+length+" and width "+width +" is "+area);
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception: "+e.getMessage());
			
		}
		
	}
	

}
