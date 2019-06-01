package MethodPractice;

import java.util.Scanner;

public class NumbersTest {
	public static void main(String[] args) {
		Numbers num=new Numbers();
		num.checkAge(16);
		num.checkAge(18);
		num.checkAge(100);
		System.out.println(num.canAttendBoolean(15));
		System.out.println(num.canAttendBoolean(19));
		
		//System.out.println();
		
		Numbers organization=new Numbers();
		
		organization.checkName("Asiyat");
		organization.canAttend("Tima", 20);
		organization.canAttend("Tima", 15);
		organization.canAttend("Hima", 15);
		
		
		int []digits= {1,3,5,7,12,13,16,43};
		int []ages= {14,33,52,71,12,19,76,43,74,21,22,66,90};
		Numbers attendance=new Numbers();
		attendance.canAttend("Temurlan", 30);
		attendance.printNumber(digits);
		attendance.printNumber(ages);
		
		
		String[]sen= {"Pen", "Man", "Den"};
		attendance.checkString(sen);
		String[]names= {"Asiyat","Bella", "Eliza"};
		attendance.checkString(names);
		Scanner sc=new Scanner(System.in);
		num.checkAge(sc.nextInt());
		
		num.increaseNumber(10);
		
		Numbers home=new Numbers();
		home.checkName2("mggd");
		
		
	
	
	
	}

}
