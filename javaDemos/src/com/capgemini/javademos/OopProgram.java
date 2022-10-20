package com.capgemini.javademos;
class fourwheeler{
	private String doors;
	private int speed;
	public void setSpeed(int speed) {
		this.speed=speed;
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
		if(doors.equals("closed")&& speed >0)
		{return "running";
		
		}
		else
			return"not running";
	}
}


public class OopProgram {

	public static void main(String[] args) {
		fourwheeler car=new fourwheeler();
		car.setDoors("closed");
	car.setSpeed(10);
		System.out.println(car.run());

	}

}
  
