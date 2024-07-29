package practice_programs;

import java.util.Scanner;

public class Characters_from_a_to_z {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a or A");
		char c=sc.next().charAt(0);
		for(int i=65; i<=90;i++) {
			System.out.println(c+"");
			c++;
		}

	}

}
