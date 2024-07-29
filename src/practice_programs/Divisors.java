package practice_programs;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int max=0,value=0;
		for(int i=1;i<=number;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;

			}}
				if(count>max) {
					max=count;
					value=i;
				}
					}
			System.out.println(max);
			System.out.println(value);

		
	}

}
