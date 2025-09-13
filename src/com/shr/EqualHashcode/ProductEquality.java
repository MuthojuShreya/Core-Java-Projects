package com.shr.EqualHashcode;

public class ProductEquality {

	public static void main(String[] args) {
		Product p1=new Product(111,"scott");
		Product p2=new Product(111,"scott");
		Employee e1=new Employee();
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(e1));
		
	}

}
