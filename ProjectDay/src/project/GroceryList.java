package project;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroceryList extends GroceryBuddy{
	List <String>listFruits=Arrays.asList(fruits);
	List<String>listVegetables=Arrays.asList(vegetables);
	List<String>listProducts=Arrays.asList(products);
	List arrayList=new ArrayList(listFruits);
	List cart=new ArrayList();
	
	
	public void purchasedItems(String item) {
		arrayList.addAll(listVegetables);
		arrayList.addAll(listProducts);
		for(int i=0; i<arrayList.size();i++) {
			if(arrayList.get(i).equals(item)) {
				cart.add(item);
				
			}else {
				System.out.println("Sorry,this item is not in the store");
			}
		}
	}
	public static void main(String[] args) {
		
		GroceryList obj=new GroceryList();
		System.out.println(obj.arrayList);
	   
	}
	

}
