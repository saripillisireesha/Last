package practice_programs;

import java.util.Scanner;

public class Sum_of_all_even_numbers {

	public static void main(String[] args) {
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		number=sc.nextInt();
		for(int i=0;i<=number;i=i+2) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
