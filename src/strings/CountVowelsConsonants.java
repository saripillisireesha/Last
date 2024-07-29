package strings;

import java.util.Scanner;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vow=0,con=0;
		System.out.println("Enter a String");
		String str=sc.nextLine();
		for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(ch=='a' || ch=='e'||ch=='i' ||ch=='o' || ch=='u' || ch=='A'|| ch=='E' || ch=='I' ||ch=='O' ||ch=='U') {
			vow++;
			
		}
		else if(ch==' ') {
			int count = 0;
		}
		else {
			con++;
		}
		}
		System.out.println("vowels are:"+vow);
		System.out.println("consonants are:"+con);
	}

}
