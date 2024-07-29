package practice_programs;

import java.util.Scanner;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number,fact=1;
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("The factorail number is:"+fact);
	}

}
