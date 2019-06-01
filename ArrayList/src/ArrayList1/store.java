package ArrayList1;

import java.util.ArrayList;
import java.util.List;

public class store {

		static List<String>itemsToBuy;
		static {
			itemsToBuy=new ArrayList<>();
			itemsToBuy.add("milk");
			itemsToBuy.add("apples");
			itemsToBuy.add("bread");
			itemsToBuy.add("sugar");
			System.out.println("Welcome to grocery store!");
			shoppingList();
		}
		
		public static void shoppingList() {
			System.out.println(itemsToBuy);
		}
		public static void buy(String item) {
			itemsToBuy.add(item);
			shoppingList();
		}
		
		public static void buy(String item1,String item2) {
			itemsToBuy.add(item1);
			itemsToBuy.add(item2);
			shoppingList();
		}
		public static void returnItem(String item) {
			itemsToBuy.remove(item);
			shoppingList();
		}
		
		public store() {
			System.out.println("In the car.");
		}
	

}
