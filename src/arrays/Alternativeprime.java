package arrays;

import java.util.Scanner;

public class Alternativeprime {

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
				for(i=0;i<n;i=i+2) {
					int count=0;
					for(int j=1;j<=arr[i];j++) {
						if(arr[i]%j==0) {
							count++;
							
						}
					}
						if(count==2) {
							System.out.println(arr[i]);
						
					}
					
				}

	}

}
