package arrays;

import java.util.Scanner;

public class Biggestlocation {

	public static void main(String[] args) {
		int n,max=0,i,count=0,loc=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				n=sc.nextInt();
				System.out.println("enter numbers");
				int arr[]=new int[100];
				for( i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(i=0;i<n;i++) {
					count++;
				if(arr[i]>max) {
					max=arr[i];
					loc=count;
				}
				
				}
				System.out.println("biggest number is:"+max);
				System.out.println("biggest number location is:"+loc);
	}

}

