package practice_programs;

import java.util.Scanner;

public class Second_highest_number {
	public static void main(String[] args) {

		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		int second_max=0,max=0;
		int r=0,rem1;
		int temp=number;
		while(number>0) 
		{
			
			r=number%10;
			if(r>max) {
				max=r;
			}
			number=number/10;
			
		}
		System.out.println(max);
			while(temp!=0)
			{
				rem1=temp%10;
				if(rem1>second_max && rem1<max)
				{
					second_max=rem1;
					
				}
				
				temp=temp/10;
			}
		
		System.out.println(second_max);
 }
}