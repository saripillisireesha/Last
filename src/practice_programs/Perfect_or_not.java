package practice_programs;

import java.util.Scanner;

public class Perfect_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
			sum=sum+i;
			}
			
		}
		if(sum==number) {
			System.out.println("is perfect number");
		}
		else {
			System.out.println("is not a perfect number");
			
		}
	}

}
