package examples88;
public class methodChaining {
	public static void  main(String[] args){
		/*String a="abc";
		String b= a.toUpperCase();
		b=b.replace("B", "2").replace('C', '3');
		System.out.println("a="+a);
		System.out.println("b="+b);*/
		
        String world="Hello World";
		
		
		StringBuilder sb=new StringBuilder("Hello World");
		sb.append("Techtorial");
		System.out.println(sb);
		sb.reverse();
		String st=sb.toString();
		System.out.println(sb);
		
	
		
		
	}

}
