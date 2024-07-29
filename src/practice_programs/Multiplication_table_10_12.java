package practice_programs;

import java.util.Scanner;

public class Multiplication_table_10_12 {
	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=12;j++)
			System.out.println(i+"X"+j+"="+i*j);
		}

	}
}
