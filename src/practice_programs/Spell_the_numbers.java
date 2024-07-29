package practice_programs;

import java.util.Scanner;

public class Spell_the_numbers {

	public static void main(String[] args) {
		System.out.println("0.zero 1.one 2.two 43.three 4.four 5.five 6.six 7.seven 8.eight 9.nine");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt(); 
		int rev=0;
		while(number>0) {
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		while(rev>number) {
			number=rev%10;
			rev=rev/10;
			switch(number) {
			case 0:System.out.println("zero");break;
			
			case 1:System.out.println("one");break;

			case 2:System.out.println("two");break;

			case 3:System.out.println("three");break;

			case 4:System.out.println("four");break;

			case 5:System.out.println("five");break;

			case 6:System.out.println("six");break;

			case 7:System.out.println("seven");break;

			case 8:System.out.println("eight");break;

			case 9:System.out.println("nine");break;
			
            default: System.out.println("Enter valid number");
			}
		}
	

	}

}
