package ArrayList1;

public class buyer {
	
	
	public static void main(String[] args) {
		store buyer1=new store();//without object static block will not execute
		buyer1.buy("Coffee");
		buyer1.returnItem("milk");
		buyer1.buy("milk","chocolate");
		
		
	}

}
