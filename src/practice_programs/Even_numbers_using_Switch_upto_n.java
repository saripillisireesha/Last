package practice_programs;

import java.util.Scanner;

public class Even_numbers_using_Switch_upto_n {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++) 
		switch(i%2) {
		case 0:
			System.out.println(i+" ");
			break;
		default:
			break;
			}
		
		

	}
}

