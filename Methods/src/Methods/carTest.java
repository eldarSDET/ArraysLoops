package Methods;

public class carTest {
	public static void main(String[] args) {
		
	
	car1 mycar1=new car1();
	System.out.println(mycar1.start());
	
	System.out.println(mycar1.stop());
	
	mycar1.accelerate(20);
	mycar1.slowDown(20);
	long longNumber[]= {122344,133567678,2233455};
	System.out.println(mycar1.getTotalDistance(longNumber));
	long distance1[]= {34455,75544,986758484};
	System.out.println(mycar1.getMaxDistance(distance1));

	
	}
	
	
}
