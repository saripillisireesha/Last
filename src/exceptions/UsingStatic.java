package exceptions;

public class UsingStatic {
	static int c=m1();
	static int a=20;
	static int b;
	static {
		System.out.println("static block is initailized");
		b=a*2;
	}
	static int m1() {
		System.out.println("hii");
		return 23;
	}

	public static void main(String[] args) {
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		System.out.println(c);
		

	}

}
