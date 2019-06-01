package InheritanceOOP;

public class domesticAnimals extends animals{
	String animalName;
	@Override
	public void run() {
		super.animalName="Domestic animal";
		System.out.println("Domestic animal is running.");
	}
	//annotation
	@Override
	public void sleep() {
		System.out.println("Domestic animal is sleeping");
	}
	
	
	
	
	

}
