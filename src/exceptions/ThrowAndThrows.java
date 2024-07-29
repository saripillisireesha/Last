package exceptions;

public class ThrowAndThrows {
	static void m(){
		System.out.println("hiii hello");
		throw new ArithmeticException("here we rise an Exception");
	}

	public static void main(String[] args) {
		try {
			m();
		}
		catch(Exception e) {
			System.out.println("handle the exception");
			System.out.println(e);
		}
		
	}

}
