package strings;

import java.util.Scanner;

public class CompareTwoStringsWithoutCompareToMethod {
	public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string");
	String str=sc.nextLine();
	System.out.println("enter second string");
	String str1=sc.nextLine();

	String str2="";
	int i;
	for(i=0;i<str.length();i++) {
		for(int j=0;j<str.length();j++) {
			
			if(str.charAt(i)==str1.charAt(j)) {
				str=str1;
			}
			else {
				str2=str1;
			}
			

		}
		System.out.println(str);


	}
System.out.println(str2+":not equal");
				
		
	}
}
