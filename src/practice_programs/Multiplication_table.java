package practice_programs;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		for(int i=1;i<=12;i++) {
			System.out.println(number+"X"+i+"="+number*i);
		}

	}

}

