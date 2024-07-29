package exceptions;

public class NestedTry {

	public static void main(String[] args) {
		try {
			int x=10;
			int y=20;
			int z=x+y;
			System.out.println(z);
			try {
				int a=10;
				int b=0; 
				int c=a/b;
				System.out.println(c);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				int arr[]= {1,2,5,7,54};
				System.out.println(arr[10]);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
