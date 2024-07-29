package strings;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		//String str2="";
		int i;
	
		System.out.print("after reverse the string is:");

		for(i=str.length()-1;i>=0;i--) 
			

			System.out.print(str.charAt(i));

		
	}

}
