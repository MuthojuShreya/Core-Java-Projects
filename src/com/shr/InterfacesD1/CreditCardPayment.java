package com.shr.InterfacesD1;

public class CreditCardPayment implements Payment{
	@Override
	public void makePayment() {
		System.out.println("Processing creditcard ");
		
	}

	@Override
	public void applyDiscount() {
		
		System.out.println("Applying 10% discount ");
		
	}
	

}
