package Methods;

public class Cat {
	
		int age=3;
		String color="whitej";
		String name="Oreo";
		int leg=4;
		int eyes=2;
		String eyesColor="blue";
		boolean noise=true;
		int height=1;
		int weight=2;
		boolean hear=true;
		String gender="female";
		String dateOfBirth="03/05/2016";
		boolean agressive=false;
		int speed=10;
		//create  one new class named as a bird and create following attributes of the class.
		//Age, name, height,legs, color,kind, gender, dateofBirth, speak.
		
		
		
		public void move() {
			System.out.println("cat is moving");			
		
	}
		
		public int speed() {
			System.out.println(speed);
		
			return speed;
			
		}
		
		public static void main(String[] args) {
		Cat cat=new Cat();
		System.out.println(cat.name);
		cat.move();
		cat.speed();
	}


}
