package practice_programs;

import java.util.Scanner;

public class Prime_number_between_1_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
	
		for(int i=2;i<=number;i++) {
			int c=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
				
				}
			if(c==2) {
				System.out.println(i);
				}

			}

		}

	}


