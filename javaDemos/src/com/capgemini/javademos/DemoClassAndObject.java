package com.capgemini.javademos;
//program for class and object
class car
{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	
}
public class DemoClassAndObject {
	

	public static void main(String[] args) {
		
		car car=new car();
		car.setSpeed(10);
		System.out.println(car.getSpeed());

	}

}


