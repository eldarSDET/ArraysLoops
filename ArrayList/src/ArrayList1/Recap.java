package ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Recap {
	public static void main(String[] args) {
		int nm1=10;
		ArrayList list=new ArrayList();
		list.add(nm1);//Autoboxing
		list.add(20);
		list.add(1, 15);//10,15,20
		list.add("Techtorial");
		
		System.out.println(list);
		System.out.println(list.get(2));
		//if remove met
		list.remove("Techtorial");
		System.out.println(list);
		//list.add(1,"Techtorial");
		//.set(4, "Techtorial");
		//if set method index is bigger than the size of arraylist it will throw an exception
		System.out.println(list);
		list.isEmpty();
		list.size();
		list.clear();//it will remove all the elements from arraylist
		list.contains("Techtorial");
		if(list.contains("Techtorial")) {
			System.out.println("Techtorial is available in my list");
		}
		list.add("bread");
		list.add("cola");
		list.add("egg");
		if(list.contains("bread")){
			System.out.println("My basket is including the bread");
		}
			
		String []city= {"Chicago","Milwaukee","Los Angeles"};
		List cityOfUs=Arrays.asList(city);
		cityOfUs.remove(0);
		//once you convert from array to arraylist.
		//arraylist is fixed size
		//thats why below code will give the exception
		//you can not add the value and you cannot remove the value from arraylist
		cityOfUs.set(0,"Wisconsin"); //this code will not compile
		System.out.println(cityOfUs);
		Collections.sort(cityOfUs);
		List<String>names=new ArrayList<String>();
		names.add("Muammer");
		names.add("Tima");
		names.add("Arslan");
		
		
		
		
	
		
		
	}
	

}
