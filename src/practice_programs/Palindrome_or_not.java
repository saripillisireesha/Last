package practice_programs;

import java.util.Scanner;

public class Palindrome_or_not {

	public static void main(String[] args) {
		int number,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number =sc.nextInt();
		temp=number;

		while(number!=0){
			int rem=number%10;
			sum=sum*10+rem;
			number=number/10;
		}
		if(temp==sum) {
			System.out.println(sum+": is a palindrome number");
		}
		else {
			System.out.println(sum+"is not a palindrome number");
		}

	}

}
