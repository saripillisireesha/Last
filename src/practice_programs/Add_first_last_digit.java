package practice_programs;

import java.util.Scanner;

public class Add_first_last_digit {
	public static void main(String[] args) {

	int number;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number");
	number=sc.nextInt();
	int first_digit=number;

	while(first_digit>=10) {
		first_digit=first_digit/10;
	}
	System.out.println(first_digit);

		int lastdigit=number%10;
		
		int sum=first_digit+lastdigit;
	System.out.println(sum);
	
}
}