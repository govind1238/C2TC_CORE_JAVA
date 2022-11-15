package com.capgemini.javademos;
//program for abstract class
abstract class Base
{
	abstract void fun();
}
class Derived extends Base
{
	void fun()
	{
		System.out.println("derived fun() called");
	}
}

public class DemoAbstractClass {

	public static void main(String[] args) {
		Base b=new Derived();
		b.fun();

	}

}
