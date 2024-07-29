package exceptions;

public class Throws1 {

	public static void main(String[] args) throws Exception{
		int a=10;
		int b=0;
		try {
		int di=a/b;
		System.out.println(di);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
