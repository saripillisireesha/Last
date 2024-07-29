package practice_programs;

import java.util.Scanner;

public class Number_of_occurences {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		
		for(int i=0;i<=9;i++) {
			int temp=number;
			int count=0;
			
			while(temp>0) {
			int rem=temp%10;
				if(rem==i) {
					count++;
				}
				temp=temp/10;
			}
			if(count>0) {
			System.out.println(i+ " occurences " + count);
			}
			}

	}

}
