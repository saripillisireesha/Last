package arrays;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		int n,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n =sc.nextInt();		
	System.out.println("enter the values");
		int arr[]= new int[10];
		int temp;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for( int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
	}

}
}