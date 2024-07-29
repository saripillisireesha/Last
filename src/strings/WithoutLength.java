package strings;

import java.util.Scanner;

public class WithoutLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		int i=0;
		for(char c:str.toCharArray()){
			i++;
		}
		
		System.out.println(i);

			
		

	}

}
