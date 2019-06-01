package examples88;

public class MultiDimArray {
	public static void main(String[] args) {
		int numbers [][]= {
				{2,5,35},
				{5,3,56},
				{9,43,34}
		};
		
		for(int i=0; i<numbers[1].length;i++) {
			if((numbers[1][i]==5) || (numbers[1][i]==43)) {
				System.out.println(numbers[1][i]);
			}
			}
		for(int b=0; b<numbers[2].length;b++) {
			if (numbers[2][b]==34) {
				System.out.println(numbers[2][b]);
			}
		}
		
		int firstArray[][]= {{8,5,5,7,7},{12,43,21,13}};
		
		int secondArray[][]= {{30,32,12,12},{21},{4,2,4}};
		for (int y=0; y<secondArray[1].length;y++) {
			if(secondArray[1][0]==21) {
				System.out.println(secondArray[1][y]);
			}
			
		}
		
		
		
		
		
	}

}
