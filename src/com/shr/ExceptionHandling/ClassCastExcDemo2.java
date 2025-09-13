package com.shr.ExceptionHandling;

public class ClassCastExcDemo2 {
	
	public static void handleCCE() {
	Object[] objects= {"hello",123,"java"};
	
	for(Object obj :objects ) {
		try {
			String str=(String)obj;
			System.out.println("casting successful:"+str);
		}
		catch(ClassCastException e) {
			System.out.println("Class Cast Exception occur "+obj.getClass().getName());
			e.printStackTrace();}
	}
	}
		public static void main(String[] args) {
			handleCCE();
		
}
}