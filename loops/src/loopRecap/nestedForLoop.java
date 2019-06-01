package loopRecap;

public class nestedForLoop {
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			System.out.print("i: "+i+"->");
			for(int i2=0; i2<=10; i2++) {
				System.out.print(i2+" ");
				//if(i2==3) {
				//	break;
				//}
			}
			System.out.println();
		}
	}

}
