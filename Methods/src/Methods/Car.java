package Methods;

public class Car {
	/*it has 5 attributes called make, model, year, currentspeed, isrunning
Type: String String int double boolean
it has few methods as below
1 start take no parameter and return nothing it will make isRunning =true
2 stop take no parameter and return nothing it will make isRunning = false
3 accelerate will take 1 parameter as int as target speed
		if you have a current speed of 10 and target speed of 20, it will print 10,11,12,13,14....20

4 Slowdown will take 1 parameter as int as targetSpeed
		//if you have current speed of 100 and target speed of 20, it will print 100,99,98,97....20
5 getCarInfo will take no parameter and return make, model, year as one String
6 getDirection take 3 parameters and return nothing
		//inside method print the instruction turning left and turning right and turnign right according to the parameters

*/
	
	
	String make="Honda";
	String model="LX";
	int year=2019;
	double currentSpeed=100;
	boolean isRunning=true;
	String type="Sedan";
	int doors=4;
	int windows=4;
	String color="black";
	boolean break1=false;
	
	int speed=100;
	int gear=4;
	int heat=20;
		
	public int increaseSpeed() {
		System.out.println(speed+15);
		return speed+15;
	}
	public int increaseGear() {
		System.out.println(gear+1);
		return gear+1;		
	}
	public int decreaseSpeed() {
		System.out.println(speed-20);
		return speed-20;
	}
	public int increaseHeat() {
		System.out.println(heat+30);
		
		return heat+30;		
	}
	public boolean stopCar() {
		//break1=false;
		System.out.println(break1);
		return break1;
	}

	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.make="Range Rover";
		myCar.model="Rx";
		myCar.color="white";
		
		myCar.increaseSpeed();
		myCar.increaseGear();
		myCar.decreaseSpeed();
		myCar.increaseHeat();
		myCar.stopCar();
		
		Car ElizasCar=new Car();
		//1 start take no parameter and return nothing it will make isRunning =true
		}
		public void start() {
			System.out.println(isRunning);
	    }
		
		
		//2 stop take no parameter and return nothing it will make isRunning = false
		//public void isRunningnew() {
		//	isRunning=false;
		}
		
		//3 accelerate will take 1 parameter as int as target speed
		//if you have a current speed of 10 and target speed of 20, it will print 10,11,12,13,14....20

}

