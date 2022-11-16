package com.capgemini.javademos;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection2 {
	
	void display(LinkedList<String> list) {
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("Player name is:"+it.next());
		}

		}
public static void main(String[] args) {
LinkedList<String> player=new LinkedList<String>();
		
		player.add("Dhoni");
		player.add("Virat");
		player.add("Rohit");
		player.add("Yuvraj");
		player.add("Surya");
		
		System.out.println(player);
		
		Collection2 im=new Collection2()	;
		im.display(player);
      

	}

}

