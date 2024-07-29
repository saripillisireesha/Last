package arrays;

import java.util.Scanner;

public class Posneg {

	public static void main(String[] args) {
		int n,i,pos=0,neg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n =sc.nextInt();
		int arr[]=new int[10];
		System.out.println("enter the values");
		for(i=0;i<n;i++) {
			
arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
		if(arr[i]>0) {
			pos++;
		
		}
		else {
		neg++;
		}
		}
		System.out.println(pos);
		System.out.println(neg);
	}
}
