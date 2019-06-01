package examples88;

import java.util.Arrays;

/**Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]**/

public class CodingBat {
	
	
	public  int[] maxEnd3 (int[] nums) {
		  Arrays.sort(nums);
		 
		  
		  
		return nums;
	
		
	}
	public static void main(String[] args) {
		
		int n[]= {3,6,2};
		Arrays.parallelSort(n);
		int n1[]=new int[n.length];
		n1[n.length]=n[n.length-1];
		System.out.println(Arrays.toString(n1));
		
				
			
		
				
	}
		
	
	

}
