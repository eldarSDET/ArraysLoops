/**
 * 2.Write a for loop that writes out the decimal equivalent of the reciprocals 1/2, 1/3,
 * 1/4, ... , 1/19, 1/20.
 * вывести от 1/2 до 1/20
 * (for loop from 2 to 20)
 * Пример вывода:
 * 1/2 0.5
 * 1/3 0.33
 * 1/4 0.25
 * 1/20 0.05
 * @author Artem
 * @since 5/9/2019
 * **/

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		double num=1;
		for(int i=2; i<=20; i++) {
			
			System.out.println("1/"+i+"="+num/i);
			

		}
			   
	}

}
