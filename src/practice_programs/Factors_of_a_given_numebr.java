package practice_programs;

import java.util.Scanner;

public class Factors_of_a_given_numebr {

	public static void main(String[] args) {
		int number,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number=sc.nextInt();
		while(i<=number) {
			if(number%i==0) {
				System.out.println(i);
			}
			i++;
		}
		

	}

}
