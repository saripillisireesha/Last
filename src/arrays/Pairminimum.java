package arrays;

import java.util.Scanner;

public class Pairminimum {
	public static void main(String[] args) {
		int n,i,j,diff=0,min=999,var1=0,var2=0;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter array size");
				n=sc.nextInt();
				System.out.println("enter numbers");
				int arr[]=new int[100];
				for( i=0;i<n;i++) {
					arr[i]=sc.nextInt();
				}
				for(i=0;i<n;i++) {
					for(j=1;j<n;j++) {
						diff=arr[i]-arr[j];
					
						if(diff<min) {
							var1=arr[i];
							var2=arr[j];
						min=diff;
						}
					}
					
					
				}
				System.out.println("minimum difference is:"+min+" "+"the pair is:"+var1+" "+var2);
					
				}
}
