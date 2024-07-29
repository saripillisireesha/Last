package strings;

import java.util.Scanner;

public class EliminateSpecialCharactersNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String str2="";
		int i;
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)) {
				str2=str2+ch;
			}
		}
		System.out.println(str2);
	}

}
