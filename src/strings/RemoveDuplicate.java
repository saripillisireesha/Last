package strings;

import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		boolean t=false;
		for(int i=0; i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i>j) {
					break;
				}
				if(str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(i));
					break;
				}
			}
			
			
			
		}
	}

}
