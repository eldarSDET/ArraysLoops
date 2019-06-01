package vehicleInheritance;

public class car extends vehicle {
	
	public car(String make, String message) {
		super(make,message);
		System.out.println("This constructor is coming from car class.");
		
	}
	public car() {
		super();
	}

}
