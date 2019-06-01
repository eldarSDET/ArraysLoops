package methodsHomeworkPractice;
	public class myPractice {
		public static long factorial(int num) {
			int res=1;
			for(int i=1; i<=num; i++) {
				res*=i;
			}
			return res;
		}
			
	public static void main(String[] args) {
		//myPractice n=new myPractice();
		//n.factorial(4);
		System.out.println(myPractice.factorial(4));
	}

	

}
