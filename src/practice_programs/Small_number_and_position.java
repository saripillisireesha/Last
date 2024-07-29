package practice_programs;

import java.util.Scanner;

public class Small_number_and_position {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int min=number,rem=0,count=0,loc=0;
		while(number!=0) {
			rem=number%10;
			count++;
			if(rem<min) {
				min=rem;
				loc=count;
			}
			number=number/10;
		}
		System.out.println(min);
		System.out.println(loc);

	}

}
