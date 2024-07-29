package practice_programs;

import java.util.Scanner;

public class Occurences_in_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		System.out.println("Enter a digit");
		int digit=sc.nextInt();
		int count=0;
		while(number!=0) {
			int r=number%10;
			if(r==digit) {
				count++;  
			}
			number=number/10; 
		}
		System.out.println(count);

	}

}
