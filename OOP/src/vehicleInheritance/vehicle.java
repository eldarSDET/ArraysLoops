package vehicleInheritance;

public class vehicle {
	String make;
	
	public vehicle() {
		System.out.println("Creating non argument constructor from vehicle.");
	}
	public vehicle(String make) {
		this();
		this.make=make;
		System.out.println("Creating vehicle make: "+make);
	}
	public  vehicle(String make, String message) {
		this(make);
		System.out.println(message);
	}
	public static void main(String[] args) {
		vehicle v=new vehicle("toyota","buying new car");
	}

}
