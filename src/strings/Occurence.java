package strings;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
	
		int i;
			int[] string=new int[150];
			char c=' ';
			for(i=0;i<str.length();i++) {
				c=str.charAt(i);
				string[c]++;
			}
			for(i=0;i<string.length;i++) {
				if(string[i]>0) {
					System.out.println("number of character "+(char) i+ "  occurances= "+string[i]);
					
					
				}
			

			}
	}

}
