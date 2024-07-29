package practice_programs;

import java.util.Scanner;

public class Denomination {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
	int number=sc.nextInt();
	int thousand=0, fivehundred=0,hundred=0,fifty=0,twenty=0,ten=0,ones=0;
	if(number>=1000) {
		thousand=number/1000;
		number=number%1000;
	}
	if(number>=500) {
		fivehundred=number/500;
		number=number%500;
	}
	if(number>=100) {
		hundred=number/100;
		number=number%100;
		
	}
	if(number>=50) {
		fifty=number/50;
		number=number%50;
		
	}
	if(number>=20) {
		twenty=number/20;
		number=number%20;
		
	}
	if(number>=10) {
		ten=number/10;
		number=number%10;
		
	}
	if(number>=1) {
		ones=number/1;
	}
	System.out.println("thousand notes are:"+thousand);
	System.out.println("fivethousand notes are:"+fivehundred);
	System.out.println("hundred notes are:"+hundred);
	System.out.println("fifty notes are:"+fifty);
	System.out.println("twenty notes are:"+twenty);
	System.out.println("ten notes are:"+ten);
	System.out.println("one notes are:"+ones);
	}

}
