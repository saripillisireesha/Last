package arrays;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		int target,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size");
		int number=sc.nextInt();
		System.out.println("enter one target");
		target =sc.nextInt();
		int arr[]=new int[100];
		System.out.println("enter elements");
		for(int i=0;i<number;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==target) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("the target digit is presented in the number");
		}
		else {
			System.out.println("the target digit not is presented in the number");

		

	}

	}

}
