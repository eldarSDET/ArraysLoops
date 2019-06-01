package shapes;					

public class circle extends Shape{
	int radius;
	@Override 
	public void draw() {
		System.out.println("drawing circle");
	}
	@Override
	public double calculateArea() {
		return radius*radius*3.14;
		
	}
	public circle() {
		super("Circle");
	}
	
	public circle(int radius) {
		this();
		this.radius=radius;
	}
				

}
