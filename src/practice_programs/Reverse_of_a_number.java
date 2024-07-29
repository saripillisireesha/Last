package practice_programs;

import java.util.Scanner;

public class Reverse_of_a_number {
public static void main(String[] args) {
	int number,reverse=0;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	number=sc.nextInt();
	while(number!=0) {
		int r=number%10;
		 reverse=reverse*10+r;
		number=number/10;
	}
	System.out.println("ther reverse of a given number is:"+reverse);
		
	}

}
