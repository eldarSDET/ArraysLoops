package project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroceryBuddy extends CheckOut {
	String []fruits= {"Apple","Orange","Watermelon","Banana","Pineapple","Grape",
			"Mango","Strawberry","Peach","Cherry"};
	String []vegetables= {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber",
			"Corn", "Bean", "Spinach", "Pepper"};
	String[] products= {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar" , "Salt" ,
			"Coffee", "Rice", "Pasta"};
	
	Double[]fruitPrice= {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};
	Double[]vegetablesPrice= {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};
	Double[]productsPrice= {2.99, 1.99,3.99,2.49,0.99,1.69,2.49,4.99,3.39,1.79};
	//Map<String, Double>fruitPriceMap=new HashMap<String, Double>();
	
	
	public void ListOfFruits() {
		System.out.println(Arrays.toString(fruits));
	}
	public void ListOfVegetables() {
		System.out.println(Arrays.toString(vegetables));
	}
	public void ListOfProducts() {
		System.out.println(Arrays.toString(products));
	}
	public Double getItemPriceFruit(String item) {
		for(int i=0; i<fruits.length;i++) {
			if(fruits[i].equalsIgnoreCase(item)) {
				return fruitPrice[i];
			}
		}
		return null;
	}
	public Double getItemPriceVegetables(String item) {
		for(int i=0; i<vegetables.length;i++) {
			if(vegetables[i].equalsIgnoreCase(item)) {
				return vegetablesPrice[i];
			}
		}
		return null;
	}
	public Double getItemPriceProducts(String item) {
		for(int i=0; i<products.length;i++) {
			if(products[i].equalsIgnoreCase(item)) {
				return productsPrice[i];
			}
		}
		return null;
	}



}
