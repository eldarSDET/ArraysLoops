import java.util.Arrays;

public class TurnTheImage90Left {
	public static void main(String[] args) {
		int [][]nums1= {{5,1,9,11},
			            {2,4,8,10},
			            {13,3,6,7},
			            {15,14,12,16}};
		System.out.println(Arrays.deepToString(nums1));
		System.out.println(Arrays.deepToString(turnLeft90(nums1)));
		
	//11,10,7,16    5==>0,0==3,0       2==>1,0==3,1      13==>2,0==3,2   
	// 9,8,6,12     1==>0,1==2,0       4==>1,1==2,1       3==>2,1==2,2
	// 1,4,3,14     9==>0,2==1,0       8==>1,2==1,1      6 ==>2,2==1,2
	// 5,2,13,15   11==>0,3==0,0      10==>1,3==0,1      7===>2,3==0,2
		
	}
		public static int [][]turnLeft90(int nums[][]){
		int[][]newArray=new int[nums.length][nums.length] ;
		int newIndex=0; //++	
		
		for(int i=0; i<nums.length;i++) {			
			newArray[nums.length - (i + 1)][newIndex]=nums[newIndex][i];//  3,0==0,0
		}
		newIndex++;
		for(int i=0; i<nums.length;i++) {
		
			newArray[nums.length - (i + 1)][newIndex]=nums[newIndex][i];//
		}
		newIndex++;
		for(int i=0; i<nums.length;i++) {
		
			newArray[nums.length - (i + 1)][newIndex]=nums[newIndex][i];
		}
		newIndex++;
		for(int i=0; i<nums.length;i++) {
			
			newArray[nums.length - (i + 1)][newIndex]=nums[newIndex][i];
		}
	return newArray;

}}




