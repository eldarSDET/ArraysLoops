package Interface;

public abstract class Phone implements camera, memoryCard {
	
	public String name;
	public String model;
	public int price;
	
	public abstract void lock();
	public abstract void call(long number);
	public abstract void text(long number);
	public abstract void takePicture();
	

}
