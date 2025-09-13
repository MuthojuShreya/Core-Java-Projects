package com.shr.InterfacesD1;

public class UPIPayment implements Payment {

	@Override
	public void makePayment() {
		System.out.println("Processing UPIPayment ");
		
	}

	@Override
	public void applyDiscount() {
		System.out.println("Applying 100rupess Cashback");
		
		
		
	}

}
