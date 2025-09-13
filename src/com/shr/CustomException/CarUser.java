package com.shr.CustomException;

public class CarUser {

	public static void main(String[] args) {
		try{
			CarTest.stop("stop");
		}
		catch(CarStoppedException e1) {
			System.out.println("Exception: "+e1.getMessage());
	}
		try{
			CarTest.stop("go");
		}
		catch(CarStoppedException e1) {
			System.out.println("Exception: "+e1.getMessage());
	}
		try{
			CarTest.puncture("puncture");
		}
		catch(CarPunctureException e1) {
			System.out.println("Exception: "+e1.getMessage());
	}
		try{
			CarTest.puncture("okay");
		}
		catch(CarPunctureException e1) {
			System.out.println("Exception: "+e1.getMessage());
	}
		try{
			CarTest.carHeat(40);
		}
		catch(CarHeatException e1) {
			System.out.println("Exception: "+e1.getMessage());
	}
		try{
			CarTest.carHeat(80);
		}
		catch(CarHeatException e1) {
			System.out.println("Exception: "+e1.getMessage());
	}

	
		
	}

}
