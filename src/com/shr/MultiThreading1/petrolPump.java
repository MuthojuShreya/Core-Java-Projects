package com.shr.MultiThreading1;

public class petrolPump {
       public synchronized void refillCar(String carName) {
    	   System.out.println(carName+" started filling ");
    	   try {
    		   Thread.sleep(3000);    		   
    	   }
    	   catch(InterruptedException e) {
    		   System.out.println(" refilling interrupted for "+carName);
    	   }
    	   System.out.println(carName+" completed filling");
       }
}
