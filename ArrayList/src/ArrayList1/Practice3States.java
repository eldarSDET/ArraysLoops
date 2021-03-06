package ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

//        1. Create an Arraylist of String called states
//2. Add 8 states using Scanner to ArrayList object

//3. Then print out using states using the loop Create one method called printArrayList()
// use loop
// it will take one parameter as a ArrayList and it will print out all the element.

//4. Then print out the states which is ending with �a�. Create one method called printA()
//use loop
//it will take one parameter as a Arraylist and it will print only the states which are ending with 'a'

//5. make every item upper case.
//create one method which is called arrayUpper()
//use loop
// it will take one parameter as a arrayList then it will printout all the element with uppercase


public class Practice3States {
	public static void printArrayList(ArrayList<String> list) {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public static void printA(ArrayList<String>list) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).endsWith("a")) {
				System.out.println("ends with a: "+list.get(i));
			}
		}
	}
	
	public static void arrayUpper(ArrayList<String>list) {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).toUpperCase());
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String>states=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the states");
		for(int i=0; i<8;i++) {
			states.add(sc.nextLine());
		}
		Practice3States.printArrayList(states);
		Practice3States.printA(states);
		Practice3States.arrayUpper(states);
		
	}
	
	

}
