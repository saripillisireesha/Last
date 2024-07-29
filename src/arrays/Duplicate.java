package arrays;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		n=sc.nextInt();
		System.out.println("enter the values");
		
		int arr[]=new int[100];
		for(i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			if(arr[i]==arr[j] && i>j) {
				break;
				
			}
		
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
				break;
			}
			}
			
	}
		
	}

}
