package projectsPractice;

public class occurance {
	String name="Asiyat";
	String letter="";
	int count[]=new int[256];
	int len=name.length();
	
	for(int i=0;i<len;i++) {
		count[name.charAt(i)]++;}
	
	char ch[]=new char[name.length()];
	for(int i=0; i<len; i++) {
		ch[i]=name.charAt(i);
		int find=0;
		for(int j=0; j<=i; j++) {
			if(name.charAt(i)==ch[j])
				find++;
		
	}if (find==1)
		System.out.println("Number of occurence of "+
				name.charAt(i)+ " is:"+ count[name.charAt(i)]);
	}
	 
}


}
