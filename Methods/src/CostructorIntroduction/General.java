package CostructorIntroduction;

public class General {
	public static void main(String[] args) {
		Person pers=new Person(132);
		Person p=new Person("Hello", "goodbuy",34, "Wow", "yeah", 8);
		Bike  bike=new Bike();
		Bike bike2=new Bike(2344);
		Bike bike3=new Bike("Sport", 8, "red");
		Bike bike4=new Bike("John", "green","8");
		Bike bike5=bike;
		bike =bike4;
		
		bike4=bike3;
		bike=bike3;
		bike2=bike3;
		bike5=bike3;
		
		
	
	
		
			
	
		
	}

}
