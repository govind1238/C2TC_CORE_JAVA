package com.capgemini.javademos;
//program for single inheritance
class one
{
	void disp1()
	{
		System.out.println("one");
	}
	
}
class two extends one
{
	void disp2()
	{
		System.out.println("two");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		two obj=new two();
		obj.disp1();
		obj.disp2();

	}

}
