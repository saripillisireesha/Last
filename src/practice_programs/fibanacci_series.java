package practice_programs;

import java.util.Scanner;

public class fibanacci_series {

	public static void main(String[] args) {
		int number;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		number=sc.nextInt();
		int n1=0,n2=1,n3=n1+n2;
		System.out.println(n1);
		System.out.println(n2);
		for(int i =2;i<=number;i++) {
			n3=n1+n2;

			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	

	}

}
