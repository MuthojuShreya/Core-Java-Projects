package com.shr.InterfacesD1;

import java.util.Scanner;

public class PaymentGatewayUsingInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PaymentGateway gateway=new PaymentGateway();
		System.out.println("Select your payment Option:\n 1)Credit Card 2)UPI");
		
		System.out.println("please enter your Choice : ");
		int choice=sc.nextInt();
		
		switch(choice) {
		
		case 1:
			Payment creditCard = new CreditCardPayment();
			creditCard=gateway.initiatePayment(creditCard);
			creditCard.applyDiscount();
			creditCard.makePayment();
		    break;	
		    
		case 2:
			Payment upi = new UPIPayment();
			upi=gateway.initiatePayment(upi);
			upi.applyDiscount();
			upi.makePayment();
		    break;	
		    
		    default:
		    	System.out.println("Wrong choice");
		}
		
		}

	}


