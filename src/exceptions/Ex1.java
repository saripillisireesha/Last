package exceptions;

public class Ex1 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int c=a+b;
		System.out.println(c);
		try {
			int d=a/b;
			System.out.println(d);
		}
		catch(Exception e) {
			System.out.println("we cannot divide the number by zero"+e);
		}
		int f=a-b;
		System.out.println(f);
	}

}
