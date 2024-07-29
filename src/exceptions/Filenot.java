package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filenot {

	public static void main(String[] args) throws Exception {
		try {
		FileReader f=new FileReader("siri123.txt");
f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		System.out.println("hello welcome to oracle");
	}

}
