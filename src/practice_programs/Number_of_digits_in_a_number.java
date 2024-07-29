package practice_programs;

import java.util.Scanner;

public class Number_of_digits_in_a_number {

	public static void main(String[] args) {
		int number,reverse=0,count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(number!=0) {
			int r=number%10;
			 reverse=reverse*10+r;
			number=number/10;
			count++;
		}
		System.out.println("number of digits in a given number is:"+count);
			

	}

}
