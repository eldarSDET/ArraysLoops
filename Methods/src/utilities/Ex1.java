package utilities;

public class Ex1 {
	public static void main(String[] args) {
		String text="Hello world, this is first reusable method";
		Ex1 myObject=new Ex1();
		myObject.print(text);
		String names="Eliza";
		myObject.print(text, names);
		int numbers[]= {123,432,544,554};
		myObject.print(text, numbers);
		int array1[]= {12,32,12,43,12};
		Ex1 example=new Ex1();
		example.printArray(array1);
		
		
	}
	public void print(String smthToPrintOut) {
		System.out.println(smthToPrintOut);
	}
	
	public void print(String smthToPrintOut, String names) {
		System.out.println(smthToPrintOut);
	}
	public void print(String smthToPrintOut, int []arr) {
		for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
		}
			
		System.out.println(smthToPrintOut);
	}
	
	public void print( int []numbers,String smthToPrintOut) {
		
		System.out.println(smthToPrintOut);
	}
	public void printArray (int []arr) {
		for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	
	}
}


