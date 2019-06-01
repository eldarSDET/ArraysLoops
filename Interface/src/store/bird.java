package store;

public class bird implements flyable,sound {
	@Override
	public void fly() {
		System.out.println("Fly like a bird");
		
	}

	@Override
	public void sounds() {
		System.out.println("Chik chik");
		
		
	}

	

}
