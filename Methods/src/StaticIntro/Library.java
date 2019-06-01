package StaticIntro;



public class Library {
	
	static {
		System.out.println("Hello from static block");
	}
	{
		
	}
	
	String name;
	public Library(String name) {
		this.name=name;
		
	}
	public static int numOfBooks=10;
	
	
	public static boolean checkOutBook() {
		
		if(numOfBooks>0) {
			numOfBooks--;
			return true;
		}
		return false;
		
		
	}

}
