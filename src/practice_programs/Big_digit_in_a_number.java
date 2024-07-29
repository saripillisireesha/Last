package practice_programs;

import java.util.Scanner;

public class Big_digit_in_a_number {

	public static void main(String[] args) {
		int number, max=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(number!=0) {
			int r=number%10;
			if(r>max) {
				max=r;
			}
			number=number/10;
		}
		System.out.println(max);
	}

}
