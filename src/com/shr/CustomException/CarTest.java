package com.shr.CustomException;

public class CarTest {
	public static void stop(String status) throws CarStoppedException{
		if(status.equalsIgnoreCase("stop")) {
			throw new CarStoppedException("Car is stopped for some reason");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}
	public static void puncture(String status) throws CarPunctureException{
		if(status.equalsIgnoreCase("puncture")) {
			throw new CarPunctureException("Car is puncture");
		}
		else
		{
			System.out.println("Car not stall");
		}
	}

	public static void carHeat(int temperature) throws CarHeatException{
		if(temperature>50) {
			throw new CarHeatException("Car is heated more than 50 degrees");
		}
		else
		{
			System.out.println("Car temperature is normal");
		}
	}


}
