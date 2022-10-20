package com.capgemini.javademos;
//program for constructor
 class motor
{
	private String doors;
	private int speed;
	public motor()
	{
		doors="opened";
		speed=0;
	}
	public motor(String doors,int speed)
	{
		this.doors=doors;
		this.speed=speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String run() {
		if(doors.equals("closed")&& speed>0) {
			return "running";
		}
		else
			return "not running";
	}
}
public class DemoConstructors {

	public static void main(String[] args) {
		motor car=new motor("closed",10);
		System.out.println(car.run());

	}

}
