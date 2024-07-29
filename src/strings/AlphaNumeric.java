package strings;

import java.util.Scanner;

public class AlphaNumeric {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int alpha=0, numeric=0;
		System.out.println("Enter a string");
		String str=sc.nextLine();
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alpha++;
			}
			else if(ch>='0' && ch<='9'){
				numeric++;
			}
			else {
				int count=0;
			}
				
			}
		System.out.println("number of alphabets are:"+alpha);
		System.out.println("numbers are:"+numeric);


	}

}
