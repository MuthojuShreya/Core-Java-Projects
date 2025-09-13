package com.shr.ExceptionHandling;

import java.util.Scanner;

public class AEdemo1 {
	
	public static int perfromDivison(int dividend,int divisor) {
		if(divisor==0) {
			throw new ArithmeticException("Division by zero");
		}
		return dividend/divisor;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter dividend: ");
		int dividend=sc.nextInt();
		
		System.out.println("Enter divisor: ");
		int divisor=sc.nextInt();
		
		try {
			int result=perfromDivison(dividend,divisor);
			System.out.println("Result of divison: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException caught: "+e.getMessage());
		}
		sc.close();
	}
}
