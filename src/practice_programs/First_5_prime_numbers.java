package practice_programs;

import java.util.Scanner;

public class First_5_prime_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int a=1, count=0;
		while(count<number) {
			int cc=0;
			for(int j=1;j<=a;j++) {
				if(a%j==0) {
					cc++;
				}
			}
			if(cc==2) {
				System.out.println(a);
				count++;
				}
			a++;
		
		}
	}

}
