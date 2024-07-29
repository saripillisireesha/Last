package arrays;

import java.util.Scanner;

public class Ascndingdesendingdisorder {

	public static void main(String[] args) {
		int n,i,asc=0,dsc=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				n=sc.nextInt();
				System.out.println("enter numbers");
				int arr[]=new int[100];
				for( i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(i=0;i<n-1;i++) {
					if(arr[i]<arr[i+1]) {
						asc++;
					}
					else if(arr[i]>arr[i+1]) {
						dsc++;
					}
				}
				if(asc==(n-1)) {
					System.out.println("ascending order");
				}
				else if(dsc==(n-1)) {
					System.out.println("descending order");
				}
				else {
					System.out.println("disorder");
				}

	}

}
