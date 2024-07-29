package practice_programs;

import java.util.Scanner;

public class Targetdigit_present {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		System.out.println("Enter a digit");
		int digit=sc.nextInt();
		boolean isthere=false;
		int r=0;
		while(number!=0) {
			r=number%10;
			if(r==digit) {
				isthere=true;
			}
			number=number/10;
		}
		if(isthere==true) {
			System.out.println("the target digit is presented in the number");
		}
		else {
			System.out.println("the target digit is presented in the number");

		}

	}

}
