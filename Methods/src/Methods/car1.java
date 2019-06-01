package Methods;

import java.util.Arrays;

public class car1 {
	String make="Honda";
	String model="LX";
	String year="2019";
	//double currentSpeed=10;
	boolean isRunning=true;
	int currentSpeed=10;
 //*1 it has 5 attributes called make, model, year, currentspeed, isrunning
 //Type: String String int double boolean
 //it has few methods as below

 //1 start take no parameter and return nothing it will make isRunning =true
	public boolean start() {
		return isRunning;
 //2 stop take no parameter and return nothing it will make isRunning = false		
	}
	public boolean stop() {
		isRunning=false;
		return isRunning;
		//int speed[];
	}
 //3 accelerate will take 1 parameter as int as target speed
 //if you have a current speed of 10 and target speed of 20, it will print 10,11,12,13,14....20
	public void accelerate(int targetSpeed) {
		if(currentSpeed==10 && targetSpeed==20) {
			int sp=(targetSpeed-currentSpeed);
			for(int i=currentSpeed;i<=targetSpeed;i++) {
				System.out.print(i+",");
			}
		}
	}
  //4 Slowdown will take 1 parameter as int as targetSpeed
  //if you have current speed of 100 and target speed of 20, it will print 100,99,98,97....20	
	public void slowDown (int targetSpeed) {
		if(currentSpeed==100 && targetSpeed==20) {
			for(int j=100; j>=20; j--) {
				System.out.print(j+",");
			}
	     }
	}
	
 //*  5 getCarInfo will take no parameter and return make, model, year as one String
	
		public String getCarInfo() {
			
			return make+model+year;}
 //6 getDirection take 3 parameters and return nothing
 //inside method print the instruction turning left and turning right and turnign right according to the parameters
		boolean getDirection () {
			//	boolean turningLeft=tru
			
				
		
			
//7 getTotaldistance have 1 parameter as long array and it will return the sum of the long values.
		public long getTotalDistance (long[]number) {
			long sum=0;
			for(int i=0; i<number.length;i++) {
				sum+=number[i];			
			}
			return sum;
			
		}
//8 getMaxDistnace take 1 parameter as long array and it will return max distance. 	
		public long getMaxDistance(long[]distance){
			long maxDistance=0;
			for(int i=0;i<distance.length;i++) {
				if(distance[i]>maxDistance) {
					maxDistance=distance[i];
				}
				
			}
			
			
			return maxDistance;
			
		}
//9 removeLongestDistance take 1 parameter as long array
//--> sort the array and remove the longest distance and shortest distance
// and return new array without them
		public long removeLongDistance(long []myNum) {
			Arrays.sort(myNum);
			
			
			
			return newArray;
			
		}
		
		
		
		
		
}

			
			
			
		
		
	

	
	
		
	


