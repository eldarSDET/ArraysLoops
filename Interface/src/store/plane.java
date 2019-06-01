package store;

public class plane implements flyable, sound{
	@Override
	public void fly() {
		System.out.println("Fly like a plane");
		
	}

	@Override
	public void sounds() {
		System.out.println("noisy");
		
	}

	

}
