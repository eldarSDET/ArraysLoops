package StringBuilder;

public class StrinBuilderReview {
	public static void main(String[] args) {
		String str="";
		
		for(char ch='a'; ch<='z'; ch++) {
			str+=ch;
			System.out.println(str);
		}
		
        StringBuilder strbl=new StringBuilder("");
		
		for(char ch='a'; ch<='z'; ch++) {
			strbl.append(ch);
			
		}
		System.out.println("StringBuilder--->"+strbl);
		StringBuilder builder=new StringBuilder("Techtorial ");
		builder.append(10);
		builder.append(" Academy ").append(2019).append(" ---> Muammer ").append(true);
		System.out.println(builder);
		
		StringBuilder success =new StringBuilder("Working hard ");
		success.append(" does not make you successful. ");
		
		StringBuilder truth=success.append("Thinking hard will make you successfull ");
		System.out.println(truth);
		System.out.println(success);
		
		StringBuilder person=new StringBuilder("Arslan");
		person.charAt(1);
		System.out.println(person.indexOf("s"));
		
		person.length();
		person.substring(1);
		person.substring(2,4);
		
		person.insert(2, "ch");
		System.out.println(person);
		person.replace(0, 2, "MM");
		System.out.println(person);
		
		person.delete(0,4);
		System.out.println(person);
		person.deleteCharAt(0);
		System.out.println(person);
		person.reverse();
		System.out.println(person);
		String name1=person.toString();//convert SB to String
		
		
		//.equals and ==-->
		//.equals metod wil compare the value 
		
		String city="Chicago";
		String city1=new String("Chicago");
		String city2=city1;
		
		System.out.println(city.equals(city1));//true
		System.out.println(city==city1);//false
		System.out.println(city1==city2);//true
		//.equals and == sign
		//for other object.equals method and == sign
		//will compare both object is pointing to same location or not
		
		StringBuilder build=new StringBuilder("Techtorial");
		StringBuilder build1=new StringBuilder("Techtorial");
		StringBuilder build2=build1;
		System.out.println(build.equals(build1));//false
		System.out.println(build==build1);//false
		System.out.println(build1.equals(build2));//true
		System.out.println(build1==build2);//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
