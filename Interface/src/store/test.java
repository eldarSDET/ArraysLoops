package store;

import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		
		bird b =new bird();
		b.fly();
		b.sounds();
		plane p=new plane();
		p.fly();
		p.sounds();
		System.out.println(b.WINGCOUNT);
		System.out.println(p.WINGCOUNT);
		
		GroceryStore gs=new GroceryStore();
		gs.displayItem();
		gs.sellItem();
		System.out.println("=========================");
		store s=new GroceryStore();
		s.sellItem();
		s.displayItem();
		((GroceryStore)s).myMethod();
		//interface                concrete  class
		Map<Object,String>myMap=new HashMap<Object, String>();
		sound s2=new plane();
		((plane)s2).fly();
	}

}
