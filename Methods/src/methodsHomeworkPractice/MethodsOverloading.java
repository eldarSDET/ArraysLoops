package methodsHomeworkPractice;

import utilities.ArrayManip;

public class MethodsOverloading {
	public static void main(String[] args) {
		int[]numbers= {342,54354,2344,4565};
		int[]numbers2= {3423,9054,244,4365};
		int[]numbers3= {3428,5445,44,7665};
		int[]numbers4= {3424,543,2344,9965};
		MethodsOverloading arr=new MethodsOverloading();
		//System.out.println(arr.getAvgeOfArray(numbers));
		System.out.println(arr.getDivided(numbers3));
		System.out.println(arr.getIn1Line(numbers4));
		
		
	}
		public int getAvgeOfArray(int intArray[]) {
			
			int sum=0;
			for(int i=0; i<intArray.length;i++) {
				
				sum+=intArray[i];}
			
				return sum/intArray.length;
			}
		
   
        public int getAvgeOfArray(int intArray[],int num) {
	
	      int sum=0;
	      for(int i=0; i<intArray.length;i++) {
		
		      sum+=intArray[i]+num;
		      }
	
		       return sum/intArray.length;
	     }
		//sum of first 3 elements of numbers2
			public int getSum(int intArray[]) {
				int sum=0;
			
				for(int i=0; i<intArray.length;i++) {
					sum+=intArray[i];
					if(i==2) {
						break;
					}
				}
					return sum;
				}
				
			//divide all elements from numbers3
			
			public double getDivided(int[]arr_) {
				double res=arr_[0];
				for(int n:arr_) {
					res/=n;
				}
			return res;
			}
			
			//print it out in a single line
			
			public String getIn1Line(int[]arr) {
				String str="";
				for (int num: arr) {
					str+=num;
				}
				return str;
			}
				public String getIn1Line(int[]arr, String text) {
					String str="";
					for (int num: arr) {
						str+=num;
					}
					return str+text;	
				
				
 //overload methods in this class;
//add for loop helper method and replace for loops in the class
//create separate class and method in it to count letter in any string (don't use any string length () method
			
		
}




}
