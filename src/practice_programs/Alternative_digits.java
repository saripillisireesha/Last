package practice_programs;

import java.util.Scanner;

public class Alternative_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==1)
			{
			sum=sum+i;	
			}
		}
		System.out.print("sum of alternate num:"+sum)
		;

	}

}
