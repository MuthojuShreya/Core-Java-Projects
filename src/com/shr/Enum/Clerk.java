package com.shr.Enum;

public class Clerk extends Employee {
	private int speed;
	private int accuracy;
	private boolean bonusAppiled;
	
	
	public Clerk() {
		super();
		this.bonusAppiled=true;
	}
	
	public Clerk(String name, int employeeId, double salary,int speed, int accuracy) {
		super(name,employeeId,salary);
		this.speed = speed;
		this.accuracy = accuracy;
		
		
	recalculateSalary();
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	recalculateSalary();
	}
	
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy=accuracy;
	recalculateSalary();
	}
	
	public void setSalary(double salary) {
		super.setSalary(salary);
		bonusAppiled=false;
	}	
	
	public void recalculateSalary() {
		
		if(bonusAppiled && speed>70 && accuracy >80) {
			super.setSalary(getSalary()+1000);
			bonusAppiled=true;
		}
}
}