package com.shr.MultiThreading1;

public class petrolPumpSimulation {

	public static void main(String[] args) {
		petrolPump p = new petrolPump();
		String cars[]= {"abd","ghj","fgh"};
		Car c=new Car(cars,p);
		Thread t=new Thread(c);
		t.start();

	}

}
