package strings;

import java.util.Scanner;

public class SeparateVowelConsonants {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[] vow=new char[str.length()];
		char[] con=new char[str.length()];
	
		for(int i=0;i<=str.length()-1;i++) {
		char ch=str.charAt(i);
		if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A'|| str.charAt(i)=='E' || str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U') {
			vow[i]=str.charAt(i);
		}
		else if(ch==' ') {
			int count = 0;
		}
		else {
			con[i]=str.charAt(i);
		}
		}
		String vow1=String.valueOf(vow);
		String cons=String.valueOf(con);

		System.out.println("{"+vow1+"}");
		System.out.println("{"+cons+"}");  
		

	}

}
