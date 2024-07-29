package practice_programs;

import java.util.Scanner;

public class Digits_in_number_equal_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int c=0,c1=0;
		int digit =n%10;
		while(n!=0) {
			int current_digit=n%10;
			c++;
			n=n/10;
			if(current_digit==digit) {
				c1++;
			}
			
		}
		if(c==c1) {
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
		

	}

}
