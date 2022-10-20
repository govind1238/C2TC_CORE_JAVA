package com.capgemini.javademos;
//program for hierarchical inheritance
class A{
	void disp1() {
		System.out.println("one");
	}
	

}
class B extends A{
	void disp2()
	{
		System.out.println("two");
	}
}
class C extends A{
	void disp3()
	{
		System.out.println("three");
	}
}
class D extends A{
	void disp4()
	{
		System.out.println("four");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		D obj1=new D();
		obj1.disp1();
		obj1.disp4();
		C obj2=new C();
		obj2.disp1();
		obj2.disp3();
		

	}

}
