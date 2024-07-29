package arrays;

import java.util.Scanner;

public class Oddposition {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an array size");
		n =sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the values");
		for(i=0;i<n;i++) {	
arr[i]=sc.nextInt();

	}
		for(i=0;i<n;i++) {
			if(i%2!=0) {
				System.out.println("odd positions are:"+arr[i]);
			}
		}
	}
}
