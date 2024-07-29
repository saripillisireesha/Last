package arrays;

import java.util.Scanner;

public class Positionodd {

	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				n=sc.nextInt();
				System.out.println("enter numbers");
				int arr[]=new int[100];
				for( i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(i=0; i<n;i++) {
					if(arr[i]%2!=0 && i%2!=0) {
						System.out.println("odd number"+arr[i]);
						System.out.println("odd position of"+" "+arr[i] +"is"+" "+i);
					}
				}

	}

}
