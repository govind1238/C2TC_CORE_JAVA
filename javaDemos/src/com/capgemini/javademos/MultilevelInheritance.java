package com.capgemini.javademos;
//program for multilevel inheritance
class Eo
{
	void disp1()
	{
		System.out.println("one");
	}
	
}
class Fo extends Eo
{
	void disp2()
	{
		System.out.println("two");
	}
}
class Ho extends Fo
{
	void disp3()
	{
		System.out.println("three");
	}
}
class Io extends Ho
{
	void disp4()
	{
		System.out.println("four");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Io obj1=new Io();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();

	}

}
