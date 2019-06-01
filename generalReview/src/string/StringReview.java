package string;

import java.util.Scanner;

public class StringReview {
	public static void main(String[] args) {
		
		String name="Arslan";
		String studentName=new String("Muammer");
		System.out.println(name);
		System.out.println(studentName);
		System.out.println("5"+"9");
		System.out.println(1+6+"t"+"c"+1+6);
		//String conc= 1+6+"t"+"c"; 
		
		int i=10;
		String str="3";
		System.out.println(2+3+i+str); //153
		System.out.println(str+i+2+3);//31023
		
		
		int number12=0;
		number12+=2;//number12=number12+2;___> 2
		
		
		String schoolName="Techtorial";
	
		schoolName+=2019; //schoolName=schoolName+2019;--->Techtorial
		
	
		String success1 = "doingwhateverittakes";
		System.out.println(success1.toUpperCase());// DOINGWHAT
		
		
		
		String success2="hustling";
		success2.contentEquals("hustling");//true;
		boolean sc=success2.contentEquals("Hustling");
		System.out.println(sc); //false
		boolean cs1=success2.equalsIgnoreCase("HuStLing"); //truth
		
		String namert = "jjjj";
		System.out.println("c"+"t"+1+2);
		boolean jj = 10<6 | 3>1 && 7>4 | 8>10;
	
		System.out.println(jj);
		
		System.out.println(1+6+"t"+"c" +1+6);
		 int coutn=10;
		coutn++;
		 coutn=coutn++;
		 System.out.println(coutn);
		 
		 
		 String bname="computer";
		 bname="chair";
		 System.out.println(bname);
		 System.out.println(bname.concat("for school"));
		 System.out.println(bname);
		 bname=bname.concat("for school");
		 System.out.println(bname);
		 
		 
		 String carName="Lexus";
		 System.out.println(carName.length());
		 System.out.println("Toyota".length());
		 System.out.println("".length());
		 
		 System.out.println("Motorola".charAt(1));
		 char ch=65;
		 char ch1 = 'A';
		 System.out.println(ch);
		 System.out.println(ch1);
		 
		 
	
		 String success = "dotentimesmore";
		 System.out.println(success.substring(3));
		 System.out.println(success.substring(success.indexOf('m')));
		 
		 
		
	}

}
