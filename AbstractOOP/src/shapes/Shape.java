package shapes;

public abstract class Shape extends SuperShape {
	String name;
	double area;
	
	public abstract double calculateArea();
	
	public Shape(String name) {
		this.name=name;
	}
	
	
	
	

}
