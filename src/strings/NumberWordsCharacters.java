package strings;

import java.util.Scanner;

public class NumberWordsCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		int count=0, word=1;
		System.out.println("Enter a string");
		String str=sc.nextLine();
		//String str=st.trim();
		
		for(int i=0; i<str.length();i++) {
			
			count++;

			
			}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				word++;
			}

		}
		   System.out.println("number of characters are:"+count);                                                                              
		System.out.println("number of words are:"+word);

	}

	

}
