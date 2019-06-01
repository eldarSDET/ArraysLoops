package Polymorphysm2;

public class men extends human implements dad {

	@Override
	public void feed() {
		System.out.println("Man is feeding");

	}

	@Override
	public void sleep() {
		System.out.println("Man is sleeping");

	}
	public void work() {
		System.out.println("Men like working");
		
	}

}
