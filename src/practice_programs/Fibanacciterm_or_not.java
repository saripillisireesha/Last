package practice_programs;

import java.util.Scanner;

public class Fibanacciterm_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int n1=0,n2=1,n3=n1+n2;
		while(n3<number){
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		if(number==n3) {
			System.out.println("is fibanacci term");
		}
		else {
			System.out.println("not fibanacci number");
		}

	}

}
