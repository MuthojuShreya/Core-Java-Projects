package com.shr.MultiThreading1;

public class Car implements Runnable {
	
	petrolPump p;
    String carName[];
	
	public Car(String[] name, petrolPump p) {
		super();
		this.carName = carName;
		this.p = p;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<carName.length;i++)
				p.refillCar(carName[i]);
		}
		catch(Exception e) {
			e.printStackTrace();
		
	}

}
	}
