package InheritanceOOP;

public class zoo {
	
	public static void main(String[] args) {
		domesticAnimals da=new domesticAnimals();
		da.eat();
		da.run();
		System.out.println("====================");
		cat c=new cat();
		c.sleep();
		c.eat();
		System.out.println("==================");
		tiger t=new tiger();
		t.walk();
		System.out.println("=======================");
		animals a=new animals();
		a.eat();
		
		
	}

}
