package methods;

import java.util.ArrayList;

public class Methods {
	
	/**
	 * Write a method that will accept an array as parameter
	 * and return max value from array.
	 * 
	 * for example:
	 * {3,9,55,73,99,2,10} -> return 99
	 * 
	 * @param arrays of numbers
	 * @return maximum value from array 
	 */
	public int maxNum(int[] arrays) {
		int largeNum=arrays[0];
		for(int i=0;i<arrays.length;i++) {
			if(arrays[i]>largeNum) {
				largeNum = arrays[i];
			}
		}
		return  largeNum;
	}
	
	/**
	 * Write a method that will accept one array as parameter and will remove duplicates
	 * and return will unique numbers inside
	 * 
	 * for example:
	 * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
	 * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
	 * 
	 * @param array of numbers
	 * @return array of unique numbers
	 * 
	 */
	public int[] removeDuplicates(int[] nums) {
		//code
		return new int[0];
	}
	
	/**
	 * Write a method that will accept two array as parameters and return one new array
	 * will all values that have two arrays.
	 * 
	 * For Example: 
	 * first array: {"java", "code","fun","nine"}
	 * second array: {"hustle","until","get","a job"}
	 * -> return {"java", "code","fun","nine","hustle","until","get","a job"}
	 * 
	 * 
	 * 
	 * @param array of String
	 * @param array of String
	 * @return combined two arrays to one array
	 */
	public String[] combineArrays(String[] array1, String[] array2) {
		//code
		return new String[0];
	}

	/**
	  * 
 	  * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion. 
	  * Your method should switch the order of the first two values, 
	  * then switch the order of the next two, switch the order of the next two, and so on. 
	  * 
	  * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
	  * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
	  *  
	  * Method that is using String[]
	  * @param Array
	  * @return switched pairs list
	  */
	public String[] switchPairs(String[] list){
		//code
		return new String[0];
	}
	
	/**
	 * 
	 * @param array of book pages
	 * @return page that is out of order; if all pages in the order return -1;
	 * 
	 * For example you given an array 
	 *  int[]pages={20,100,55,78,44,90}; -> method will return 55
	 *	int[]pages2={20,21,22,78,44,90};-> method will return 44
	 *  int[]pages3={20,21,22,78,84,90};-> method will return -1
	 */
	public int outOfOrder(int[] arr){
		//code
		return -1;
	}
	
	/**
	 * Given an array of integers, return indices of the two numbers,sum of which will be equal to a specific target number.
	 * You may assume that each input would have exactly one solution, 
	 * You can not use the same element twice.
	 * nums = [2, 7, 11, 15], target = 9, -> return [0, 1]
	 * nums = [5, 2, 4, 6, 3], target = 6, -> return [1, 2] 
	 * @param given an array of numbers nums
	 * @param target is a number sum of which you need to find
	 * @return an array of the indexes for the numbers from an array nums, sum of which will be equal to target
	 */
	public int[] twoSum(int[] nums, int target) {
		//code
	    return null;
	}
	
	/**
	 * Write a method that will accept array of integers as parameter
	 * and will return one long number of combined numbers.
	 * If the number is negative accept it as positive
	 * 
	 * For example:
	 * {2,66,3,90,1,-10} -> return int 266390110
	 * {0,34,5,3,8} -> return int 34538
	 * 
	 * @param array of numbers
	 * @return combined numbers of array
	 */
	public long combineNumbers(int[] numbers) {
		//code
		return -1;
	}
}
