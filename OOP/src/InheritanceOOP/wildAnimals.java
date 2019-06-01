package InheritanceOOP;
                    //tiger IS A wildAnimals
                    //tiger inherite from wildAnimals
                    //tiger is subclass of wildAnimals

public class wildAnimals extends animals{
	@Override
	public void eat() {
		System.out.println("Wild animals eating.");
	}
	public void walk() {
		System.out.println("Wild animals are walking.");
	}
	
	

}
