package arrays;

import java.util.Scanner;

public class Occurences {
	public static void main(String[] args) {

		int n,i,j;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				n=sc.nextInt();
				System.out.println("enter numbers");
				//int existed=0;
				int arr[]=new int[100];
			
				for( i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(i=0;i<n;i++) {
					int count=0;

					for(j=0;j<n;j++) {
						
						if(arr[i]==arr[j]) {
						count++; 
						}
					}
					
						for(j=0;j<n;j++) {
						if(arr[i]==arr[j] && i>j) {
							break;	
						}
						
						
						if(arr[i]==arr[j]) {
							System.out.println(arr[i]+" "+count);
							break;
						}
						
}

	}
					
					}
}			
	
