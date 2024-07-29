package arrays;

import java.util.Scanner;

public class Alternative {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size which elemnts do you want");
		n=sc.nextInt();
		int arr[]=new int[100];
		for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
