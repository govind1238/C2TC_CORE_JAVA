package com.capgemini.javademos;
//program for method overriding
class Super
{
	void disp()
	{
		System.out.println("super class");
	}
}
class subclass extends Super
{
	void disp()
	{
		super.disp();
		//system.out.println("only sub class");
	}
}

public class DemoMethodOverriding {

	public static void main(String[] args) {
		subclass obj=new subclass();
		obj.disp();

	}

}
