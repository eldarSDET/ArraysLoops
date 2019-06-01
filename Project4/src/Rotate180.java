
public class Rotate180 {
	
	// 5 => 0,0 ==== 3,3  // 2 -- 1,0 --- 2,3 // 13 --2,0   1,3     //15 -- 3,0 -- 0,3
	// 1 => 0,1 ==== 3,2  // 4 -- 1,1---- 2,2 // 3--  2,1   1,2     // 14 3,1 -- 0,2
	// 9 => 0,2 ==== 3,1  // 8 -- 1,2---  2,1 // 6 -- 2,2   1,1    // 12 3,2 -- 0,1
	// 11 ==0,3 ==== 3,0  // 10 - 1-3 --  2, 0 // 7 -- 2,3   1,0    // 16 3,3 -- 0,0


	public static int[][] rotate180(int[][] nums) {
		int[][] returnArray = new int[nums.length][nums.length];
		int numsFirst = 0;
		int returnArrayfirst = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];

		}
		numsFirst++;
		returnArrayfirst--;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];

		}
		numsFirst++;
		returnArrayfirst--;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];
		}
		numsFirst++;
		returnArrayfirst--;
		for (int i = 0; i < nums.length; i++) {
			returnArray[returnArrayfirst][nums.length - (i + 1)] = nums[numsFirst][i];
		}

		return returnArray;
	}



}
