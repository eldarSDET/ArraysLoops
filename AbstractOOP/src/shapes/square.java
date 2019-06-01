package shapes;

public class square extends Shape {
	int length;
	@Override
	public void draw() {
		System.out.println("Drawing square");
		
	}
	@Override
	public double calculateArea() {
		return length*length;
	}
	public square() {
		super("square");
	}
	public square (int length) {
		this();
		this.length=length;
	}

}
