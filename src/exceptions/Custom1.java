package exceptions;

import java.util.Scanner;

class CustomException extends Exception {
	public CustomException(String str){
		super(str);
	}
}
	public class Custom1{
	public static void main(String[] args) throws Exception{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		n=sc.nextInt();
		try {
		if(n>18) {
			System.out.println("your eligible to vote");
		}
		else {
			throw new CustomException("Your not eligible to vote");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hello sireesha");

	}

}
