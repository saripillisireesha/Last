package arrays;

import java.util.Scanner;

public class Numberoccurence {

	public static void main(String[] args) {
		int n,r,i,digit,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		System.out.println("Enter digit");
		digit=sc.nextInt();

		int arr[]=new int[100];
		for(i=0;i<4;i++) {
			r=n%10;
				if(digit==r) {
					temp++;
				}
				n=n/10;
		}
	

		if(temp>0) {
		System.out.println(arr[i]+" "+temp);
		}
		
	}

}
