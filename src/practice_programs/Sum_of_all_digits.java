package practice_programs;

import java.util.Scanner;

public class Sum_of_all_digits {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(number!=0) {
			int r=number%10;
			 sum=sum+r;
			number=number/10;
		}
		System.out.println("sum of all digits is:"+sum);
			

	}

}
