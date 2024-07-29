package arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which elemnts do you want");
		try {
		n=sc.nextInt();
		int arr[]=new int[10];
			System.out.println("enter elemnts");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
		
		
			System.out.println("reverse elemnts are");
			for(int i=n-1; i>=0;i--) {
				System.out.println(arr[i]);
			
		}}
	catch(Exception e) {
		System.out.println("enter the array limit is before 10");

	}
	}
}
