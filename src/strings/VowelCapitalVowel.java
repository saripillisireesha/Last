package strings;

import java.util.Scanner;

public class VowelCapitalVowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String str2="";
		int i;
		for(i=0;i<str.length();i++) {
			str2=str.toLowerCase();
			char ch=str2.charAt(i);
			if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
				System.out.print(Character.toUpperCase(ch));
			}
			else {
				System.out.print(ch);
			}
			
		}

		
		
		

	}

}
