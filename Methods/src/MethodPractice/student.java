package MethodPractice;

public class student {
	int age=18;
	String name="Asiyat";
	String attendanceDate="08/01/2018";
	int classNumber=3;
	String address="2400 E Devon";
	
	public void printClass(String[]className) {
		int creditMath=3;
		int creditBio=2;
		int creditESL=2;
		int creditComputer=4;
		for(int i=0;i<className.length;i++) {
		
		
		if(className[i].equals("Math")) {
			System.out.println("Math credit is: "+creditMath);
		}
		else if(className[i].equals("Biology")) {
			System.out.println("Biology credit is: "+creditBio);
			
		}else if(className[i].equals("ESL")){
			System.out.println("ESL credit is: "+ creditESL);
		}else if(className[i].equals("Computer")) {
			System.out.println("Computer credit is: "+creditComputer);
		}
			
		}
	}
	//int [] dublicate={1,2,3,4,5,2,4,7,8,7}
	//temp={1,2,3,4,5,7,8}
	public int[] removeDublicate(int []dublicate) {
		int []temp=new int[dublicate.length];
		int count=0;
		boolean found=false;
		
		for(int i=0; i<dublicate.length;i++) {
			if(i==0) {
				temp[count++]=dublicate[i];
				//count=1
			}else {
				for(int k=0; k<count;k++) {
					if(temp[i]==dublicate[k]) {
						found=true;
					}
				}
			}if(!found) {
				temp[count++]=dublicate[i];
			}
			
		}
		
	
		
		return dublicate;
	
	



	}
	
		
	
	
	
	
	
	
	
	



}
