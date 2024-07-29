package arrays;

import java.util.Scanner;

public class Threedigitreverse {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers");

		n=sc.nextInt();
		if(n>=1000) {
			throw new ArithmeticException("enter before 1000 values only");
		}
		else {
			int arr[]=new int[100];
			
			for(i=0;i<3;i++) {         
				int r=n%10;
				arr[i]=r;
				n=n/10;
				
			}
			for(i=0; i<3;i++) {
				System.out.print(arr[i]);
				
			}
		}
	
		
	}

}
