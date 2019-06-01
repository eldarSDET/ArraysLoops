package store;

public class GroceryStore implements store {

	@Override
	public void sellItem() {
		System.out.println("Selling fruits");
		
	}

	@Override
	public void displayItem() {
		System.out.println("Displaying candies");
		
	}
	public void myMethod() {
		System.out.println("Grocery store method");
	}

}
