package practice_programs;

import java.util.Scanner;

public class Calculator_program_using_switch {

	public static void main(String[] args) {
		int number;
		System.out.println("1.add 2.sub 3.mul 4.div 5.mod");

		Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter the number");
		number=sc.nextInt();
		
		System.out.println("Enter a value");
		double a=sc.nextInt();
		System.out.println("Enter b value");
		double b=sc.nextInt();

		switch(number) {
		case 1:
			System.out.println("Addition is:"+(a+b));
			break;
		case 2:
			System.out.println("subtraction is:"+(a-b));
			break;
		case 3:
			System.out.println("Multiplication is:"+(a*b));
			break;
		case 4:
				System.out.println("Division is:"+(a/b));
			break;	
		case 5:
					System.out.println("modulus is:"+(a%b));
			break;
			default:
				System.out.println("enter valid number");
		}

	}

}
