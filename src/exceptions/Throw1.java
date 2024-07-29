package exceptions;

public class Throw1 {

	public static void main(String[] args) {
		int n=-1;
		try {
		if(n<0) {
			throw new ArithmeticException("we cannot caluculte square whilw we using negative numbers");
		}
		else {
			System.out.println(n+"the square is"+n*n);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rets of the code");

	}

}
